package br.ufv.caf.eleicaoreitorufv2022.controle;

import br.ufv.caf.eleicaoreitorufv2022.entidade.Candidato;
import br.ufv.caf.eleicaoreitorufv2022.entidade.Eleitor;
import br.ufv.caf.eleicaoreitorufv2022.entidade.excecao.ExcecaoEleitorInvalido;
import br.ufv.caf.eleicaoreitorufv2022.entidade.excecao.ExcecaoEleitorJaVotou;
import java.util.ArrayList;

public class ControleEleicao {

    private ArrayList<Candidato> candidatos;
    private int quantidadeNulos;
    private ArrayList<Eleitor> eleitores;
    
    
    public ControleEleicao(){        
        candidatos 
            = new ArrayList<Candidato>();
        eleitores = new ArrayList<Eleitor>();
        quantidadeNulos = 0;
    }
       
    public void addCandidato(Candidato c){
        candidatos.add(c);
    }
    
    public void addEleitor(Eleitor e){
        eleitores.add(e);
    }   
    
    public void votar(String matricula, int voto) 
                        throws ExcecaoEleitorInvalido, ExcecaoEleitorJaVotou{
        
        Eleitor e = buscarEleitor(matricula);
        if(e == null){
            throw new ExcecaoEleitorInvalido();
        }
        
        if(!e.isAptoVotar()){
            throw new ExcecaoEleitorJaVotou();
        }
        
        boolean valido = false;
        for(Candidato c : candidatos){                
            if(voto == c.getNumero()){
                c.incrVotos();
                valido = true;
                break;
            }
        }

        if(!valido){
            quantidadeNulos++;
        }                    
    }
    
    public String geraBoletim(){
        String boletim = "";
        for(int i=0; i<candidatos.size(); i++){
            boletim += candidatos.get(i).toString();            
            boletim += "\n##################\n";
        }   
        return boletim;
    }   
    /**
     * 
     * @return numero candidato vencedor,
     * ou -1 se empate
     */
    
    public Candidato apuracao(){
        int indiceVencedor = 0;
        boolean empate = false;
        for(int i=1; i<candidatos.size(); i++){
            if(candidatos.get(i).getVotos() > candidatos.get(indiceVencedor).getVotos()){
                indiceVencedor = i;
                empate = false;
            }else if(candidatos.get(i).getVotos() ==
                        candidatos.get(indiceVencedor).getVotos()){
                empate = true;                
            }
        }
   
        // TODO 
        System.out.println("Votos nulos: "+quantidadeNulos);
        
        if(empate){
            return null;
        }else{
            return candidatos.get(indiceVencedor);
        }        
    }

    private Eleitor buscarEleitor(String matricula) {
        for(Eleitor e : eleitores){
            if(e.getMatricula().equals(matricula)){
                return e;
            }
        }
        return null;
    }
}

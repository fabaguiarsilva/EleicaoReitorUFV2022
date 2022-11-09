package br.ufv.caf.eleicaoreitorufv2022.controle;

import br.ufv.caf.eleicaoreitorufv2022.entidade.Candidato;
import br.ufv.caf.eleicaoreitorufv2022.entidade.Eleitor;
import br.ufv.caf.eleicaoreitorufv2022.entidade.excecao.*;
import br.ufv.caf.eleicaoreitorufv2022.persistencia.DAO;
import java.util.ArrayList;

public class ControleEleicao {
    private int quantidadeNulos;
    
    private DAO<Candidato> candidatos;    
    private DAO<Eleitor> eleitores;
    
    
    public ControleEleicao(){        
        candidatos 
            = new DAO<Candidato>();
        eleitores = new DAO<Eleitor>();
        quantidadeNulos = 0;
    }
       
    public void addCandidato(Candidato c) throws ExcecaoMatriculaInvalida {
        candidatos.add(c);
    }
    
    public void addEleitor(Eleitor e) throws ExcecaoMatriculaInvalida  {
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

        for(Candidato c : candidatos.getAll()){                
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
        ArrayList<Candidato> listaCandidatos = candidatos.getAll();
        for(int i=0; i<listaCandidatos.size(); i++){
            boletim += listaCandidatos.get(i).toString();            
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
        ArrayList<Candidato> listaCandidatos = candidatos.getAll();
        for(int i=1; i<listaCandidatos.size(); i++){
            if(listaCandidatos.get(i).getVotos() > listaCandidatos.get(indiceVencedor).getVotos()){
                indiceVencedor = i;
                empate = false;
            }else if(listaCandidatos.get(i).getVotos() ==
                        listaCandidatos.get(indiceVencedor).getVotos()){
                empate = true;                
            }
        }
   
        // TODO 
        System.out.println("Votos nulos: "+quantidadeNulos);
        
        if(empate){
            return null;
        }else{
            return listaCandidatos.get(indiceVencedor);
        }        
    }

    private Eleitor buscarEleitor(String matricula) {
        return eleitores.find(matricula);
    }
}

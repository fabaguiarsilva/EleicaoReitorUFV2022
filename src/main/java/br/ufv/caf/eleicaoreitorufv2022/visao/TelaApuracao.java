package br.ufv.caf.eleicaoreitorufv2022.visao;

import br.ufv.caf.eleicaoreitorufv2022.controle.ControleEleicao;
import br.ufv.caf.eleicaoreitorufv2022.entidade.Candidato;

public class TelaApuracao {

    private ControleEleicao controle;
    
    public TelaApuracao(ControleEleicao controle){
        this.controle = controle;
    }
    
    public void mostrarBoletim(){
        String boletim = controle.geraBoletim();
        System.out.println("Boletim da Eleiçõa: \n"+boletim);
    }
    
    public void apurar(){
        Candidato vencedor = controle.apuracao();
        if(vencedor != null){
                System.out.println("O vencedor foi o "
                + vencedor.toString());

        }else{
            System.out.println("Empate!");
        }
    }       
}

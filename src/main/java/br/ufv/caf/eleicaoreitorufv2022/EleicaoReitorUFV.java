package br.ufv.caf.eleicaoreitorufv2022;

import br.ufv.caf.eleicaoreitorufv2022.controle.ControleEleicao;
import br.ufv.caf.eleicaoreitorufv2022.entidade.Candidato;
import br.ufv.caf.eleicaoreitorufv2022.entidade.Eleitor;
import br.ufv.caf.eleicaoreitorufv2022.visao.TelaApuracao;
import br.ufv.caf.eleicaoreitorufv2022.visao.TelaVotacao;

public class EleicaoReitorUFV {
    
    public static void main(String[] args) {

        ControleEleicao eleicaoUFV = new ControleEleicao();

        eleicaoUFV.addCandidato
            (new Candidato("Candidato 1",1));
 
        eleicaoUFV.addCandidato
            (new Candidato("Candidato 2",92));

        eleicaoUFV.addCandidato
            (new Candidato("Candidato 3",3));
         
        eleicaoUFV.addEleitor
            (new Eleitor("Aluno 1", 1));
        
        eleicaoUFV.addEleitor
            (new Eleitor("Aluno 2", 2));

        eleicaoUFV.addEleitor
            (new Eleitor("Aluno 3", 3));

        eleicaoUFV.addEleitor
            (new Eleitor("Aluno 4", 4));
        
        TelaVotacao telaVotacao = new 
                            TelaVotacao(eleicaoUFV);
        telaVotacao.iniciarVotacao();
        
        TelaApuracao telaApuracao = new
                TelaApuracao(eleicaoUFV);
        telaApuracao.mostrarBoletim();
        telaApuracao.apurar();
        
        
    }
}

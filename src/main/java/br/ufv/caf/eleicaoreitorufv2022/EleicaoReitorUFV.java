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
            (new Candidato("Candidato 1","1111", "Computação", 1));
 
        eleicaoUFV.addCandidato
            (new Candidato("Candidato 2","2222", "Quimica", 92));

        eleicaoUFV.addCandidato
            (new Candidato("Candidato 3","3333", "Computação",3));
         
        eleicaoUFV.addEleitor
            (new Eleitor("Aluno 1", "EF12345", "Computação"));
        
        eleicaoUFV.addEleitor
            (new Eleitor("Aluno 2", "EF23456", "Computação"));

        eleicaoUFV.addEleitor
            (new Eleitor("Aluno 3", "EF34567", "Eng. Alimentos"));

        eleicaoUFV.addEleitor
            (new Eleitor("Aluno 4", "EF45678", "Física"));
        
        TelaVotacao telaVotacao = new 
                            TelaVotacao(eleicaoUFV);
        telaVotacao.iniciarVotacao();
        
        TelaApuracao telaApuracao = new
                TelaApuracao(eleicaoUFV);
        telaApuracao.mostrarBoletim();
        telaApuracao.apurar();
        
        
    }
}

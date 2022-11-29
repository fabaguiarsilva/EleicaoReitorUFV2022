package br.ufv.caf.eleicaoreitorufv2022.visao;

import br.ufv.caf.eleicaoreitorufv2022.controle.ControleEleicao;
import br.ufv.caf.eleicaoreitorufv2022.entidade.excecao.ExcecaoEleitorInvalido;
import br.ufv.caf.eleicaoreitorufv2022.entidade.excecao.ExcecaoEleitorJaVotou;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class TelaVotacao {
    private static final Logger LOGGER = Logger.getLogger("br.ufv.caf.eleicao");
    private Scanner scan;
    private ControleEleicao controle;
    
    public TelaVotacao(ControleEleicao controle){
        scan = new Scanner(System.in);
        this.controle = controle;
    }
    
    private void votar() {
        System.out.println("Digite sua matricula: ");
        String matricula = scan.next();       
        
        System.out.println("Digite seu voto: ");
        int voto = scan.nextInt();
                
        try{
            controle.votar(matricula, voto);
        }catch(ExcecaoEleitorInvalido ei){
            LOGGER.error(ei.getMessage());                    
            System.err.println(ei.getMessage());
        }catch(ExcecaoEleitorJaVotou ev){            
            LOGGER.error(ev.getMessage());
            System.err.println(ev.getMessage());            
        }        
    }
    
    public void iniciarVotacao(){
        while(true){
            System.out.println("MENU: 0) SAIR; 1) VOTAR;");            
            int opcao = scan.nextInt();
            switch(opcao){
                case 0:
                    return;
                case 1:
                    votar();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }            
        }
    }    
}

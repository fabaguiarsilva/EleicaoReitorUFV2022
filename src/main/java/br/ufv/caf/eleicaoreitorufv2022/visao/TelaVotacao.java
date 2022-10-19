package br.ufv.caf.eleicaoreitorufv2022.visao;

import br.ufv.caf.eleicaoreitorufv2022.controle.ControleEleicao;
import java.util.Scanner;

public class TelaVotacao {
    
    private Scanner scan;
    private ControleEleicao controle;
    
    public TelaVotacao(ControleEleicao controle){
        scan = new Scanner(System.in);
        this.controle = controle;
    }
    
    private void votar(){
        System.out.println("Digite sua matricula: ");
        int matricula = scan.nextInt();       
        
        System.out.println("Digite seu voto: ");
        int voto = scan.nextInt();
                
        //TODO Votar??
        controle.votar(voto);
        
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

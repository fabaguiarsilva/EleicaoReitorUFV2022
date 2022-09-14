package br.ufv.caf.eleicaoreitorufv2022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fabriciosilva
 */
public class Principal {
    
    public static void main(String[] args) {
        
        String[] nomesCandidatos = 
        {"Candidato 1","Candidato 2","Candidato 3"};

        int[] numerosCandidatos = {1,92,3};
            
        String[] nomesEleitores = {
            "Aluno 1","Aluno 2","Aluno 3","Aluno 4"
        };
    
        int[] quantidadeVotos = {0,0,0};

        Scanner scan = new Scanner(System.in);
        for(int i=0; i<nomesEleitores.length; i++){
            System.out.println("Voto do eleitor "+nomesEleitores[i]);
            int voto = scan.nextInt();
            //verifica se voto é válido
            for(int j=0;j<numerosCandidatos.length;j++){
                if(voto == numerosCandidatos[j]){
                    quantidadeVotos[j]++;
                }
            }                        
        }
        for(int i=0; i<quantidadeVotos.length; i++){
            System.out.println("Candidato "
                    +nomesCandidatos[i]+ " com "+
                    quantidadeVotos[i]+" votos!");
        }
        
    }

}

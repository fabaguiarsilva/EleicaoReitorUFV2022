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
        int quantidadeNulos = 0;
        boolean valido = false;
        
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<nomesEleitores.length; i++){
            System.out.println("Voto do eleitor "+nomesEleitores[i]);
            int voto = scan.nextInt();
            //verifica se voto é válido
            valido = false;
            for(int j=0;j<numerosCandidatos.length;j++){                
                if(voto == numerosCandidatos[j]){
                    quantidadeVotos[j]++;
                    valido = true;
                    break;
                }
            }
            
            if(!valido){
                quantidadeNulos++;
            }
            
        }
        for(int i=0; i<quantidadeVotos.length; i++){
            System.out.println("Candidato "
                    +nomesCandidatos[i]+ " com "+
                    quantidadeVotos[i]+" votos!");
        }
        
        
        int indiceVencedor = 0;
        for(int i=1; i<quantidadeVotos.length; i++){
            if(quantidadeVotos[i] > quantidadeVotos[indiceVencedor]){
                indiceVencedor = i;
            }
        }
        
        System.out.println("Votos nulos: "+quantidadeNulos);
        
        System.out.println("O vencedor foi o"
                + "candidato "+nomesCandidatos[indiceVencedor]+""
                        + " com "+quantidadeVotos[indiceVencedor]+""
                                + " votos");
        
        
    }

}

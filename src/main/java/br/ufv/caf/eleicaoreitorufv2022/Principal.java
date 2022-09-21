package br.ufv.caf.eleicaoreitorufv2022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fabriciosilva
 */
public class Principal {
    
    public static void main(String[] args) {

        ArrayList<Candidato> candidatos 
                = new ArrayList<Candidato>();
        
        Candidato c1 = new Candidato(
                "Candidato 1",1);
        candidatos.add(c1);
        
        candidatos.add(new Candidato("Candidato 2",92));
        candidatos.add(new Candidato("Candidato 3",3));        
            
        String[] nomesEleitores = {
            "Aluno 1","Aluno 2","Aluno 3","Aluno 4"
        };
    

        int quantidadeNulos = 0;
        boolean valido = false;
        
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<nomesEleitores.length; i++){
            System.out.println("Voto do eleitor "+nomesEleitores[i]);
            int voto = scan.nextInt();
            //verifica se voto é válido
            valido = false;
            for(int j=0;j<candidatos.size();j++){                
                if(voto == candidatos.get(j).numero){
                    candidatos.get(j).votos++;
                    valido = true;
                    break;
                }
            }
            
            if(!valido){
                quantidadeNulos++;
            }
            
        }
        for(int i=0; i<candidatos.size(); i++){
            System.out.println("Candidato "
                    +candidatos.get(i).nome+ " com "+
                    candidatos.get(i).votos+" votos!");
        }
        
        
        int indiceVencedor = 0;
        boolean empate = false;
        for(int i=1; i<candidatos.size(); i++){
            if(candidatos.get(i).votos > candidatos.get(indiceVencedor).votos){
                indiceVencedor = i;
                empate = false;
            }else if(candidatos.get(i).votos ==
                        candidatos.get(indiceVencedor).votos){
                empate = true;                
            }
        }
        
        
        System.out.println("Votos nulos: "+quantidadeNulos);
        if(empate){
            System.out.println("Empate! ");
        }else{
            System.out.println("O vencedor foi o"
                + "candidato "+candidatos.get(indiceVencedor).nome+""
                        + " com "+candidatos.get(indiceVencedor).votos+""
                                + " votos");
        }        
    }
}

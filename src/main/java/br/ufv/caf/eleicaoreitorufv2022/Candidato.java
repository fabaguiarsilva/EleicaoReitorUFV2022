package br.ufv.caf.eleicaoreitorufv2022;

public class Candidato {
    String nome;
    int numero;
    int votos;
    
    public Candidato(String nome,
                    int numero){
        this.votos = 0;
        this.nome = nome;
        this.numero = numero;        
    }    
}

package br.ufv.caf.eleicaoreitorufv2022;

public class Candidato {
    private String nome;
    private int numero;
    private int votos;
    
    public Candidato(String nome,
                    int numero){
        this.votos = 0;
        this.nome = nome;
        this.numero = numero;        
    }   

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getVotos() {
        return votos;
    }
    
    public void incrVotos(){
        this.votos++;
    }
    
    
    
    
}

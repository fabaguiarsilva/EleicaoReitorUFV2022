package br.ufv.caf.eleicaoreitorufv2022.entidade;

public class Eleitor {
    private int matricula;
    private String nome;
    
    public Eleitor(String nome,
            int matricula){
        this.nome=nome;
        this.matricula=matricula;
    }
}

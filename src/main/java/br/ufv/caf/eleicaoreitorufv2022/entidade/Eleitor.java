package br.ufv.caf.eleicaoreitorufv2022.entidade;

public class Eleitor extends Estudante {
    private boolean aptoVotar;
    
    public Eleitor(String nome,
            String matricula,
            String curso){
        super(nome,matricula,curso);
        aptoVotar = true;
    }
}

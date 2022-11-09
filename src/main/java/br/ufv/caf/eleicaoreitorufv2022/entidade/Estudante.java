package br.ufv.caf.eleicaoreitorufv2022.entidade;

public class Estudante extends MembroAcademico {

    private String curso;

    public Estudante(String nome, String matricula,
            String curso){
        super(nome, matricula);
        this.curso = curso;
        
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ""
                + "Curso: "+this.curso+"\n";
    }
    
    @Override
    public boolean matriculaValida() {
        return getMatricula().matches("E[F|V]\\d\\d\\d\\d\\d");
    }    

    @Override
    public String formatoMatricula() {
        return "E[F|V]\\d\\d\\d\\d\\d";
    }
        
}

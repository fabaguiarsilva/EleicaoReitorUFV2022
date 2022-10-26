package br.ufv.caf.eleicaoreitorufv2022.entidade;

public abstract class MembroAcademico {
    private String nome;
    private String matricula;
    
    public MembroAcademico(String nome,
                        String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public abstract boolean matriculaValida();
    
    @Override
    public String toString(){
        return this.nome + "("+this.matricula+")\n";
    }
    
    public String getMatricula() {
        return this.matricula;
    }    
    
}

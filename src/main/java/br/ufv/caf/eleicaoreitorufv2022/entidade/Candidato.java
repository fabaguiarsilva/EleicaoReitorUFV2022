package br.ufv.caf.eleicaoreitorufv2022.entidade;

public class Candidato extends Docente {
    private int numero;
    private int votos;
    
    public Candidato(String nome,
                    String matricula,
                    String departamento,
                    int numero){
        super(nome, matricula, departamento);
        this.votos = 0;
        this.numero = numero;        
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
    
    @Override
    public String toString(){
        return super.toString()+
                "\nNúmero: "+this.numero+
                "\nVotos: "+this.votos;
    }
}

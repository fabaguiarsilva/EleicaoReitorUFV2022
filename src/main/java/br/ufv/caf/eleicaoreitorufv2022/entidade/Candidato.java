package br.ufv.caf.eleicaoreitorufv2022.entidade;

public class Candidato extends Docente 
                        implements Comparable<Candidato>{
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

    @Override
    public int compareTo(Candidato outro) {
        if(this.getNumero() > outro.getNumero())
            return 1;
        if(this.getNumero() < outro.getNumero())
            return -1;
        return 0;
    }
}

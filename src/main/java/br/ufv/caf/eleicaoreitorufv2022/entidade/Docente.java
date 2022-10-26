package br.ufv.caf.eleicaoreitorufv2022.entidade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Docente extends MembroAcademico {

    private String departamento;

    public Docente(String nome, String matricula,
            String departamento){
        super(nome, matricula);
        this.departamento = departamento;
        
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ""
                + "Departamento: "+this.departamento+"\n";
    }
    
    @Override
    public boolean matriculaValida() {
        //4 dígitos
//        Pattern pattern = Pattern.compile("\\d\\d\\d\\d");
//        Matcher matcher = pattern.matcher(getMatricula());        
        //return this.getMatricula().length() == 4;
        
        return this.getMatricula().matches("\\d\\d\\d\\d");
    }    
}

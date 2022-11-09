package br.ufv.caf.eleicaoreitorufv2022.entidade.excecao;

/**
 *
 * @author fabriciosilva
 */
public class ExcecaoMatriculaInvalida extends Exception {
    
    private String message;
    
    public ExcecaoMatriculaInvalida(String message){
        this.message = "Matrícula inválida do membro acadêmico!\n" +
                        "Formato Válido: "+message;
    }
    
    public ExcecaoMatriculaInvalida(){
        message = "Matrícula inválida do membro acadêmico!";
    }
    
    @Override
    public String getMessage(){
        return message;
    }
}

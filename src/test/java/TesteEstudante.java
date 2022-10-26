
import br.ufv.caf.eleicaoreitorufv2022.entidade.Docente;
import br.ufv.caf.eleicaoreitorufv2022.entidade.Estudante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TesteEstudante {
    
    public TesteEstudante() {
    }
    
    @Test
    public void teste1(){
        Estudante e = new Estudante("nome",
        "EF12345","curso");
        
        assertTrue(e.matriculaValida());        
    }
    
    @Test
    public void teste2(){
        Estudante e = new Estudante("nome",
        "EF45678","curso");
        
        assertTrue(e.matriculaValida());        

    }    
    
    
    @Test
    public void teste3(){
        Estudante e = new Estudante("nome",
        "12345","curso");
        
        assertFalse(e.matriculaValida());        

    }    
    
    @Test
    public void teste4(){
        Estudante e = new Estudante("nome",
        "EF1234","curso");
        
        assertFalse(e.matriculaValida());        

    }    
    
    @Test
    public void teste5(){
        Estudante e = new Estudante("nome",
        "EF123456","curso");
        
        assertFalse(e.matriculaValida());        
    }
    
    @Test
    public void teste6(){
        Estudante e = new Estudante("nome",
        "EV12345","curso");
        
        assertTrue(e.matriculaValida());        
    }    
    
}


import br.ufv.caf.eleicaoreitorufv2022.entidade.Docente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TesteDocente {
    
    public TesteDocente() {
    }
    
    @Test
    public void teste1(){
        Docente d = new Docente("nome",
        "1234","departamento");
        
        assertTrue(d.matriculaValida());        
    }
    
    @Test
    public void teste2(){
        Docente d = new Docente("nome",
        "1111","departamento");
        
        assertTrue(d.matriculaValida());        
    }    
    
    
    @Test
    public void teste3(){
        Docente d = new Docente("nome",
        "12345","departamento");
        
        assertFalse(d.matriculaValida());        
    }    
    
    @Test
    public void teste4(){
        Docente d = new Docente("nome",
        "EF1234","departamento");
        
        assertFalse(d.matriculaValida());        
    }    
    
    @Test
    public void teste5(){
        Docente d = new Docente("nome",
        "abcd","departamento");
        
        assertFalse(d.matriculaValida());        
    }
    
}

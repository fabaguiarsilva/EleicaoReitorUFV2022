
import br.ufv.caf.eleicaoreitorufv2022.controle.ControleEleicao;
import br.ufv.caf.eleicaoreitorufv2022.entidade.Candidato;
import br.ufv.caf.eleicaoreitorufv2022.entidade.Eleitor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class TesteEleicao {
    
    ControleEleicao eleicao;
    
    public TesteEleicao() {
    }
    
    @BeforeEach
    public void inicia(){
        eleicao = new ControleEleicao();
        eleicao.addCandidato
            (new Candidato("Candidato 1","1111", "Computação", 1));
 
        eleicao.addCandidato
            (new Candidato("Candidato 2","2222", "Quimica", 92));

        eleicao.addCandidato
            (new Candidato("Candidato 3","3333", "Computação",3));
         
        eleicao.addEleitor
            (new Eleitor("Aluno 1", "EF12345", "Computação"));
        
        eleicao.addEleitor
            (new Eleitor("Aluno 2", "EF23456", "Computação"));

        eleicao.addEleitor
            (new Eleitor("Aluno 3", "EF34567", "Eng. Alimentos"));

        eleicao.addEleitor
            (new Eleitor("Aluno 4", "EF45678", "Física"));
        
    }
    
    @Test
    public void teste01() throws Exception {        
        
        inicia();
        
        eleicao.votar("EF12345",1);
        eleicao.votar("EF23456",1);
        eleicao.votar("EF34567",1);        
        eleicao.votar("EF45678",1);
        
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 1);
        
    }
    
    
    @Test
    public void teste02() throws Exception {
        
        inicia();
                
        eleicao.votar("EF12345",92);
        eleicao.votar("EF23456",1);
        eleicao.votar("EF34567",1);        
        eleicao.votar("EF45678",1);
        
        
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 1);
        
    }  
    
    @Test
    public void teste03() throws Exception {
        
        inicia();
        
        eleicao.votar("EF12345",1);
        eleicao.votar("EF23456",1);
        eleicao.votar("EF34567",1);        
        eleicao.votar("EF45678",92);
                
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 1);
        
    }    
    
    @Test
    public void teste04() throws Exception {
        
        inicia();
        
        eleicao.votar("EF12345",1);
        eleicao.votar("EF23456",1);
        eleicao.votar("EF34567",92);        
        eleicao.votar("EF45678",92);

        Candidato vencedor = eleicao.apuracao();
        assertNull(vencedor);
        
    }    
    
    @Test
    public void teste05() throws Exception {

        inicia();
        
        eleicao.votar("EF12345",3);
        eleicao.votar("EF23456",3);
        eleicao.votar("EF34567",3);        
        eleicao.votar("EF45678",3);
                
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 3);
        
    }

    @Test
    public void teste06() throws Exception {

        inicia();
        
        eleicao.votar("EF12345",3);
        eleicao.votar("EF23456",92);
        eleicao.votar("EF34567",3);        
        eleicao.votar("EF45678",3);
                
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 3);
        
    }
    @Test
    public void teste07() throws Exception {
        
        inicia();
        
        eleicao.votar("EF12345",1);
        eleicao.votar("EF23456",2);
        eleicao.votar("EF34567",1);        
        eleicao.votar("EF45678",2);
                       
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 1);
        
    }    
    
    
    
}

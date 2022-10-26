
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
    public void teste01(){        
        
        inicia();
        
        eleicao.votar(1);
        eleicao.votar(1);
        eleicao.votar(1);        
        eleicao.votar(1);
        
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 1);
        
    }
    
    
    @Test
    public void teste02(){
        
        inicia();
        
        eleicao.votar(92);
        eleicao.votar(1);
        eleicao.votar(1);        
        eleicao.votar(1);
        
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 1);
        
    }  
    
    @Test
    public void teste03(){
        
        inicia();
        
        eleicao.votar(1);
        eleicao.votar(1);
        eleicao.votar(1);        
        eleicao.votar(92);
        
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 1);
        
    }    
    
    @Test
    public void teste04(){
        
        inicia();
        
        eleicao.votar(1);
        eleicao.votar(1);
        eleicao.votar(92);        
        eleicao.votar(92);
        
        Candidato vencedor = eleicao.apuracao();
        assertNull(vencedor);
        
    }    
    
    @Test
    public void teste05(){

        inicia();
        
        eleicao.votar(3);
        eleicao.votar(3);
        eleicao.votar(3);        
        eleicao.votar(3);
        
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 3);
        
    }

    @Test
    public void teste06(){

        inicia();
        
        eleicao.votar(3);
        eleicao.votar(92);
        eleicao.votar(3);        
        eleicao.votar(3);
        
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 3);
        
    }
    @Test
    public void teste07(){
        
        inicia();
        
        eleicao.votar(1);
        eleicao.votar(2);
        eleicao.votar(1);        
        eleicao.votar(2);
        
        Candidato vencedor = eleicao.apuracao();
        assertEquals(vencedor.getNumero(), 1);
        
    }    
    
    
    
}

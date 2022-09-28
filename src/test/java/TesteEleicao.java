
import br.ufv.caf.eleicaoreitorufv2022.EleicaoReitor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteEleicao {
    
    EleicaoReitor eleicao;
    
    public TesteEleicao() {
    }
    
    @Test
    public void teste01(){
        
        eleicao = new EleicaoReitor();
        eleicao.iniciarEleicao();
        
        eleicao.votar(1);
        eleicao.votar(1);
        eleicao.votar(1);        
        eleicao.votar(1);
        
        int vencedor = eleicao.apuracao();
        assertEquals(vencedor, 1);
        
    }
    
    
    @Test
    public void teste02(){
        
        eleicao = new EleicaoReitor();
        eleicao.iniciarEleicao();
        
        eleicao.votar(92);
        eleicao.votar(1);
        eleicao.votar(1);        
        eleicao.votar(1);
        
        int vencedor = eleicao.apuracao();
        assertEquals(vencedor, 1);
        
    }  
    
    @Test
    public void teste03(){
        
        eleicao = new EleicaoReitor();
        eleicao.iniciarEleicao();
        
        eleicao.votar(1);
        eleicao.votar(1);
        eleicao.votar(1);        
        eleicao.votar(92);
        
        int vencedor = eleicao.apuracao();
        assertEquals(vencedor, 1);
        
    }    
    
    @Test
    public void teste04(){
        
        eleicao = new EleicaoReitor();
        eleicao.iniciarEleicao();
        
        eleicao.votar(1);
        eleicao.votar(1);
        eleicao.votar(92);        
        eleicao.votar(92);
        
        int vencedor = eleicao.apuracao();
        assertEquals(vencedor, -1);
        
    }    
    
    @Test
    public void teste05(){
        
        eleicao = new EleicaoReitor();
        eleicao.iniciarEleicao();
        
        eleicao.votar(3);
        eleicao.votar(3);
        eleicao.votar(3);        
        eleicao.votar(3);
        
        int vencedor = eleicao.apuracao();
        assertEquals(vencedor, 3);
        
    }

    @Test
    public void teste06(){
        
        eleicao = new EleicaoReitor();
        eleicao.iniciarEleicao();
        
        eleicao.votar(3);
        eleicao.votar(92);
        eleicao.votar(3);        
        eleicao.votar(3);
        
        int vencedor = eleicao.apuracao();
        assertEquals(vencedor, 3);
        
    }
    @Test
    public void teste07(){
        
        eleicao = new EleicaoReitor();
        eleicao.iniciarEleicao();
        
        eleicao.votar(1);
        eleicao.votar(2);
        eleicao.votar(1);        
        eleicao.votar(2);
        
        int vencedor = eleicao.apuracao();
        assertEquals(vencedor, 1);
        
    }    
    
    
    
}

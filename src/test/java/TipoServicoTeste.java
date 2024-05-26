import static org.junit.Assert.*;
import org.junit.Test;
import Entity.TipoServico;

public class TipoServicoTeste {

    @Test
    public void testGetClasse() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        assertEquals("Assistência Técnica", tipoServico.getClasse());
    }

    @Test
    public void testSetClasse() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        tipoServico.setClasse("Outra Classe");
        assertEquals("Outra Classe", tipoServico.getClasse());
    }

    @Test
    public void testGetSubclasse() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        assertEquals("Aparelhos Eletrônicos", tipoServico.getSubclasse());
    }

    @Test
    public void testSetSubclasse() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        tipoServico.setSubclasse("Outra Subclasse");
        assertEquals("Outra Subclasse", tipoServico.getSubclasse());
    }

    @Test
    public void testToString() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        assertEquals("Assistência Técnica - Aparelhos Eletrônicos", tipoServico.toString());
    }
}

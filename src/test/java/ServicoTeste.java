import static org.junit.Assert.*;
import org.junit.Test;

import Entity.*;

public class ServicoTeste {

    @Test
    public void testGetTiposervico() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        Servico servico = new Servico(tipoServico, "Celular", 100.0);
        assertEquals(tipoServico, servico.getTiposervico());
    }

    @Test
    public void testSetTiposervico() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        Servico servico = new Servico(null, "Celular", 0);
        servico.setTiposervico(tipoServico);
        assertEquals(tipoServico, servico.getTiposervico());
    }

    @Test
    public void testGetOrcamento() {
        Servico servico = new Servico(null, "Celular", 100.0);
        assertEquals(100.0, servico.getOrcamento(), 0);
    }

    @Test
    public void testSetOrcamento() {
        Servico servico = new Servico(null, "Celular", 0);
        servico.setOrcamento(200.0);
        assertEquals(200.0, servico.getOrcamento(), 0);
    }

    @Test
    public void testGetAparelho() {
        Servico servico = new Servico(null, "Celular", 0);
        assertEquals("Celular", servico.getAparelho());
    }

    @Test
    public void testSetAparelho() {
        Servico servico = new Servico(null, null, 0);
        servico.setAparelho("TV");
        assertEquals("TV", servico.getAparelho());
    }

    @Test
    public void testToString() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        Servico servico = new Servico(tipoServico, "Aparelho", 100.0);
        assertEquals("Assistência Técnica - Aparelhos Eletrônicos - Aparelho", servico.toString());
    }
}

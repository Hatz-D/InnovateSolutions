import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Entity.*;

import java.util.List;
import java.util.ArrayList;

public class TiposServicosTeste {
    private List<TipoServico> expectedServicos;

    @Before
    public void setUp() {
        TiposServicos.getListaServicos().clear(); // Limpa a lista de serviços antes de cada teste
        TiposServicos.populaServicos(); // Popula a lista com os serviços padrão

        // Define a lista de serviços esperados
        expectedServicos = new ArrayList<>();
        expectedServicos.add(new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos"));
        expectedServicos.add(new TipoServico("Assistência Técnica", "Eletrodomésticos"));
    }

    @Test
    public void testGetListaServicos() {
        List<TipoServico> listaServicos = TiposServicos.getListaServicos();

        assertTrue(listaServicos.containsAll(expectedServicos));
        assertTrue(expectedServicos.containsAll(listaServicos));
    }

    @Test
    public void testSetListaServicos() {
        List<TipoServico> newListaServicos = new ArrayList<>();
        TipoServico servico = new TipoServico("Serviço X", "Subclasse X");
        newListaServicos.add(servico);
        TiposServicos.setListaServicos(newListaServicos);
        assertEquals(newListaServicos, TiposServicos.getListaServicos());
    }

    @Test
    public void testAddServico() {
        TipoServico servico = new TipoServico("Serviço X", "Subclasse X");
        TiposServicos.addServico(servico);
        assertTrue(TiposServicos.getListaServicos().contains(servico));
    }

    @Test
    public void testRemoveServico() {
        TipoServico servico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        TiposServicos.removeServico(servico);
        assertFalse(TiposServicos.getListaServicos().contains(servico));
    }

    @Test
    public void testBuscaServico() {
        TipoServico servico = TiposServicos.buscaServico("Assistência Técnica", "Aparelhos Eletrônicos");
        assertNotNull(servico);
        assertEquals("Assistência Técnica", servico.getClasse());
        assertEquals("Aparelhos Eletrônicos", servico.getSubclasse());
    }

    @Test
    public void testGetRandomServico() {
        TipoServico randomServico = TiposServicos.getRandomServico();
        assertNotNull(randomServico);
        assertTrue(TiposServicos.getListaServicos().contains(randomServico));
    }
}
import Entity.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class PrestadoresTeste {
    @Before
    public void setUp() {
        Prestadores.getListaPrestadores().clear(); // Limpa a lista de prestadores antes de cada teste
        Prestadores.populaFila(5); // Popula a lista de prestadores com 5 prestadores para os testes
    }

    @Test
    public void testGetListaPrestadores() {
        assertNotNull(Prestadores.getListaPrestadores());
        assertFalse(Prestadores.getListaPrestadores().isEmpty());
        assertEquals(5, Prestadores.getListaPrestadores().size());
    }

    @Test
    public void testSetListaPrestadores() {
        Prestadores.setListaPrestadores(null);
        assertNull(Prestadores.getListaPrestadores());
    }

    @Test
    public void testAddPrestador() {
        Prestador novoPrestador = new Prestador("Novo Prestador", 4.5, "Descrição", "123456789");
        Prestadores.addPrestador(novoPrestador);
        assertTrue(Prestadores.getListaPrestadores().contains(novoPrestador));
    }

    @Test
    public void testRemovePrestador() {
        Prestador prestadorRemovido = Prestadores.getListaPrestadores().get(0);
        Prestadores.removePrestador(prestadorRemovido);
        assertFalse(Prestadores.getListaPrestadores().contains(prestadorRemovido));
    }

    @Test
    public void testEncontraPrestador() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        String aparelho = "Ar condicionado";
        List<Prestador> prestadoresEncontrados = Prestadores.encontraPrestador(tipoServico, aparelho);
        assertNotNull(prestadoresEncontrados);
        assertFalse(prestadoresEncontrados.isEmpty());
        for (Prestador p : prestadoresEncontrados) {
            assertTrue(p.getListaServicos().stream()
                    .anyMatch(s -> s.getTiposervico().equals(tipoServico) && s.getAparelho().equals(aparelho)));
        }
    }

    @Test
    public void testPopulaFila() {
        Prestadores.getListaPrestadores().clear();
        Prestadores.populaFila(10);
        assertEquals(10, Prestadores.getListaPrestadores().size());
    }
}

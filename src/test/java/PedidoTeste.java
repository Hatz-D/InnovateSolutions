import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Entity.*;

public class PedidoTeste {
    private Pedido pedido;
    private Prestador prestador;
    private Cliente cliente;
    private Servico servico;

    @Before
    public void setUp() {
        prestador = new Prestador("João", 4.5, "Bom prestador", "123456789");
        cliente = new Cliente("Maria");
        servico = new Servico(new TipoServico("Assistência Técnica", "Eletrodomésticos"), "Geladeira", 100.0);

        pedido = new Pedido(prestador, cliente, "2 semanas", "Conserto de geladeira", servico, "Rua A, 123");
    }

    @Test
    public void testGetPrestador() {
        assertEquals(prestador, pedido.getPrestador());
    }

    @Test
    public void testGetCliente() {
        assertEquals(cliente, pedido.getCliente());
    }

    @Test
    public void testGetPrazo() {
        assertEquals("2 semanas", pedido.getPrazo());
    }

    @Test
    public void testGetDescricao() {
        assertEquals("Conserto de geladeira", pedido.getDescricao());
    }

    @Test
    public void testGetServico() {
        assertEquals(servico, pedido.getServico());
    }

    @Test
    public void testGetEndereco() {
        assertEquals("Rua A, 123", pedido.getEndereco());
    }

    @Test
    public void testToString() {
        String expectedString = "Assistência Técnica - Eletrodomésticos - Geladeira - Status: Pagamento";
        assertEquals(expectedString, pedido.toString());
    }
}
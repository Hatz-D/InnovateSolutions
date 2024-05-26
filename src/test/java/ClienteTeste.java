import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import Entity.*;

public class ClienteTeste {
    private Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente("Miguel");
        cliente.addEndereco("Rua A, 123");
        cliente.addEndereco("Rua B, 123");
        cliente.addPagamento("Cartao");
        cliente.addPagamento("Pix");
    }

    @Test
    public void testGetNome() {
        assertEquals("Miguel", cliente.getNome());
    }

    @Test
    public void testSetNome() {
        cliente.setNome("Manuel");
        assertEquals("Manuel", cliente.getNome());
    }

    @Test
    public void testGetListaEnderecos() {
        List<String> expectedEnderecos = Arrays.asList("Rua A, 123", "Rua B, 123");
        assertEquals(expectedEnderecos, cliente.getListaEnderecos());
    }

    @Test
    public void testSetListaEnderecos() {
        List<String> novosEnderecos = Arrays.asList("Rua C, 123", "Rua D, 123");
        cliente.setListaEnderecos(novosEnderecos);
        assertEquals(novosEnderecos, cliente.getListaEnderecos());
    }

    @Test
    public void testGetListaPagamentos() {
        List<String> expectedPagamentos = Arrays.asList("Cartao", "Pix");
        assertEquals(expectedPagamentos, cliente.getListaPagamentos());
    }

    @Test
    public void testSetListaPagamentos() {
        List<String> novosPagamentos = Arrays.asList("Boleto", "Dinheiro");
        cliente.setListaPagamentos(novosPagamentos);
        assertEquals(novosPagamentos, cliente.getListaPagamentos());
    }

    @Test
    public void testAddEndereco() {
        cliente.addEndereco("Rua C, 123");
        assertTrue(cliente.getListaEnderecos().contains("Rua C, 123"));
    }

    @Test
    public void testRemoveEndereco() {
        cliente.removeEndereco("Rua A, 123");
        assertFalse(cliente.getListaEnderecos().contains("Rua A, 123"));
    }

    @Test
    public void testAddPagamento() {
        cliente.addPagamento("Boleto");
        assertTrue(cliente.getListaPagamentos().contains("Boleto"));
    }

    @Test
    public void testRemovePagamento() {
        cliente.removePagamento("Pix");
        assertFalse(cliente.getListaPagamentos().contains("Pix"));
    }

    @Test
    public void testGetPedidos() {
        TipoServico tipoServico = new TipoServico("ClasseTeste", "SubclasseTeste");
        Servico servico = new Servico(tipoServico, "AparelhoTeste", 100.00);
        Prestador prestador = new Prestador("PrestadorTeste", 9.5, "DescricaoTeste", "ContaTeste");
        Pedido pedido1 = new Pedido(prestador, cliente, "2 meses", "DescricaoTeste", servico, "EnderecoTeste");
        TipoServico tipoServico2 = new TipoServico("ClasseTeste2", "SubclasseTeste2");
        Servico servico2 = new Servico(tipoServico2, "AparelhoTeste2", 100.00);
        Prestador prestador2 = new Prestador("PrestadorTeste2", 8, "DescricaoTeste2", "ContaTeste2");
        Pedido pedido2 = new Pedido(prestador2, cliente, "5 meses", "DescricaoTeste2", servico2, "EnderecoTeste");
        cliente.addPedido(pedido1);
        cliente.addPedido(pedido2);
        String expectedPedidos = "\n1. " + pedido1.toString() + "\n2. " + pedido2.toString();
        assertEquals(expectedPedidos, cliente.getPedidos());
    }

    @Test
    public void testAddPedido() {
        TipoServico tipoServico = new TipoServico("ClasseTeste", "SubclasseTeste");
        Servico servico = new Servico(tipoServico, "AparelhoTeste", 100.00);
        Prestador prestador = new Prestador("PrestadorTeste", 9.5, "DescricaoTeste", "ContaTeste");
        Pedido pedido = new Pedido(prestador, cliente, "2 meses", "DescricaoTeste", servico, "EnderecoTeste");
        cliente.addPedido(pedido);
        assertTrue(cliente.getListaPedidos().contains(pedido));
    }

    @Test
    public void testRemovePedido() {
        Pedido pedido = cliente.getListaPedidos().get(0);
        cliente.removePedido(pedido);
        assertFalse(cliente.getListaPedidos().contains(pedido));
    }

    @Test
    public void testToString() {
        assertEquals("Miguel", cliente.toString());
    }
}

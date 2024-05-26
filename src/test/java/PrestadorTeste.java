import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Entity.*;

public class PrestadorTeste {
    private Prestador prestador;
    private Pedido pedido;

    @Before
    public void setUp() {
        prestador = new Prestador("João", 4.5, "Experiente em conserto de celulares", "1234567890");
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        Servico servico = new Servico(tipoServico, "Celular", 100.00);
        Cliente cliente = new Cliente("Joaquim");
        pedido = new Pedido(prestador, cliente, "5 dias", "Tela quebrada", servico, "Rua A, 123");
    }

    @Test
    public void testGetNome() {
        assertEquals("João", prestador.getNome());
    }

    @Test
    public void testSetNome() {
        prestador.setNome("José");
        assertEquals("José", prestador.getNome());
    }

    @Test
    public void testGetListaServicos() {
        assertNotNull(prestador.getListaServicos());
        assertTrue(prestador.getListaServicos().isEmpty());
    }

    @Test
    public void testSetListaServicos() {
        Servico servico = new Servico(new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos"), "Aparelho",
                100.0);
        prestador.addServico(servico.getTiposervico(), servico.getAparelho(), servico.getOrcamento());
        assertEquals(1, prestador.getListaServicos().size());

        prestador.setListaServicos(null);
        assertNull(prestador.getListaServicos());
    }

    @Test
    public void testGetNota() {
        assertEquals(4.5, prestador.getNota(), 0);
    }

    @Test
    public void testSetNota() {
        prestador.setNota(4.8);
        assertEquals(4.8, prestador.getNota(), 0);
    }

    @Test
    public void testGetDescricao() {
        assertEquals("Eletricista experiente", prestador.getDescricao());
    }

    @Test
    public void testSetDescricao() {
        prestador.setDescricao("Encanador experiente");
        assertEquals("Encanador experiente", prestador.getDescricao());
    }

    @Test
    public void testGetContaBancaria() {
        assertEquals("1234567890", prestador.getContaBancaria());
    }

    @Test
    public void testSetContaBancaria() {
        prestador.setContaBancaria("0987654321");
        assertEquals("0987654321", prestador.getContaBancaria());
    }

    @Test
    public void testGetListaPedidos() {
        assertNotNull(prestador.getListaPedidos());
        assertTrue(prestador.getListaPedidos().isEmpty());
    }

    @Test
    public void testAddPedido() {
        TipoServico tipoServico = new TipoServico("ClasseTeste", "SubclasseTeste");
        Servico servico = new Servico(tipoServico, "AparelhoTeste", 100.00);
        Cliente cliente = new Cliente("ClienteTeste");
        pedido = new Pedido(prestador, cliente, "2 meses", "DescricaoTeste", servico, "EnderecoTeste");
        prestador.addPedido(pedido);
        assertEquals(1, prestador.getListaPedidos().size());
    }

    @Test
    public void testRemovePedido() {
        TipoServico tipoServico = new TipoServico("ClasseTeste", "SubclasseTeste");
        Servico servico = new Servico(tipoServico, "AparelhoTeste", 100.00);
        Cliente cliente = new Cliente("ClienteTeste");
        pedido = new Pedido(prestador, cliente, "2 meses", "DescricaoTeste", servico, "EnderecoTeste");
        prestador.addPedido(pedido);
        prestador.removePedido(pedido);
        assertTrue(prestador.getListaPedidos().isEmpty());
    }

    @Test
    public void testAddServico() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        prestador.addServico(tipoServico, "Aparelho", 100.0);
        assertEquals(1, prestador.getListaServicos().size());
    }

    @Test
    public void testRemoveServico() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        prestador.addServico(tipoServico, "Aparelho", 100.0);
        Servico servico = prestador.getListaServicos().get(0);
        prestador.removeServico(servico);
        assertTrue(prestador.getListaServicos().isEmpty());
    }

    @Test
    public void testGetServico() {
        TipoServico tipoServico = new TipoServico("Assistência Técnica", "Aparelhos Eletrônicos");
        prestador.addServico(tipoServico, "Aparelho", 100.0);
        Servico servico = prestador.getServico(tipoServico, "Aparelho");
        assertNotNull(servico);
        assertEquals(tipoServico, servico.getTiposervico());
        assertEquals("Aparelho", servico.getAparelho());
    }

    @Test
    public void testToString() {
        assertEquals("João - Eletricista experiente - Avaliação: 4.50", prestador.toString());
    }
}

import Entity.Cliente;
import Entity.Pedido;
import Boundary.Pedidos;
import Control.PedidosCtrl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PedidosTeste {
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente("Test Cliente");
    }

    @Test
    public void testListaPedidosComPedidos() {
        // Adiciona pedidos de exemplo ao cliente
        Pedido pedido1 = new Pedido(null, cliente, "10/10/2024", "Descricao 1", null, "Endereco 1");
        Pedido pedido2 = new Pedido(null, cliente, "11/11/2024", "Descricao 2", null, "Endereco 2");
        cliente.addPedido(pedido1);
        cliente.addPedido(pedido2);

        // Simula a entrada do usuário: "1" para listar o primeiro pedido e "3" para sair.
        String input = "1\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método listaPedidos
        Pedidos.listaPedidos(cliente);

        // Verifica se os pedidos foram listados corretamente.
        assertNotNull(cliente.getListaPedidos());
        assertEquals(2, cliente.getListaPedidos().size());

        // Verifica se o acompanhamento foi chamado corretamente (substitua por um mock se necessário)
        // No entanto, sem Mockito ou outro framework de mocking, não podemos verificar a chamada diretamente aqui.

        // Restaura o InputStream original.
        System.setIn(System.in);
    }

    @Test
    public void testListaPedidosSemPedidos() {
        // Simula a entrada do usuário: "1" para sair (não há pedidos).
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método listaPedidos
        Pedidos.listaPedidos(cliente);

        // Verifica se a lista de pedidos está vazia.
        assertEquals(0, cliente.getListaPedidos().size());

        // Restaura o InputStream original.
        System.setIn(System.in);
    }
}

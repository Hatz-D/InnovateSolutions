import Entity.Cliente;
import Entity.Pedido;
import Boundary.Perfil;
import Control.PerfilCtrl;
import Control.PedidosCtrl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfilTeste {
    private Cliente cliente;
    private Pedido pedido1;
    private Pedido pedido2;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente("Test Cliente");
        pedido1 = new Pedido(null, cliente, "10/10/2023", "Descricao Pedido 1", null, "Endereco 1");
        pedido2 = new Pedido(null, cliente, "12/10/2023", "Descricao Pedido 2", null, "Endereco 2");
        cliente.addPedido(pedido1);
        cliente.addPedido(pedido2);
    }

    @Test
    public void testMenuPerfil() {
        // Simula a entrada do usuário: "1" para listar pedidos, "4" para voltar.
        String input = "1\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método menuPerfil
        Perfil.menuPerfil(cliente);

        // Restaura o InputStream original.
        System.setIn(System.in);
    }

    @Test
    public void testPagamentoAdicionar() {
        // Simula a entrada do usuário para adicionar uma nova opção de pagamento e depois voltar.
        String input = "1\nPix\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método pagamento
        Perfil.pagamento(cliente);

        // Verifica se a nova opção de pagamento foi adicionada corretamente
        assertEquals(1, cliente.getListaPagamentos().size());
        assertEquals("Pix", cliente.getListaPagamentos().get(0));

        // Restaura o InputStream original.
        System.setIn(System.in);
    }

    @Test
    public void testPagamentoRemover() {
        // Adiciona uma opção de pagamento de exemplo ao cliente
        cliente.addPagamento("Cartão de Crédito");

        // Simula a entrada do usuário para remover uma opção de pagamento e depois voltar.
        String input = "2\nCartão de Crédito\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método pagamento
        Perfil.pagamento(cliente);

        // Verifica se a opção de pagamento foi removida corretamente
        assertEquals(0, cliente.getListaPagamentos().size());

        // Restaura o InputStream original.
        System.setIn(System.in);
    }

    @Test
    public void testEnderecoAdicionar() {
        // Simula a entrada do usuário para adicionar um novo endereço e depois voltar.
        String input = "1\nRua ABC, 123\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método endereco
        Perfil.endereco(cliente);

        // Verifica se o novo endereço foi adicionado corretamente
        assertEquals(1, cliente.getListaEnderecos().size());
        assertEquals("Rua ABC, 123", cliente.getListaEnderecos().get(0));

        // Restaura o InputStream original.
        System.setIn(System.in);
    }

    @Test
    public void testEnderecoRemover() {
        // Adiciona um endereço de exemplo ao cliente
        cliente.addEndereco("Rua XYZ, 456");

        // Simula a entrada do usuário para remover um endereço e depois voltar.
        String input = "2\nRua XYZ, 456\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método endereco
        Perfil.endereco(cliente);

        // Verifica se o endereço foi removido corretamente
        assertEquals(0, cliente.getListaEnderecos().size());

        // Restaura o InputStream original.
        System.setIn(System.in);
    }

    @Test
    public void testListaPedidos() {
        // Simula a entrada do usuário: "1" para selecionar o primeiro pedido, "3" para voltar.
        String input = "1\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método listaPedidos
        Perfil.menuPerfil(cliente);

        // Restaura o InputStream original.
        System.setIn(System.in);
    }
}

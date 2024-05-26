import Entity.Pedido;
import Boundary.Cancelamento;
import Control.CancelamentoCtrl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CancelamentoTeste {
    private Pedido pedido;

    @BeforeEach
    public void setUp() {
        // Inicializamos um objeto Pedido com valores dummy.
        pedido = new Pedido(null, null, "10/10/2024", "Test Description", null, "Test Address");
    }

    @Test
    public void testCancelar() {
        // Simulando a entrada do usuário: "1" para cancelar e "2" para sair.
        String input = "1\n2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executamos o método cancelar.
        Cancelamento.cancelar(pedido);

        // Verificamos se o status do pedido foi atualizado corretamente.
        assertEquals("Cancelado", pedido.getStatus());

        // Restaurando o InputStream original.
        System.setIn(System.in);
    }

    @Test
    public void testNaoCancelar() {
        // Simulando a entrada do usuário: "2" para não cancelar.
        String input = "2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executamos o método cancelar.
        Cancelamento.cancelar(pedido);

        // Verificamos se o status do pedido não foi alterado para "Cancelado".
        assertEquals("Pagamento", pedido.getStatus());

        // Restaurando o InputStream original.
        System.setIn(System.in);
    }
}

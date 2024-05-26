import Entity.Pedido;
import Control.AvaliacaoCtrl;
import Boundary.Avaliacao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class AvaliacaoTeste {
    private Pedido pedido;

    @BeforeEach
    public void setUp() {
        // Inicializamos um objeto Pedido com valores dummy.
        pedido = new Pedido(null, null, "10/10/2024", "Test Description", null, "Test Address");
    }

    @Test
    public void testAvaliar() {
        // Simulando a entrada do usuário: "1" para avaliar, "8.5" como a avaliação e "2" para sair.
        String input = "1\n8.5\n2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executamos o método avaliar.
        Avaliacao.avaliar(pedido);

        // Verificamos se a avaliação foi corretamente atribuída ao pedido.
        assertEquals(8.5, pedido.getAvaliacao(), 0.01);

        // Restaurando o InputStream original.
        System.setIn(System.in);
    }

    @Test
    public void testComentario() {
        // Simulando a entrada do usuário: "1" para comentar, "Ótimo serviço!" como comentário e "2" para sair.
        String input = "1\nÓtimo serviço!\n2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executamos o método comentario.
        Avaliacao.comentario(pedido);

        // Verificamos se o comentário foi corretamente atribuído ao pedido.
        assertEquals("Ótimo serviço!", pedido.getComentario());

        // Restaurando o InputStream original.
        System.setIn(System.in);
    }
}

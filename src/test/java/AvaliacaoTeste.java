import Boundary.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliacaoTeste {

    public static Pedido pedido;

    @BeforeAll
    public static void inicializar() {
        pedido = new Pedido();
    }

    @Test
    public void testarAvaliar() {
        double avaliacao = 8.5;
        AvaliacaoCtrl.avaliar(pedido, avaliacao);
        assertEquals(avaliacao, pedido.getAvaliacao());
    }

    @Test
    public void testarComentario() {
        String comentario = "Ótimo serviço!";
        AvaliacaoCtrl.comentario(pedido, comentario);
        assertEquals(comentario, pedido.getComentario());
    }
}
    
}

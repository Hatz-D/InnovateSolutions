package Control;

import Entity.*;
import Boundary.*;

public class AvaliacaoCtrl {
    public static int avaliar(Pedido pedido, double avaliacao) {
        if (avaliacao <= 10 && avaliacao >= 0) {
            pedido.setAvaliacao(avaliacao);
            Avaliacao.comentario(pedido);
            return 2;
        }

        else{System.out.print("\nInsira uma avaliação de 0 a 10!\n");}
        return -1;
    }

    public static int comentario(Pedido pedido, String comentario) {
        pedido.setComentario(comentario);
        return 2;
    }
}

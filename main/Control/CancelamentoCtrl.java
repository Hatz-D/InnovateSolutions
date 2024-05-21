package Control;

import Entity.*;

public class CancelamentoCtrl {
    public static int cancelar(Pedido pedido, int opcaoInt) {
        switch(opcaoInt) {
            case 1 -> {
                System.out.println("Serviço cancelado com sucesso!");
                pedido.setStatus("Cancelado");
                taxaCancelamento(pedido);
                return 2;
            }

            case 2 -> {return 2;}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }

        return -1;
    }

    public static void taxaCancelamento(Pedido pedido) {
        // Função que irá cobrar uma taxa de cancelamento do cliente
        // Sim, ela não tem nenhum código pois ela foge do escopo dos casos de uso
    }
}

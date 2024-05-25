package Control;

import Entity.*;
import Boundary.*;

public class AcompanhamentoCtrl {
    public static int acompanhamento(Pedido pedido, int opcaoInt) {
        switch (opcaoInt) {
            case 1 -> {
                if(pedido.getStatus().equals("Pagamento")) {
                    Solicitacao.pagamento(pedido);}
                else if(pedido.getStatus().equals("Aberto")) {
                    Acompanhamento.finalizarPedido(pedido);}
                else if(pedido.getStatus().equals("Finalizado") && pedido.getAvaliacao() == -1) {
                    Avaliacao.avaliar(pedido);}
                else {return 3;}
            }

            case 2 -> {
                if(pedido.getStatus().equals("Aberto") || pedido.getStatus().equals("Pagamento")) {
                    Cancelamento.cancelar(pedido);}
                else if(pedido.getStatus().equals("Finalizado") && pedido.getAvaliacao() == -1) {return 3;}
                else{System.out.print("\nDigite uma opção válida!\n");}
            }

            case 3 -> {
                if(pedido.getStatus().equals("Aberto") || pedido.getStatus().equals("Pagamento")) {return 3;}
                else{
                    System.out.print("\nDigite uma opção válida!\n");
                    return -1;
                }
            }

            default -> System.out.print("\nDigite uma opção válida!\n");
        }

        return -1;
    }

    public static int finalizarPedido(Pedido pedido, int opcaoInt) {
        switch(opcaoInt) {
            case 1 -> {
                System.out.println("Serviço finalizado com sucesso! Por favor, avalie o serviço prestado!");
                pedido.setStatus("Finalizado");
                return 2;
            }

            case 2 -> {return 2;}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }

        return -1;
    }
}

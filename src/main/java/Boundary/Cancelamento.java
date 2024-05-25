package Boundary;

import Control.*;
import Entity.*;

import java.util.Scanner;

public class Cancelamento {
    public static void cancelar(Pedido pedido) {
        String menu = "\n************** Cancelamento do Serviço **************\n\nTem certeza que você deseja cancelar o serviço? Somente cancele caso você deseje cancelar o serviço.\nUma taxa de cancelamento será cobrada caso o serviço seja cancelado:\n\n1. Sim, cancelar\n2. Não, voltar\n";
        String opcao;
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);

        while(opcaoInt != 2) {
            System.out.print(menu);
            System.out.print("\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();
            try {opcaoInt = Integer.parseInt(opcao);}
            catch (Exception e) {opcaoInt = -1;}

            opcaoInt = CancelamentoCtrl.cancelar(pedido, opcaoInt);
        }
    }

    public static void taxaCancelamento(Pedido pedido) {
        // Função que irá cobrar uma taxa de cancelamento do cliente
        // Sim, ela não tem nenhum código pois ela foge do escopo dos casos de uso
        CancelamentoCtrl.taxaCancelamento(pedido);
    }
}

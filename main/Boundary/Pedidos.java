package Boundary;

import Control.PedidosCtrl;
import Entity.*;

import java.util.Scanner;

public class Pedidos {
    public static void listaPedidos(Cliente cliente) {
        String opcao;
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);
        String menu = "\n************** Lista de Pedidos **************\n";

        while(opcaoInt != cliente.getListaPedidos().size()+1) {
            System.out.print(menu + cliente.getPedidos());
            if(cliente.getListaPedidos().isEmpty()) {System.out.println("\nNão há nenhum pedido realizado!");}
            System.out.print("\n" + (cliente.getListaPedidos().size()+1) + ". Voltar\n\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();

            try {
                opcaoInt = Integer.parseInt(opcao);
                PedidosCtrl.listaPedidos(cliente, opcaoInt);
            }

            catch (Exception e) {System.out.print("\nDigite uma opção válida!\n");}
        }
    }
}

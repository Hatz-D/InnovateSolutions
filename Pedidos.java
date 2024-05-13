import java.util.Scanner;

public class Pedidos {
    public static void listaPedidos(Cliente cliente) {
        String opcao = "";
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);
        Pedido pedido;
        String menu = "\n************** Lista de Pedidos **************\n";

        while(opcaoInt != cliente.getListaPedidos().size()+1) {
            System.out.print(menu + cliente.getPedidos());
            System.out.print("\n" + (cliente.getListaPedidos().size()+1) + ". Voltar\n\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();
            pedido = null;

            try {
                opcaoInt = Integer.parseInt(opcao);
                if(opcaoInt != cliente.getListaPedidos().size()+1) {pedido = cliente.getListaPedidos().get(opcaoInt-1);};
            }

            catch (Exception e) {
                System.out.print("\nDigite uma opção válida!\n");
            }

            if(pedido != null) {Acompanhamento.acompanhamento(pedido);}
        }
    }
}

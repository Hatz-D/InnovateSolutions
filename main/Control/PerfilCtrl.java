package Control;

import Entity.*;
import Boundary.*;

public class PerfilCtrl {
    public static void menuPerfil(Cliente cliente, int opcaoInt) {
        switch (opcaoInt) {
            case 1 -> Pedidos.listaPedidos(cliente);

            case 2 -> Perfil.pagamento(cliente);

            case 3 -> Perfil.endereco(cliente);

            case 4 -> {}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }
    }

    public static void pagamento(Cliente cliente, int opcaoInt, String pagamento) {
        switch (opcaoInt) {
            case 1 -> cliente.addPagamento(pagamento);

            case 2 -> cliente.removePagamento(pagamento);
        }
    }

    public static void endereco(Cliente cliente, int opcaoInt, String endereco) {
        switch (opcaoInt) {
            case 1 -> cliente.addEndereco(endereco);

            case 2 -> cliente.removeEndereco(endereco);
        }
    }
}

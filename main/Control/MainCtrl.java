package Control;

import Boundary.*;
import Entity.*;

public class MainCtrl {
    public static void main(Cliente cliente, int opcaoInt) {
        switch(opcaoInt) {
            case 1 -> Solicitacao.classeProblema(cliente);

            case 2 -> Perfil.menuPerfil(cliente);

            case 3 -> System.out.println("\nObrigado por usar a InnovateSolutions!");

            default -> System.out.print("\nDigite uma opção válida!\n");
        }
    }
}

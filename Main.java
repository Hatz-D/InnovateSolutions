import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String opcao = "";
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);
        String menu = "\n************** Home **************\n\n1. Nova Solicitação de Serviço\n2. Perfil de Usuário\n3. Encerrar\n\nSelecione uma opção: ";

        Servicos.populaServicos();
        Prestadores.populaFila(100);

        Cliente cliente = new Cliente("Eduardo San");
        cliente.addPagamento("Pix");
        cliente.addPagamento("Cartão Mastercard XXXX");
        cliente.addEndereco("Higienópolis XXX");
        cliente.addEndereco("São Paulo XXX");

        while(opcaoInt != 3) {
            System.out.print(menu);
            opcao = scanner.nextLine().strip();

            try {opcaoInt = Integer.parseInt(opcao);}

            catch(Exception e) {
                System.out.print("\nDigite uma opção válida!\n");
                opcaoInt = -1;
            }

            switch(opcaoInt) {
                case 1 -> Solicitacao.classeProblema(cliente);

                case 2 -> Perfil.menuPerfil(cliente);

                case 3 -> System.out.println("\nObrigado por usar a InnovateSolutions!");

                default -> System.out.print("\nDigite uma opção válida!\n");

            }
        }
    }
}
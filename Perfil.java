import java.util.Scanner;

public class Perfil {
    public static void menuPerfil(Cliente cliente) {
        String opcao;
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);
        String menu = "\n************** Perfil de Usuário **************\n\n";
        String menu2 = "\n1. Lista de Pedidos\n2. Opções de Pagamento\n3. Endereços\n4. Voltar\n\nSelecione uma opção: ";

        while (opcaoInt != 4) {
            System.out.print(menu + cliente + menu2);
            opcao = scanner.nextLine().strip();

            try {
                opcaoInt = Integer.parseInt(opcao);
            } catch (Exception e) {
                System.out.print("\nDigite uma opção válida!\n");
                opcaoInt = -1;
            }

            switch (opcaoInt) {
                case 1 -> Pedidos.listaPedidos(cliente);

                case 2 -> pagamento(cliente);

                case 3 -> endereco(cliente);

                case 4 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
    }

    public static void pagamento(Cliente cliente) {
        String menu = "\n************** Opções de Pagamento **************\n";
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        String pagamento;

        while (opcaoInt != 3) {
            System.out.println(menu);
            for (int i = 1; i <= cliente.getListaPagamentos().size(); ++i) {
                StringBuilder sb = new StringBuilder();
                sb.append("- ");
                System.out.print(sb);
                System.out.println(cliente.getListaPagamentos().get(i - 1));
            }

            if(cliente.getListaPagamentos().isEmpty()) {System.out.println("Nenhuma opção de pagamento cadastrada!");}

            System.out.print("\n1. Nova Opção de Pagamento\n2. Deletar Opção de Pagamento\n3. Voltar\n\nSelecione uma opção: ");
            opcao = scanner.nextLine();

            try {opcaoInt = Integer.parseInt(opcao);}
            catch (Exception e) {System.out.print("\nDigite uma opção válida!\n");}

            switch(opcaoInt) {
                case 1 -> {
                    System.out.print("Insira a nova opção de pagamento: ");
                    pagamento = scanner.nextLine().strip();
                    cliente.addPagamento(pagamento);
                }

                case 2 -> {
                    System.out.print("Insira a opção de pagamento a ser deletada: ");
                    pagamento = scanner.nextLine().strip();
                    cliente.removePagamento(pagamento);
                }

                case 3 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
    }

    public static void endereco(Cliente cliente) {
        String menu = "\n************** Endereços **************\n";
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        String endereco;

        while (opcaoInt != 3) {
            System.out.println(menu);
            for (int i = 1; i <= cliente.getListaEnderecos().size(); ++i) {
                StringBuilder sb = new StringBuilder();
                sb.append("- ");
                System.out.print(sb);
                System.out.println(cliente.getListaEnderecos().get(i - 1));
            }

            if(cliente.getListaEnderecos().isEmpty()) {System.out.println("Nenhuma opção de endereço cadastrada!");}

            System.out.print("\n1. Cadastrar Novo Endereço\n2. Deletar Endereço\n3. Voltar\n\nSelecione uma opção: ");
            opcao = scanner.nextLine();

            try {opcaoInt = Integer.parseInt(opcao);}
            catch (Exception e) {System.out.print("\nDigite uma opção válida!\n");}

            switch(opcaoInt) {
                case 1 -> {
                    System.out.print("Insira o novo endereço: ");
                    endereco = scanner.nextLine().strip();
                    cliente.addEndereco(endereco);
                }

                case 2 -> {
                    System.out.print("Insira o endereço a ser deletado: ");
                    endereco = scanner.nextLine().strip();
                    cliente.removeEndereco(endereco);
                }

                case 3 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
    }
}

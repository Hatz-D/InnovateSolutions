import java.util.Scanner;

public class Avaliacao {
    public static void avaliar(Pedido pedido) {
        String menu = "\n************** Avaliação do Serviço **************\n\nPor favor, insira uma nota de 0 a 10 para o serviço prestado:\n\n1. Avaliar\n2. Voltar\n";
        String opcao = "";
        int opcaoInt = -1;
        double avaliacao = -1;
        Scanner scanner = new Scanner(System.in);
        boolean placeholder = true;

        while(opcaoInt != 2 && placeholder) {
            System.out.print(menu);
            System.out.print("\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();
            try {opcaoInt = Integer.parseInt(opcao);}
            catch (Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> {
                    System.out.print("\nInsira uma avaliação: ");
                    opcao = scanner.nextLine().strip();
                    try {
                        avaliacao = Double.parseDouble(opcao);
                        if (avaliacao <= 10 && avaliacao >= 0) {
                            pedido.setAvaliacao(avaliacao);
                            placeholder = comentario(pedido);
                            opcaoInt = 2;
                        }
                        else{System.out.print("\nInsira uma avaliação de 0 a 10!\n");}
                    }
                    catch (Exception e) {System.out.print("\nDigite uma opção válida!\n");}
                }

                case 2 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
    }

    public static boolean comentario(Pedido pedido) {
        String menu = "\n************** Comentário **************\n\nVocê deseja adicionar um comentário ao serviço prestado?\n\n1. Sim, comentar\n2. Não, voltar\n";
        String opcao = "";
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);
        boolean placeholder = true;

        while(opcaoInt != 2 && placeholder) {
            System.out.print(menu);
            System.out.print("\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();
            String comentario;
            try {opcaoInt = Integer.parseInt(opcao);}
            catch (Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> {
                    System.out.print("\nInsira um comentário: ");
                    comentario = scanner.nextLine().strip();
                    pedido.setComentario(comentario);
                    placeholder = false;
                }

                case 2 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }

        return placeholder;
    }
}

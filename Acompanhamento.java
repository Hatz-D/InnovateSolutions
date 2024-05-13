import java.util.Scanner;

public class Acompanhamento {
    public static void acompanhamento(Pedido pedido) {
        String opcao = "";
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String menu = "\n************** Acompanhamento de Pedido **************\n\n";
        String opcoes0 = "\n1. Pagar Serviço\n2. Cancelar Serviço\n3. Voltar\n";
        String opcoes1 = "\n1. Confirmar Realização\n2. Cancelar Serviço\n3. Voltar\n";
        String opcoes2 = "\n1. Avaliar Serviço\n2. Voltar\n";
        String opcoes3 = "\n1. Voltar\n";

        sb.append(menu).append("Tipo de Serviço: ").append(pedido.getServico().getClasse()).append(" - ").append(pedido.getServico().getSubclasse());
        sb.append("\nProduto: ").append(pedido.getServico().getTipo()).append(" - Marca: ").append(pedido.getAdicionalMarca());
        sb.append("\nProblema: ").append(pedido.getAdicionalProblema()).append("\nDescrição do Serviço: ").append(pedido.getDescricao());
        sb.append("\nData de Solicitação: ").append(pedido.getData()).append("\nPrazo para a Realização: ").append(pedido.getPrazo());
        sb.append("\nPrestador do Serviço: ").append(pedido.getPrestador().getNome()).append("\nEndereço: ").append(pedido.getEndereco()).append("\nOrçamento do Serviço: R$").append(String.format("%.2f", pedido.getOrcamento()));

        while(opcaoInt != 3) {
            System.out.println(sb);
            if(!pedido.getPagamento().isEmpty()) {System.out.println("Pagamento: " + pedido.getPagamento());}
            if(pedido.getAvaliacao() != -1) {System.out.println("Avaliação do Serviço: " + String.format("%.2f", pedido.getAvaliacao()));}
            if(!pedido.getComentario().isEmpty()) {System.out.println("Comentário do Serviço: " + pedido.getComentario());}
            System.out.println("\nStatus do Serviço: " + pedido.getStatus());

            if(pedido.getStatus().equals("Pagamento")) {System.out.print(opcoes0);}
            else if(pedido.getStatus().equals("Aberto")) {System.out.print(opcoes1);}
            else if(pedido.getStatus().equals("Finalizado") && pedido.getAvaliacao() == -1) {System.out.print(opcoes2);}
            else {System.out.print(opcoes3);}

            System.out.print("\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();
            try {opcaoInt = Integer.parseInt(opcao);}
            catch (Exception e) {opcaoInt = -1;}

            switch (opcaoInt) {
                case 1 -> {
                    if(pedido.getStatus().equals("Pagamento")) {Solicitacao.pagamento(pedido);}
                    else if(pedido.getStatus().equals("Aberto")) {finalizarPedido(pedido);}
                    else if(pedido.getStatus().equals("Finalizado") && pedido.getAvaliacao() == -1) {Avaliacao.avaliar(pedido);}
                    else {opcaoInt = 3;}
                }

                case 2 -> {
                    if(pedido.getStatus().equals("Aberto") || pedido.getStatus().equals("Pagamento")) {Cancelamento.cancelar(pedido);}
                    else if(pedido.getStatus().equals("Finalizado") && pedido.getAvaliacao() == -1) {opcaoInt = 3;}
                    else{System.out.print("\nDigite uma opção válida!\n");}
                }

                case 3 -> {
                    if(pedido.getStatus().equals("Aberto") || pedido.getStatus().equals("Pagamento")) {continue;}
                    else{
                        System.out.print("\nDigite uma opção válida!\n");
                        opcaoInt = -1;
                    }
                }

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
    }

    public static void finalizarPedido(Pedido pedido) {
        String menu = "\n************** Finalização do Serviço **************\n\nTem certeza que você deseja finalizar o serviço? Somente confirme caso o serviço tenha sido prestado e esteja finalizado:\n\n1. Sim, finalizar\n2. Não, voltar\n";
        String opcao = "";
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);

        while(opcaoInt != 2) {
            System.out.print(menu);
            System.out.print("\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();
            try {opcaoInt = Integer.parseInt(opcao);}
            catch (Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> {
                    System.out.println("Serviço finalizado com sucesso! Por favor, avalie o serviço prestado!");
                    pedido.setStatus("Finalizado");
                    opcaoInt = 2;
                }

                case 2 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
    }
}

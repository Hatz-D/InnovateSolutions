public class SolicitacaoCtrl {
    public static boolean classeProblema(Cliente cliente, int opcaoInt) {
        boolean placeholder = true;
        switch(opcaoInt) {
            case 1 -> placeholder = Solicitacao.subClasse(cliente, "Assistência Técnica");
            case 2 -> {}
            default -> System.out.print("\nDigite uma opção válida!\n");
        }

        return placeholder;
    }

    public static Boolean subClasse(Cliente cliente, String classe, int opcaoInt) {
        boolean placeholder = true;
        switch (opcaoInt) {
            case 1 -> placeholder = Solicitacao.aparelhos(cliente, TiposServicos.buscaServico(classe, "Aparelhos Eletrônicos"));

            case 2 -> placeholder = Solicitacao.eletrodomesticos(cliente, TiposServicos.buscaServico(classe, "Eletrodomésticos"));

            case 3 -> {}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }

        return placeholder;
    }

    public static Boolean aparelhos(Cliente cliente, TipoServico tiposervico, int opcaoInt) {
        boolean placeholder = true;
        switch (opcaoInt) {
            case 1 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Aparelho de som");

            case 2 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Aquecedor a gás");

            case 3 -> placeholder = Solicitacao.problemas(cliente, tiposervico,"Ar condicionado");

            case 4 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Câmera");

            case 5 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Home theater");

            case 6 -> {}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }
        return placeholder;
    }

    public static Boolean eletrodomesticos(Cliente cliente, TipoServico tiposervico, int opcaoInt) {
        boolean placeholder = true;
        switch (opcaoInt) {
            case 1 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Adega climatizada");

            case 2 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Fogão e cooktop");

            case 3 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Geladeira e freezer");

            case 4 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Lava louça");

            case 5 -> placeholder = Solicitacao.problemas(cliente, tiposervico, "Máquina de costura");

            case 6 -> {}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }
        return placeholder;
    }

    public static Boolean problemas(Cliente cliente, TipoServico servico, String aparelho, int opcaoInt) {
        boolean placeholder = true;
        switch (opcaoInt) {
            case 1 -> placeholder = Solicitacao.marca(cliente, servico, aparelho, "Botão quebrado");

            case 2 -> placeholder = Solicitacao.marca(cliente, servico, aparelho, "Aquece demais");

            case 3 -> placeholder = Solicitacao.marca(cliente, servico, aparelho, "Não liga");

            case 4 -> placeholder = Solicitacao.marca(cliente, servico, aparelho, "Reposição de peças");

            case 5 -> placeholder = Solicitacao.marca(cliente, servico, aparelho, "Limpeza/manutenção");

            case 6 -> {}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }
        return placeholder;
    }

    public static Boolean marca(Cliente cliente, TipoServico servico, String aparelho, String problema, int opcaoInt) {
        boolean placeholder = true;
        switch(opcaoInt) {
            case 1 -> placeholder = Solicitacao.prazo(cliente, servico, aparelho, problema, "Electrolux");

            case 2 -> placeholder = Solicitacao.prazo(cliente, servico, aparelho, problema, "LG");

            case 3 -> placeholder = Solicitacao.prazo(cliente, servico, aparelho, problema, "Brastemp");

            case 4 -> placeholder = Solicitacao.prazo(cliente, servico, aparelho, problema, "Samsung");

            case 5 -> {}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }
        return placeholder;
    }

    public static Boolean prazo(Cliente cliente, TipoServico servico, String aparelho, String problema, String marca, int opcaoInt) {
        boolean placeholder = true;
        switch(opcaoInt) {
            case 1 -> placeholder = Solicitacao.descricao(cliente, servico, aparelho, problema, marca, "O mais cedo possível");

            case 2 -> placeholder = Solicitacao.descricao(cliente, servico, aparelho, problema, marca, "Uma semana");

            case 3 -> placeholder = Solicitacao.descricao(cliente, servico, aparelho, problema, marca, "Duas semanas");

            case 4 -> placeholder = Solicitacao.descricao(cliente, servico, aparelho, problema, marca, "Um mês");

            case 5 -> {}

            default -> System.out.print("\nDigite uma opção válida!\n");
        }
        return placeholder;
    }

    public static Boolean descricao(Cliente cliente, TipoServico servico, String aparelho, String problema, String marca, String prazo, int opcaoInt) {
        boolean placeholder = true;

        return placeholder;
    }

    public static Boolean endereco(Cliente cliente, TipoServico servico, String aparelho, String problema, String marca, String prazo, String descricao, int opcaoInt) {
        boolean placeholder = true;

        return placeholder;
    }

    public static Boolean buscaPrestador(Cliente cliente, TipoServico servico, String aparelho, String problema, String marca, String prazo, String descricao, String endereco, int opcaoInt) {
        boolean placeholder = true;

        return placeholder;
    }

    public static Boolean confirmacao(Cliente cliente, TipoServico tiposervico, String aparelho, String problema, String marca, String prazo, String descricao, String endereco, Prestador prestador, int opcaoInt) {
        boolean placeholder = true;

        return placeholder;
    }

    public static Boolean criaSolicitacao(Cliente cliente, Servico servico, String problema, String marca, String prazo, String descricao, String endereco, Prestador prestador, int opcaoInt) {
        boolean placeholder = true;

        return placeholder;
    }

    public static void pagamento(Pedido pedido, int opcaoInt) {

    }




}

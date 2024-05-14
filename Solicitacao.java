import java.util.List;
import java.util.Scanner;

public class Solicitacao {
    public static void classeProblema(Cliente cliente) {
        String menu1a = "\n************** Tipo de Serviço **************\n\n1. Assistência Técnica\n2. Voltar\n\nSelecione uma opção: ";
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        Boolean placeholder = true;

        while(opcaoInt != 2 && placeholder) {
            System.out.print(menu1a);
            opcao = scanner.nextLine().strip();

            try {opcaoInt = Integer.parseInt(opcao);}

            catch(Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> placeholder = subClasse(cliente, "Assistência Técnica");

                case 2 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
    }

    public static Boolean subClasse(Cliente cliente, String classe) {
        String menu1b = "\n************** Subtipo de Serviço **************\n\n1. Aparelhos Eletrônicos\n2. Eletrodomésticos\n3. Voltar\n\nSelecione uma opção: ";
        int opcaoInt = -1;
        Scanner scanner = new Scanner(System.in);
        String opcao;
        Boolean placeholder = true;

        while(opcaoInt != 3 && placeholder) {
            System.out.print(menu1b);
            opcao = scanner.nextLine().strip();

            try {
                opcaoInt = Integer.parseInt(opcao);
            } catch (Exception e) {
                opcaoInt = -1;
            }

            switch (opcaoInt) {

                case 1 -> placeholder = aparelhos(cliente, TiposServicos.buscaServico(classe, "Aparelhos Eletrônicos"));

                case 2 -> placeholder = eletrodomesticos(cliente, TiposServicos.buscaServico(classe, "Eletrodomésticos"));

                case 3 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }

        return placeholder;
    }

    public static Boolean aparelhos(Cliente cliente, TipoServico tiposervico) {
        String menu1ba = "\n************** Serviço **************\n\n1. Aparelho de som\n2. Aquecedor a gás\n3. Ar condicionado\n4. Câmera\n5. Home theater\n6. Voltar\n\nSelecione uma opção: ";
        int opcaoInt = -1;
        String opcao;
        Scanner scanner = new Scanner(System.in);
        Boolean placeholder = true;

        while(opcaoInt != 6 && placeholder) {
            System.out.print(menu1ba);
            opcao = scanner.nextLine().strip();

            try {
                opcaoInt = Integer.parseInt(opcao);
            } catch (Exception e) {
                opcaoInt = -1;
            }

            switch (opcaoInt) {
                case 1 -> placeholder = problemas(cliente, tiposervico, "Aparelho de som");

                case 2 -> placeholder = problemas(cliente, tiposervico, "Aquecedor a gás");

                case 3 -> placeholder = problemas(cliente, tiposervico,"Ar condicionado");

                case 4 -> placeholder = problemas(cliente, tiposervico, "Câmera");

                case 5 -> placeholder = problemas(cliente, tiposervico, "Home theater");

                case 6 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
        return placeholder;
    }

    public static Boolean eletrodomesticos(Cliente cliente, TipoServico tiposervico) {
        String menu1bb = "\n************** Serviço **************\n\n1. Adega climatizada\n2. Fogão e cooktop\n3. Geladeira e freezer\n4. Lava louça\n5. Máquina de costura\n6. Voltar\n\nSelecione uma opção: ";
        int opcaoInt = -1;
        String opcao;
        Scanner scanner = new Scanner(System.in);
        Boolean placeholder = true;

        while(opcaoInt != 6 && placeholder) {
            System.out.print(menu1bb);
            opcao = scanner.nextLine().strip();

            try {
                opcaoInt = Integer.parseInt(opcao);
            } catch (Exception e) {
                opcaoInt = -1;
            }

            switch (opcaoInt) {
                case 1 -> placeholder = problemas(cliente, tiposervico, "Adega climatizada");

                case 2 -> placeholder = problemas(cliente, tiposervico, "Fogão e cooktop");

                case 3 -> placeholder = problemas(cliente, tiposervico, "Geladeira e freezer");

                case 4 -> placeholder = problemas(cliente, tiposervico, "Lava louça");

                case 5 -> placeholder = problemas(cliente, tiposervico, "Máquina de costura");

                case 6 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
        return placeholder;
    }

    public static Boolean problemas(Cliente cliente, TipoServico servico, String aparelho) {
        String menuproblema = "\n************** Detalhamento do Problema **************\n\n1. Botão quebrado\n2. Aquece demais\n3. Não liga\n4. Reposição de peças\n5. Limpeza/manutenção\n6. Voltar\n\nSelecione uma opção: ";
        int opcaoInt = -1;
        String opcao;
        Scanner scanner = new Scanner(System.in);
        Boolean placeholder = true;

        while(opcaoInt != 6 && placeholder) {
            System.out.print(menuproblema);
            opcao = scanner.nextLine().strip();

            try {
                opcaoInt = Integer.parseInt(opcao);
            } catch (Exception e) {
                opcaoInt = -1;
            }

            switch (opcaoInt) {
                case 1 -> placeholder = marca(cliente, servico, aparelho, "Botão quebrado");

                case 2 -> placeholder = marca(cliente, servico, aparelho, "Aquece demais");

                case 3 -> placeholder = marca(cliente, servico, aparelho, "Não liga");

                case 4 -> placeholder = marca(cliente, servico, aparelho, "Reposição de peças");

                case 5 -> placeholder = marca(cliente, servico, aparelho, "Limpeza/manutenção");

                case 6 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }
        return placeholder;
    }

    public static Boolean marca(Cliente cliente, TipoServico servico, String aparelho, String problema) {
        String menumarca = "\n************** Marca do Produto **************\n\n1. Electrolux\n2. LG\n3. Brastemp\n4. Samsung\n5. Voltar\n\nSelecione uma opção: ";
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        Boolean placeholder = true;

        while(opcaoInt != 5 && placeholder) {
            System.out.print(menumarca);
            opcao = scanner.nextLine().strip();

            try {opcaoInt = Integer.parseInt(opcao);}

            catch(Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> placeholder = prazo(cliente, servico, aparelho, problema, "Electrolux");

                case 2 -> placeholder = prazo(cliente, servico, aparelho, problema, "LG");

                case 3 -> placeholder = prazo(cliente, servico, aparelho, problema, "Brastemp");

                case 4 -> placeholder = prazo(cliente, servico, aparelho, problema, "Samsung");

                case 5 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }

        return placeholder;
    }

    public static Boolean prazo(Cliente cliente, TipoServico servico, String aparelho, String problema, String marca) {
        String menuprazo = "\n************** Prazo do Serviço **************\n\n1. O mais cedo possível\n2. Uma semana\n3. Duas semanas\n4. Um mês\n5. Voltar\n\nSelecione uma opção: ";
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        Boolean placeholder = true;

        while(opcaoInt != 5 && placeholder) {
            System.out.print(menuprazo);
            opcao = scanner.nextLine().strip();

            try {opcaoInt = Integer.parseInt(opcao);}

            catch(Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> placeholder = descricao(cliente, servico, aparelho, problema, marca, "O mais cedo possível");

                case 2 -> placeholder = descricao(cliente, servico, aparelho, problema, marca, "Uma semana");

                case 3 -> placeholder = descricao(cliente, servico, aparelho, problema, marca, "Duas semanas");

                case 4 -> placeholder = descricao(cliente, servico, aparelho, problema, marca, "Um mês");

                case 5 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }

        return placeholder;
    }

    public static Boolean descricao(Cliente cliente, TipoServico servico, String aparelho, String problema, String marca, String prazo) {
        String menudescricao = "\n************** Descrição do Serviço **************\n\n1. Insira uma descrição\n2. Voltar\n\nSelecione uma opção: ";
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        Boolean placeholder = true;

        while(opcaoInt != 2 && placeholder) {
            System.out.print(menudescricao);
            opcao = scanner.nextLine().strip();

            try {opcaoInt = Integer.parseInt(opcao);}
            catch(Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> {
                    String descricao;
                    System.out.print("Insira a descrição do serviço: ");
                    descricao = scanner.nextLine();
                    placeholder = endereco(cliente, servico, aparelho, problema, marca, prazo, descricao);
                }

                case 2 -> {continue;}

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }

        return placeholder;
    }

    public static Boolean endereco(Cliente cliente, TipoServico servico, String aparelho, String problema, String marca, String prazo, String descricao) {
        String menu = "\n************** Endereço do Serviço **************\n";
        String endereco;
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        Boolean placeholder = true;

        while(cliente.getListaEnderecos().isEmpty()) {
            System.out.print("\n************** Endereços **************\n\\nNão há nenhuma opção de endereço cadastrada, por favor cadastre uma opção!\n\n1. Cadastrar\n2. Voltar\n\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();

            try {opcaoInt = Integer.parseInt(opcao);}
            catch(Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> {
                    Perfil.endereco(cliente);
                }

                case 2 -> {
                    return false;
                }

                default -> System.out.print("\nDigite uma opção válida!\n");
            }
        }

        while(opcaoInt != cliente.getListaEnderecos().size()+1 && placeholder) {
            System.out.println(menu);
            for (int i = 1; i <= cliente.getListaEnderecos().size(); ++i) {
                System.out.print(i + ". ");
                System.out.println(cliente.getListaEnderecos().get(i-1));
            }

            endereco = "";
            System.out.println(cliente.getListaEnderecos().size()+1 + ". Voltar");
            System.out.print("\nSelecione uma opção: ");
            opcao = scanner.nextLine();

            try {
                opcaoInt = Integer.parseInt(opcao);
                if(opcaoInt != cliente.getListaEnderecos().size()+1) {endereco = cliente.getListaEnderecos().get(opcaoInt-1);}
            }

            catch (Exception e) {
                System.out.print("\nDigite uma opção válida!\n");
            }

            if(!endereco.isEmpty()) {placeholder = buscaPrestador(cliente, servico, aparelho, problema, marca, prazo, descricao, endereco);}
        }

        return placeholder;
    }

    public static Boolean buscaPrestador(Cliente cliente, TipoServico servico, String aparelho, String problema, String marca, String prazo, String descricao, String endereco) {
        List<Prestador> lista = Prestadores.encontraPrestador(servico, aparelho);
        Prestador prestador;
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        Boolean placeholder = true;

        while(opcaoInt != lista.size()+1 && placeholder) {
            System.out.println("\n************** Prestadores Disponíveis **************\n");
            for (int i = 1; i <= lista.size(); ++i) {
                System.out.print(i + ". ");
                System.out.println(lista.get(i-1) + " - Orçamento: R$" + String.format("%.2f", (lista.get(i-1).getServico(servico, aparelho).getOrcamento())));
            }

            prestador = null;
            System.out.println(lista.size()+1 + ". Voltar");
            System.out.print("\nSelecione uma opção: ");
            opcao = scanner.nextLine();

            try {
                opcaoInt = Integer.parseInt(opcao);
                if(opcaoInt != lista.size()+1) {prestador = lista.get(opcaoInt-1);}
            }

            catch (Exception e) {
                System.out.print("\nDigite uma opção válida!\n");
            }

            if(prestador != null) {placeholder = confirmacao(cliente, servico, aparelho, problema, marca, prazo, descricao, endereco, prestador);}
        }

        return placeholder;
    }

    public static Boolean confirmacao(Cliente cliente, TipoServico tiposervico, String aparelho, String problema, String marca, String prazo, String descricao, String endereco, Prestador prestador) {
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        boolean placeholder = true;

        while(opcaoInt != 2 && placeholder) {
            System.out.println("\n************** Confirmação **************\n\nVocê deseja confirmar a solicitação do seguinte serviço? :\n");
            System.out.println(tiposervico + "\nProblema: " + problema + "\nMarca: " + marca + "\nPrazo: " + prazo + "\nPrestador: " + prestador + "\nEndereço: " + endereco + "\nOrçamento: R$" + String.format("%.2f", prestador.getServico(tiposervico, aparelho).getOrcamento()) + "\n");
            System.out.print("1. Sim\n2. Não\n\nSelecione uma opção: ");
            opcao = scanner.nextLine().strip();

            try {opcaoInt = Integer.parseInt(opcao);}
            catch(Exception e) {opcaoInt = -1;}

            switch(opcaoInt) {
                case 1 -> placeholder = criaSolicitacao(cliente, prestador.getServico(tiposervico, aparelho), problema, marca, prazo, descricao, endereco, prestador);

                case 2 -> {continue;}
            }
        }

        return placeholder;
    }

    public static Boolean criaSolicitacao(Cliente cliente, Servico servico, String problema, String marca, String prazo, String descricao, String endereco, Prestador prestador) {
        Pedido pedido = new Pedido(prestador, cliente, prazo, descricao, servico, endereco, problema, marca);
        prestador.addPedido(pedido);
        cliente.addPedido(pedido);

        return false;
    }

    public static void pagamento(Pedido pedido) {
        String menu = "\n************** Pagamento **************\n\nSelecione a opção de pagamento dentre as opções cadastradas:\n";
        Cliente cliente = pedido.getCliente();
        Scanner scanner = new Scanner(System.in);
        int opcaoInt = -1;
        String opcao;
        String pagamento;

        if(cliente.getListaPagamentos().isEmpty()) {
            System.out.println("\nNão há nenhuma opção de pagamento cadastrada, por favor cadastre uma opção!");
            return;
        }

        while(opcaoInt != cliente.getListaPagamentos().size()+1) {
            System.out.println(menu);
            for (int i = 1; i <= cliente.getListaPagamentos().size(); ++i) {
                System.out.print(i + ". ");
                System.out.println(cliente.getListaPagamentos().get(i-1));
            }

            pagamento = "";
            System.out.println(cliente.getListaPagamentos().size()+1 + ". Voltar");
            System.out.print("\nSelecione uma opção: ");
            opcao = scanner.nextLine();

            try {
                opcaoInt = Integer.parseInt(opcao);
                if(opcaoInt != cliente.getListaPagamentos().size()+1) {pagamento = cliente.getListaPagamentos().get(opcaoInt-1);}
            }

            catch (Exception e) {System.out.print("\nDigite uma opção válida!\n");}

            if(!pagamento.isEmpty()) {
                int opcaoInt2 = -1;
                while(opcaoInt2 != 2) {
                    System.out.println("\n************** Confirmação de Pagamento **************\n\nTem certeza que você deseja efetuar o pagamento com: " + pagamento + "?\n\n1. Sim\n2. Não");
                    System.out.print("\nSelecione uma opção: ");
                    opcao = scanner.nextLine();

                    try {opcaoInt2 = Integer.parseInt(opcao);}
                    catch (Exception e) {opcaoInt2 = -1;}

                    switch(opcaoInt2) {
                        case 1 -> {
                            pedido.setStatus("Aberto");
                            pedido.setPagamento(cliente.getListaPagamentos().get(opcaoInt-1));
                            opcaoInt = cliente.getListaPagamentos().size()+1;
                            opcaoInt2 = 2;
                        }

                        case 2 -> {continue;}

                        default -> System.out.print("\nDigite uma opção válida!\n");
                    }
                }
            }
        }
    }
}

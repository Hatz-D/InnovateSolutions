import java.util.LinkedList;
import java.util.List;

public class Prestadores {
    private static List<Prestador> listaPrestadores = new LinkedList<>();

    public static List<Prestador> getListaPrestadores() {return listaPrestadores;}

    public static void setListaPrestadores(List<Prestador> listaPrestadores) {Prestadores.listaPrestadores = listaPrestadores;}

    public static void addPrestador(Prestador prestador) {listaPrestadores.add(prestador);}

    public static void removePrestador(Prestador prestador) {listaPrestadores.remove(prestador);}

    public static List<Prestador> encontraPrestador(TipoServico servico) {
        List<Prestador> prestadores = new LinkedList<>();
        for(int i = 0; i < listaPrestadores.size(); ++i) {
            for(int j = 0; j < listaPrestadores.get(i).getListaServicos().size(); ++j) {
                if(listaPrestadores.get(i).getListaServicos().get(j).getServico() == servico) {prestadores.add(listaPrestadores.get(i));}
            }
        }

        return prestadores;
    }

    public static void populaFila(int n) {
        for(int i = 0; i < n; ++i) {
            String nome = "Prestador " + i;
            double nota = Math.random() * 100000 % 5;
            double orcamento = Math.random() * 1000;
            Prestador prest = new Prestador(nome, nota, "Descrição do prestador " + i, "Conta bancária do prestador " + i);

            TipoServico servico = Servicos.getRandomServico();
            prest.addServico(servico, orcamento);
            servico.addPrestador(prest);
            listaPrestadores.add(prest);
        }
    }

}

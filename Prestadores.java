import java.util.LinkedList;
import java.util.List;

public class Prestadores {
    private List<Prestador> listaPrestadores;

    public Prestadores() {
        listaPrestadores = new LinkedList<>();
    }

    public void addPrestador(Prestador prestador) {listaPrestadores.add(prestador);}

    public void removePrestador(Prestador prestador) {listaPrestadores.remove(prestador);}

    public List<Prestador> encontraPrestador(TipoServico servico) {
        List<Prestador> prestadores = new LinkedList<>();
        for(int i = 0; i < listaPrestadores.size(); ++i) {
            for(int j = 0; j < listaPrestadores.get(i).getListaServicos().size(); ++j) {
                if(listaPrestadores.get(i).getListaServicos().get(j).getServico() == servico) {prestadores.add(listaPrestadores.get(i));}
            }
        }

        return prestadores;
    }

    public void populaFila(int n, Servicos listaServicos) {
        for(int i = 0; i < n; ++i) {
            StringBuilder nome = new StringBuilder();
            nome.append("Prestador ").append(i);
            double nota = Math.random() * 100000 % 5;
            double orcamento = Math.random() * 1000;
            StringBuilder descricao = new StringBuilder();
            descricao.append("Descrição do prestador ").append(i);
            StringBuilder contaBanaria = new StringBuilder();
            contaBanaria.append("Conta bancária do prestador ").append(i);
            Prestador prest = new Prestador(nome.toString(), nota, descricao.toString(), contaBanaria.toString());

            TipoServico servico = listaServicos.getRandomServico();
            prest.addServico(servico, orcamento);
            servico.addPrestador(prest);
            listaPrestadores.add(prest);
        }
    }

}

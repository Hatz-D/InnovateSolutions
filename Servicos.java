import java.util.List;
import java.util.LinkedList;

public class Servicos {
    private static List<TipoServico> listaServicos;

    public Servicos() {
        listaServicos = new LinkedList<>();
        populaServicos();
    }

    public static List<TipoServico> getListaServicos() {return listaServicos;}

    public static void setListaServicos(List<TipoServico> listaServicos) {Servicos.listaServicos = listaServicos;}

    public static void addServico(TipoServico tipoServico) {listaServicos.add(tipoServico);}

    public static void removeServico(TipoServico tipoServico) {listaServicos.remove(tipoServico);}

    public static TipoServico buscaServico(String classe, String subclasse, String tipo) {
        for(int i = 0; i < listaServicos.size(); ++i) {
            if(listaServicos.get(i).getClasse().equals(classe) && listaServicos.get(i).getSubclasse().equals(subclasse) && listaServicos.get(i).getTipo().equals(tipo)) {
                return listaServicos.get(i);
            }
        }
        return null;
    }

    public static TipoServico getRandomServico() {return listaServicos.get((int) (Math.random() * 10000) % listaServicos.size());}

    public static void populaServicos() {
        TipoServico servico0 = new TipoServico("Assistência Técnica","Aparelhos Eletrônicos","Aparelho de som");
        TipoServico servico1 = new TipoServico("Assistência Técnica","Aparelhos Eletrônicos","Aquecedor a gás");
        TipoServico servico2 = new TipoServico("Assistência Técnica","Aparelhos Eletrônicos","Ar condicionado");
        TipoServico servico3 = new TipoServico("Assistência Técnica","Aparelhos Eletrônicos","Câmera");
        TipoServico servico4 = new TipoServico("Assistência Técnica","Aparelhos Eletrônicos","Home theater");
        TipoServico servico5 = new TipoServico("Assistência Técnica","Eletrodomésticos","Adega climatizada");
        TipoServico servico6 = new TipoServico("Assistência Técnica","Eletrodomésticos","Fogão e cooktop");
        TipoServico servico7 = new TipoServico("Assistência Técnica","Eletrodomésticos","Geladeira e freezer");
        TipoServico servico8 = new TipoServico("Assistência Técnica","Eletrodomésticos","Lava louça");
        TipoServico servico9 = new TipoServico("Assistência Técnica","Eletrodomésticos","Máquina de costura");

        listaServicos.add(servico0);
        listaServicos.add(servico1);
        listaServicos.add(servico2);
        listaServicos.add(servico3);
        listaServicos.add(servico4);
        listaServicos.add(servico5);
        listaServicos.add(servico6);
        listaServicos.add(servico7);
        listaServicos.add(servico8);
        listaServicos.add(servico9);
    }
}

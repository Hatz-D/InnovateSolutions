import java.util.List;
import java.util.LinkedList;

public class TiposServicos {
    private static List<TipoServico> listaServicos = new LinkedList<>();

    public static List<TipoServico> getListaServicos() {return listaServicos;}

    public static void setListaServicos(List<TipoServico> listaServicos) {TiposServicos.listaServicos = listaServicos;}

    public static void addServico(TipoServico tipoServico) {listaServicos.add(tipoServico);}

    public static void removeServico(TipoServico tipoServico) {listaServicos.remove(tipoServico);}

    public static TipoServico buscaServico(String classe, String subclasse) {
        for(int i = 0; i < listaServicos.size(); ++i) {
            if(listaServicos.get(i).getClasse().equals(classe) && listaServicos.get(i).getSubclasse().equals(subclasse)) {
                return listaServicos.get(i);
            }
        }
        return null;
    }

    public static TipoServico getRandomServico() {return listaServicos.get((int) (Math.random() * 10000) % listaServicos.size());}

    public static void populaServicos() {
        TipoServico servico0 = new TipoServico("Assistência Técnica","Aparelhos Eletrônicos");
        TipoServico servico1 = new TipoServico("Assistência Técnica","Eletrodomésticos");

        listaServicos.add(servico0);
        listaServicos.add(servico1);
    }
}

import java.util.LinkedList;
import java.util.List;

public class TipoServico {
    private String classe;
    private String subclasse;

    public TipoServico(String classe, String subclasse) {
        this.classe = classe;
        this.subclasse = subclasse;
    }

    public String getClasse() {return classe;}

    public void setClasse(String classe) {this.classe = classe;}

    public String getSubclasse() {return subclasse;}

    public void setSubclasse(String subclasse) {this.subclasse = subclasse;}

    @Override
    public String toString() {
        return classe + " - " + subclasse;
    }
}

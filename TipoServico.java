import java.util.LinkedList;
import java.util.List;

public class TipoServico {
    private String classe;
    private String subclasse;
    private String tipo;
    private List<Prestador> listaPrestadores;

    public TipoServico(String classe, String subclasse, String tipo) {
        this.classe = classe;
        this.subclasse = subclasse;
        this.tipo = tipo;
        listaPrestadores = new LinkedList<>();
    }

    public String getClasse() {return classe;}

    public void setClasse(String classe) {this.classe = classe;}

    public String getSubclasse() {return subclasse;}

    public void setSubclasse(String subclasse) {this.subclasse = subclasse;}

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    public List<Prestador> getFilaPrestadores() {return listaPrestadores;}

    public void setFilaPrestadores(List<Prestador> listaPrestadores) {this.listaPrestadores = listaPrestadores;}

    public void addPrestador(Prestador prestador) {listaPrestadores.add(prestador);}

    public void removePrestador(Prestador prestador) {listaPrestadores.remove(prestador);}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(classe).append(" - ").append(subclasse).append(" - ").append(tipo);
        return sb.toString();
    }
}

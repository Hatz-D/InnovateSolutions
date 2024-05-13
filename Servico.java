public class Servico {
    private String classe;
    private String subclasse;
    private double orcamento;
    private String aparelho;

    public Servico(String classe, String subclasse, String aparelho, double orcamento) {
        this.classe = classe;
        this.subclasse = subclasse;
        this.aparelho = aparelho;
        this.orcamento = orcamento;
    }

    public String getClasse() {return classe;}

    public void setClasse(String classe) {this.classe = classe;}

    public String getSubclasse() {return subclasse;}

    public void setSubclasse(String subclasse) {this.subclasse = subclasse;}

    public double getOrcamento() {return orcamento;}

    public void setOrcamento(double orcamento) {this.orcamento = orcamento;}

    public String getAparelho() {return aparelho;}

    public void setAparelho(String aparelho) {this.aparelho = aparelho;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(classe).append(" - ").append(subclasse).append(" - ").append(aparelho);
        return sb.toString();
    }
}

public class Servico {
    private TipoServico tiposervico;
    private double orcamento;
    private String aparelho;

    public Servico(TipoServico tiposervico, String aparelho, double orcamento) {
        this.tiposervico = tiposervico;
        this.aparelho = aparelho;
        this.orcamento = orcamento;
    }

    public TipoServico getTiposervico() {return tiposervico;}

    public void setTiposervico(TipoServico tiposervico) {this.tiposervico = tiposervico;}

    public double getOrcamento() {return orcamento;}

    public void setOrcamento(double orcamento) {this.orcamento = orcamento;}

    public String getAparelho() {return aparelho;}

    public void setAparelho(String aparelho) {this.aparelho = aparelho;}

    @Override
    public String toString() {
        return tiposervico.toString() + " - " + aparelho;
    }
}

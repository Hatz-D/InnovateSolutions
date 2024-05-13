public class ServicoOrcamento {
    private TipoServico servico;
    private double orcamento;

    public ServicoOrcamento(TipoServico servico, double orcamento) {
        this.servico = servico;
        this.orcamento = orcamento;
    }

    public TipoServico getServico() {return servico;}

    public void setServico(TipoServico servico) {this.servico = servico;}

    public double getOrcamento() {return orcamento;}

    public void setOrcamento(double orcamento) {this.orcamento = orcamento;}
}

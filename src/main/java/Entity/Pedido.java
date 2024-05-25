package Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido {
    private Prestador prestador;
    private Cliente cliente;
    private String prazo;
    private double avaliacao;
    private String comentario;
    private String status;
    private String descricao;
    private Servico servico;
    private String adicionalProblema;
    private String adicionalMarca;
    private String data;
    private String endereco;
    private String pagamento;

    public Pedido(Prestador prestador, Cliente cliente, String prazo, String descricao, Servico servico, String endereco) {
        this(prestador, cliente, prazo, descricao, servico, endereco, "", "");
    }

    public Pedido(Prestador prestador, Cliente cliente, String prazo, String descricao, Servico servico, String endereco, String adicionalProblema, String adicionalMarca) {
        this.prestador = prestador;
        this.cliente = cliente;
        this.prazo = prazo;
        this.descricao = descricao;
        this.servico = servico;
        this.adicionalMarca = adicionalMarca;
        this.adicionalProblema = adicionalProblema;
        this.status = "Pagamento";
        this.pagamento = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = LocalDate.now().format(formatter);
        this.avaliacao = -1;
        this.endereco = endereco;
        this.pagamento = pagamento;
        this.comentario = "";
    }

    public Prestador getPrestador() {return prestador;}

    public void setPrestador(Prestador prestador) {this.prestador = prestador;}

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public String getPrazo() {return prazo;}

    public void setPrazo(String prazo) {this.prazo = prazo;}

    public double getAvaliacao() {return avaliacao;}

    public void setAvaliacao(double avaliacao) {this.avaliacao = avaliacao;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public Servico getServico() {return servico;}

    public void setServico(Servico servico) {this.servico = servico;}

    public String getAdicionalProblema() {return adicionalProblema;}

    public void setAdicionalProblema(String adicionalProblema) {this.adicionalProblema = adicionalProblema;}

    public String getAdicionalMarca() {return adicionalMarca;}

    public void setAdicionalMarca(String adicionalMarca) {this.adicionalMarca = adicionalMarca;}

    public String getFinalizado() {return status;}

    public void setFinalizado(String status) {this.status = status;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getData() {return data;}

    public void setData(String data) {this.data = data;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getPagamento() {return pagamento;}

    public void setPagamento(String pagamento) {this.pagamento = pagamento;}

    public String getComentario() {return comentario;}

    public void setComentario(String comentario) {this.comentario = comentario;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(servico).append(" - Status: ").append(status);
        return sb.toString();
    }
}

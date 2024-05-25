package Entity;

import java.util.LinkedList;
import java.util.List;

public class Prestador {
    private String nome;
    private double nota;
    private String descricao;
    private String contaBancaria;
    private List<Servico> listaServicos;
    private List<Pedido> listaPedidos;

    public Prestador(String nome, double nota, String descricao, String contaBancaria) {
        this.nome = nome;
        this.nota = nota;
        this.descricao = descricao;
        this.contaBancaria = contaBancaria;
        listaServicos = new LinkedList<>();
        listaPedidos = new LinkedList<>();
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public List<Servico> getListaServicos() {return listaServicos;}

    public void setListaServicos(List<Servico> listaServicos) {this.listaServicos = listaServicos;}

    public double getNota() {return nota;}

    public void setNota(double nota) {this.nota = nota;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getContaBancaria() {return contaBancaria;}

    public void setContaBancaria(String contaBancaria) {this.contaBancaria = contaBancaria;}

    public List<Pedido> getListaPedidos() {return listaPedidos;}

    public void addPedido(Pedido pedido) {listaPedidos.add(pedido);}

    public void removePedido(Pedido pedido) {listaPedidos.remove(pedido);}

    public void addServico(TipoServico tiposervico, String aparelho, double orcamento) {
        Servico servico = new Servico(tiposervico, aparelho, orcamento);
        listaServicos.add(servico);
    }

    public void removeServico(Servico servico) {listaServicos.remove(servico);}

    public Servico getServico(TipoServico servico, String aparelho) {
        for(int i = 0; i < listaServicos.size(); ++i) {
            if(listaServicos.get(i).getTiposervico() == servico && listaServicos.get(i).getAparelho().equals(aparelho)) {
                return listaServicos.get(i);
            }
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome()).append(" - ").append(getDescricao()).append(" - Avaliação: ").append(String.format("%.2f", getNota()));
        return sb.toString();
    }
}

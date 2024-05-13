import java.util.LinkedList;
import java.util.List;

public class Prestador {
    private String nome;
    private double nota;
    private String descricao;
    private String contaBancaria;
    private List<ServicoOrcamento> listaServicos;
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

    public List<ServicoOrcamento> getListaServicos() {return listaServicos;}

    public void setListaServicos(List<ServicoOrcamento> listaServicos) {this.listaServicos = listaServicos;}

    public double getNota() {return nota;}

    public void setNota(double nota) {this.nota = nota;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getContaBancaria() {return contaBancaria;}

    public void setContaBancaria(String contaBancaria) {this.contaBancaria = contaBancaria;}

    public List<Pedido> getListaPedidos() {return listaPedidos;}

    public void addPedido(Pedido pedido) {listaPedidos.add(pedido);}

    public void removePedido(Pedido pedido) {listaPedidos.remove(pedido);}

    public void addServico(TipoServico servico, double orcamento) {
        ServicoOrcamento servicoorcamento = new ServicoOrcamento(servico, orcamento);
        listaServicos.add(servicoorcamento);
    }

    public void removeServico(TipoServico servico) {
        for(int i = 0; i < listaServicos.size(); ++i) {
            if(listaServicos.get(i).getServico() == servico) {
                listaServicos.remove(i);
                return;
            }
        }
    }

    public double getOrcamento(TipoServico servico) {
        for(int i = 0; i < listaServicos.size(); ++i) {
            if(listaServicos.get(i).getServico() == servico) {return listaServicos.get(i).getOrcamento();}
        }

        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome()).append(" - ").append(getDescricao()).append(" - Avaliação: ").append(String.format("%.2f", getNota()));
        return sb.toString();
    }
}
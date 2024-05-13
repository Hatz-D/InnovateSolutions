import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<String> listaEnderecos;
    private List<String> listaPagamentos;
    private List<Pedido> listaPedidos;

    public Cliente(String nome) {
        this.nome = nome;
        listaEnderecos = new LinkedList<>();
        listaPagamentos = new LinkedList<>();
        listaPedidos = new LinkedList<>();
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public List<String> getListaEnderecos() {return listaEnderecos;}

    public void setListaEnderecos(List<String> listaEnderecos) {this.listaEnderecos = listaEnderecos;}

    public List<String> getListaPagamentos() {return listaPagamentos;}

    public void setListaPagamentos(List<String> listaPagamentos) {this.listaPagamentos = listaPagamentos;}

    public void setListaPedidos(List<Pedido> listaPedidos) {this.listaPedidos = listaPedidos;}

    public List<Pedido> getListaPedidos() {return listaPedidos;}

    public String getEnderecos() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < listaEnderecos.size(); ++i) {
            sb.append("\n").append(i+1).append(". ").append(listaEnderecos.get(i));
        }
        return sb.toString();
    }

    public void addEndereco(String endereco) {listaEnderecos.add(endereco);}

    public void removeEndereco(String endereco) {listaEnderecos.remove(endereco);}

    public String getPagamentos() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < listaPagamentos.size(); ++i) {
            sb.append("\n").append(i+1).append(". ").append(listaPagamentos.get(i));
        }
        return sb.toString();
    }

    public void addPagamento(String pagamento) {listaPagamentos.add(pagamento);}

    public void removePagamento(String pagamento) {listaPagamentos.remove(pagamento);}

    public String getPedidos() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < listaPedidos.size(); ++i) {
            sb.append("\n").append(i+1).append(". ").append(listaPedidos.get(i));
        }
        return sb.toString();
    }

    public void addPedido(Pedido pedido) {listaPedidos.add(pedido);}

    public void removePedido(Pedido pedido) {listaPedidos.remove(pedido);}

    @Override
    public String toString() {return nome;}
}

package Entity;

import java.util.LinkedList;
import java.util.List;

public class Clientes {
    private List<Cliente> listaClientes;

    public Clientes() {
        listaClientes = new LinkedList<>();
    }

    public void addCliente(Cliente cliente) {listaClientes.add(cliente);}

    public void removeCliente(Cliente cliente) {listaClientes.remove(cliente);}
}

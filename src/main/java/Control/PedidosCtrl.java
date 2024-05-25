package Control;

import Boundary.*;
import Entity.*;

public class PedidosCtrl {
    public static void listaPedidos(Cliente cliente, int opcaoInt) {
        Pedido pedido = null;
        if(opcaoInt != cliente.getListaPedidos().size()+1) {pedido = cliente.getListaPedidos().get(opcaoInt-1);}
        if(pedido != null) {Acompanhamento.acompanhamento(pedido);}
    }
}

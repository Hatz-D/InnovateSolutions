package Control;

import Entity.Cliente;
import Entity.Prestador;
import Entity.TipoServico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolicitacaoCtrlTeste {

    @BeforeEach
    public void setUp() {
        // Qualquer configuração necessária antes de cada teste
    }

    @Test
    public void testInicializaListas() {
        // Chama o método que será testado
        SolicitacaoCtrl.inicializaListas();

        // Verifica se as listas foram inicializadas corretamente
        List<Cliente> clientes = SolicitacaoCtrl.getClientes();
        List<Prestador> prestadores = SolicitacaoCtrl.getPrestadores();
        List<TipoServico> tipoServicos = SolicitacaoCtrl.getTipoServicos();

        assertNotNull(clientes, "A lista de clientes não deve ser nula");
        assertNotNull(prestadores, "A lista de prestadores não deve ser nula");
        assertNotNull(tipoServicos, "A lista de tipos de serviço não deve ser nula");

        // Verifica se as listas estão inicializadas conforme esperado
        assertTrue(clientes.isEmpty(), "A lista de clientes deve estar vazia após a inicialização");
        assertTrue(prestadores.isEmpty(), "A lista de prestadores deve estar vazia após a inicialização");
        assertTrue(tipoServicos.isEmpty(), "A lista de tipos de serviço deve estar vazia após a inicialização");
    }
}

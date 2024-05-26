import Boundary.*;
import Entity.*;
import Control.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.Rule;
import org.mockito.MockedStatic;

public class AcompanhamentoTeste {

    @Rule
    public final TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private Pedido pedido;
    private MockedStatic<AcompanhamentoCtrl> acompanhamentoCtrlMockedStatic;

    @BeforeEach
    void setUp() {
        TipoServico tipoServico = new TipoServico("ClasseTeste", "SubclasseTeste");
        Servico servico = new Servico(tipoServico, "AparelhoTeste", 100.00);
        Prestador prestador = new Prestador("PrestadorTeste", 9.5, "DescricaoTeste", "ContaTeste");
        Cliente cliente = new Cliente("ClienteTeste");
        pedido = new Pedido(prestador, cliente, "2 meses", "DescricaoTeste", servico, "EnderecoTeste");

        acompanhamentoCtrlMockedStatic = mockStatic(AcompanhamentoCtrl.class);
    }

    @Test
    public void testAcompanhamento() {
        systemInMock.provideLines("3"); // Simula a entrada do usuário "3" para sair do loop.

        Acompanhamento.acompanhamento(pedido);

        String output = systemOutRule.getLog();

        // Verifique se algumas strings esperadas estão presentes na saída
        assertTrue(output.contains("************** Acompanhamento de Pedido **************"));
        assertTrue(output.contains("Tipo de Serviço: ClasseTeste - SubclasseTeste"));
        assertTrue(output.contains("Produto: AparelhoTeste - Marca: AdicionalMarcaTeste"));
        assertTrue(output.contains("Problema: ProblemaTeste"));
        assertTrue(output.contains("Descrição do Serviço: DescricaoTeste"));
        assertTrue(output.contains("Data de Solicitação: DataTeste"));
        assertTrue(output.contains("Prazo para a Realização: PrazoTeste"));
        assertTrue(output.contains("Prestador do Serviço: PrestadorTeste"));
        assertTrue(output.contains("Endereço: EnderecoTeste"));
        assertTrue(output.contains("Orçamento do Serviço: R$100,00"));
    }

    @Test
    public void testFinalizarPedido() {
        systemInMock.provideLines("2"); // Simula a entrada do usuário "2" para sair do loop.

        Acompanhamento.finalizarPedido(pedido);

        String output = systemOutRule.getLog();

        // Verifique se algumas strings esperadas estão presentes na saída
        assertTrue(output.contains("************** Finalização do Serviço **************"));
        assertTrue(output.contains("Tem certeza que você deseja finalizar o serviço?"));
    }
}

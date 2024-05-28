package Boundary;

import Entity.Cliente;
import Entity.TipoServico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitacaoTeste {

    private Cliente cliente;
    private TipoServico tipoServico;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente("John Doe", "johndoe@example.com", "123456789");
        tipoServico = new TipoServico("Assistência Técnica");
    }

    @Test
    public void testClasseProblema() {
        String input = "1\n2\n"; // Simula entrada de usuário para selecionar "Assistência Técnica" e depois "Voltar"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Solicitacao.classeProblema(cliente);
        // Não há uma saída esperada específica para verificar neste caso, já que o método não retorna nada
        assertTrue(true); // Apenas verifica se o método executa sem erros
    }

    @Test
    public void testSubClasse() {
        String input = "1\n3\n"; // Simula entrada de usuário para selecionar "Aparelhos Eletrônicos" e depois "Voltar"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Boolean result = Solicitacao.subClasse(cliente, "Assistência Técnica");
        assertTrue(result); // Verifica se o método retorna true
    }

    @Test
    public void testAparelhos() {
        String input = "1\n6\n"; // Simula entrada de usuário para selecionar "Aparelho de som" e depois "Voltar"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Boolean result = Solicitacao.aparelhos(cliente, tipoServico);
        assertTrue(result); // Verifica se o método retorna true
    }

    @Test
    public void testEletrodomesticos() {
        String input = "1\n6\n"; // Simula entrada de usuário para selecionar "Adega climatizada" e depois "Voltar"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Boolean result = Solicitacao.eletrodomesticos(cliente, tipoServico);
        assertTrue(result); // Verifica se o método retorna true
    }

    @Test
    public void testProblemas() {
        String input = "1\n6\n"; // Simula entrada de usuário para selecionar "Botão quebrado" e depois "Voltar"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Boolean result = Solicitacao.problemas(cliente, tipoServico, "Aparelho de som");
        assertTrue(result); // Verifica se o método retorna true
    }

    @Test
    public void testMarca() {
        String input = "1\n5\n"; // Simula entrada de usuário para selecionar "Electrolux" e depois "Voltar"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Boolean result = Solicitacao.marca(cliente, tipoServico, "Aparelho de som", "Botão quebrado");
        assertTrue(result); // Verifica se o método retorna true
    }

    @Test
    public void testPrazo() {
        String input = "1\n5\n"; // Simula entrada de usuário para selecionar "O mais cedo possível" e depois "Voltar"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Boolean result = Solicitacao.prazo(cliente, tipoServico, "Aparelho de som", "Botão quebrado", "Electrolux");
        assertTrue(result); // Verifica se o método retorna true
    }

    @Test
    public void testDescricao() {
        String input = "1\nDescrição do serviço\n2\n"; // Simula entrada de usuário para inserir uma descrição e depois "Voltar"
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Boolean result = Solicitacao.descricao(cliente, tipoServico, "Aparelho de som", "Botão quebrado", "Electrolux", "O mais cedo possível");
        assertTrue(result); // Verifica se o método retorna true
    }

    @Test
    public void testEndereco() {
        String input = "1\n"; // Simula entrada de usuário para tentar selecionar um endereço
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Boolean result = Solicitacao.endereco(cliente, tipoServico, "Aparelho de som", "Botão quebrado", "Electrolux", "O mais cedo possível", "Descrição do serviço");
        assertTrue(result); // Verifica se o método retorna true
    }
}


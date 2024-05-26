
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Entity.Aparelhos;

import java.util.Arrays;
import java.util.List;

public class AparelhosTeste {

    @Before
    public void setUp() {
        Aparelhos.getAparelhos().clear(); // Limpa a lista antes de cada teste
        Aparelhos.populaLista(); // Popula a lista com os aparelhos padrão
    }

    @Test
    public void testPopulaLista() {
        List<String> expectedAparelhos = Arrays.asList("Aparelho de som", "Aquecedor a gás", "Ar condicionado",
                "Câmera", "Home theater", "Adega climatizada", "Fogão e cooktop", "Geladeira e freezer", "Lava louça",
                "Máquina de costura");
        assertEquals(expectedAparelhos, Aparelhos.getAparelhos());
    }

    @Test
    public void testGetRandomAparelho() {
        String randomAparelho = Aparelhos.getRandomAparelho();
        assertTrue(Aparelhos.getAparelhos().contains(randomAparelho));
    }

    @Test
    public void testSetAparelhos() {
        List<String> newAparelhos = Arrays.asList("Televisão", "Videogame");
        Aparelhos.setAparelhos(newAparelhos);
        assertEquals(newAparelhos, Aparelhos.getAparelhos());
    }

    @Test
    public void testGetAparelhos() {
        List<String> aparelhos = Aparelhos.getAparelhos();
        assertNotNull(aparelhos);
        assertEquals(10, aparelhos.size());
    }
}

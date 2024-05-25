package Entity;

import java.util.LinkedList;
import java.util.List;

public class Aparelhos {
    private static List<String> aparelhos = new LinkedList<>();

    public static String getRandomAparelho() {return aparelhos.get((int) (Math.random() * 10000) % aparelhos.size());}

    public static List<String> getAparelhos() {return aparelhos;}

    public static void setAparelhos(List<String> aparelhos) {Aparelhos.aparelhos = aparelhos;}

    public static void populaLista() {
        aparelhos.add("Aparelho de som");
        aparelhos.add("Aquecedor a gás");
        aparelhos.add("Ar condicionado");
        aparelhos.add("Câmera");
        aparelhos.add("Home theater");
        aparelhos.add("Adega climatizada");
        aparelhos.add("Fogão e cooktop");
        aparelhos.add("Geladeira e freezer");
        aparelhos.add("Lava louça");
        aparelhos.add("Máquina de costura");
    }
}

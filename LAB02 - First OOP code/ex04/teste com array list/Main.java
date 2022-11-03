import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Figurinha_ArrayList jogador[] = new Figurinha_ArrayList[3];
        jogador[0] = new Figurinha_ArrayList("Messi", LocalDate.parse("1990-10-23"), 1.7f, 72.5f, "Atacante", "Argentina");
        jogador[1] = new Figurinha_ArrayList("Ronaldo", LocalDate.parse("1985-02-05"), 1.85f, 80.5f, "Atacante", "Brasil");
        jogador[2] = new Figurinha_ArrayList("Neymar", LocalDate.parse("1992-02-05"), 1.75f, 68.5f, "Atacante", "Brasil");
        
        Selecao_ArrayList selecao1 = new Selecao_ArrayList("Brasil", "Tite", "Brasil", 1914, 5, Arrays.asList("Messi", "Ronaldo", "Neymar", "Coutinho", "Firmino", "Gabriel Jesus", "Alisson", "Marquinhos", "Casemiro", "Fagner", "Thiago Silva"));
        Selecao_ArrayList selecao2 = new Selecao_ArrayList("Argentina", "Sampaoli", "Argentina", 1914, 2, Arrays.asList("Messi", "Simeone", "Di Maria", "Higuain", "Lavezzi", "Mascherano", "Rojo", "Tagliafico", "Banega", "Biglia", "Caballero"));
        selecao2.imprimir();
        selecao1.imprimir();
        
        for (int i = 0; i < jogador.length; i++) {
            jogador[i].imprimir();
        }

    }
}
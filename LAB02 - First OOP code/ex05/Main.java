import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Figurinha jogador[] = new Figurinha[3];
        jogador[0] = new Figurinha("Messi", LocalDate.parse("1990-10-23"), 1.7f, 72.5f, "Atacante", "Argentina");
        jogador[1] = new Figurinha("Ronaldo", LocalDate.parse("1985-02-05"), 1.85f, 80.5f, "Atacante", "Brasil");
        jogador[2] = new Figurinha("Neymar", LocalDate.parse("1992-02-05"), 1.75f, 68.5f, "Atacante", "Brasil");

        Selecao selecao = new Selecao("Brasil", "Tite", "Brasil", 1914, 5);
        for (int i = 0; i < jogador.length; i++) {
            selecao.setJogador(jogador[i], i);
        }
        selecao.imprimir();
        
        for (int i = 0; i < jogador.length; i++) {
            jogador[i].imprimir();
        }
    }
}
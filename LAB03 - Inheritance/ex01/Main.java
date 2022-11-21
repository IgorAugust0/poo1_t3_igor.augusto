import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Figurinha jogador1 = new Figurinha("Messi", LocalDate.of(1987, 6, 24), 1.7f, 72.5f, "Atacante", "Argentina");
        Figurinha jogador2 = new Figurinha("Ronaldo", LocalDate.of(1985, 2, 5), 1.85f, 80.5f, "Atacante", "Brasil");
        FigurinhaExtra jogador3 = new FigurinhaExtra("Neymar", LocalDate.of(1992, 2, 5), 1.75f, 75.5f, "Atacante", "Brasil", "Ouro", "Amarelo");
        FigurinhaExtra jogador4 = new FigurinhaExtra("Cristiano Ronaldo", LocalDate.of(1985, 2, 5), 1.85f, 80.5f, "Atacante", "Portugal", "Prata", "Azul");

        jogador1.MostrarFigurinha();
        jogador2.MostrarFigurinha();
        jogador3.MostrarFigurinha();
        jogador4.MostrarFigurinha();

    }
}
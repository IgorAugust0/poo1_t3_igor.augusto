import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Figurinha j1 = new Figurinha("Messi", LocalDate.parse("1990-10-23"), 1.7f, 72.5f, "Atacante", "Argentina");
        Figurinha j2 = new Figurinha("Ronaldo", LocalDate.parse("1985-02-05"), 1.85f, 80.5f, "Atacante", "Brasil");
        Figurinha j3 = new Figurinha("Neymar", LocalDate.parse("1992-02-05"), 1.75f, 68.5f, "Atacante", "Brasil");
        j1.imprimir();
        j2.imprimir();
        j3.imprimir();
    }
}
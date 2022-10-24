import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Figurinha j1 = new Figurinha("Messi", new Date(1987, 6, 24), 1.7f, 72.5f, "Atacante", "Argentina");
        Figurinha j2 = new Figurinha("Ronaldo", new Date(1985, 2, 5), 1.85f, 80.5f, "Atacante", "Brasil");
        Figurinha j3 = new Figurinha("Neymar", new Date(1992, 2, 5), 1.75f, 68.5f, "Atacante", "Brasil");
        j1.imprimir();
        j2.imprimir();
        j3.imprimir();
    }
}
package ex04;

import java.util.Scanner;

public class Amigos extends Contato {
    private int grau; // (1 = melhor amigo; 2 = amigo; 3 = conhecido)

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public Amigos() {
        super();
    }

    @Override
    public void imprimirContato() {
        super.imprimirBasico();
        System.out.println("Grau de amizade: " + this.grau + "º" + "\n");
    }

    public void criaContato() {
        Scanner sc = new Scanner(System.in);
        this.lerDados();
        System.out.println("Digite o grau de amizade (1 = melhor amigo; 2 = amigo; 3 = conhecido): ");
        this.grau = sc.nextInt();
        sc.close();
    }

    public int getGrau() {
        return this.grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    /*
     * @Override
     * public Contato criaContato() {
     * return new Amigos().lerDados();
     * }
     */
}
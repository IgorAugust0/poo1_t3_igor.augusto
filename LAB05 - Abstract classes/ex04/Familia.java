package ex04;
import java.util.Scanner;
public class Familia extends Contato {
    private String parentesco; // (ex.: pai, irmão, etc.)

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public Familia() {
        super();
    }

    @Override
    public void imprimirContato(){
        super.imprimirBasico();
        System.out.println("Parentesco: " + this.parentesco);
    }

    public void criaContato() {
        this.lerDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de parentesco:");
        this.parentesco = sc.nextLine();
        sc.close();
    }

    public String getParentesco() {
        return this.parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}

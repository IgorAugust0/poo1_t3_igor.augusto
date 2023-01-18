package ex04;
import java.util.Scanner;

public class Trabalho extends Contato {
    private String tipo; // (ex.: chefe, colega, etc.)
    
    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }
    
    public Trabalho() {
        super();
    }
    
    @Override
    public void imprimirContato(){
        super.imprimirBasico();
        System.out.println("Tipo: " + this.tipo);
    }
    
    public void criaContato() {
        this.lerDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de contato:");
        this.tipo = sc.nextLine();
        sc.close();
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
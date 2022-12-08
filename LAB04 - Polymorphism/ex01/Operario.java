import java.util.Date;

public class Operario extends Funcionario {
    private double valorProd;
    private int qntProd;

    public Operario(String nome, Date dataNascimento, double salario, double valorProd, int qntProd) {
        super(nome, dataNascimento, salario);
        this.valorProd = valorProd;
        this.qntProd = qntProd;
    }

    public void PagarSalario() {
        double valorfinal = valorProd * qntProd;
        System.out.println("\nFunção: Operario");
        System.out.println("Nome: " + this.getNome() + "\nSalario: R$ " + valorfinal);
    }
}

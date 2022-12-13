package ex01;
import java.util.Date;

public class Vendedor extends Funcionario {
    private double comissao;
    private int vendas;

    public Vendedor(String nome, Date dataNascimento, double salario, double comissao, int vendas) {
        super(nome, dataNascimento, salario);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public void PagarSalario() {
        double valorfinal = this.getSalario() + (comissao + vendas);
        System.out.println("\nFunção: Vendedor");
        System.out.println("Nome: " + this.getNome() + "\nSalario: R$ " + valorfinal);

    }
}

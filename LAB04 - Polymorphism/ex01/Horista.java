package ex01;
import java.util.Date;

public class Horista extends Funcionario {
    private double valorHora;
    private int totalHoras;

    public Horista(String nome, Date dataNascimento, double salario, double valorHora, int totalHoras) {
        super(nome, dataNascimento, salario);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    @Override
    public void PagarSalario() {
        double valorfinal = valorHora * totalHoras;
        System.out.println("\nFunção: Horista");
        System.out.println("Nome: " + this.getNome() + "\nSalario: R$ " + valorfinal);
    }
}

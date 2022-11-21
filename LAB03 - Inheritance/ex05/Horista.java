package ex02;

import java.math.BigDecimal; // importando a biblioteca java.math.BigDecimal para usar o BigDecimal (ideal para valores monetários);
import java.util.Date;  // importação de biblioteca para uso de data e calendário

public class Horista extends Funcionario{ // classe Horista que herda de Funcionario
    private double valorHora;
    private double horasTrabalhadas;

    public Horista(String nome, Date dataNascimento, BigDecimal salario, double valorHora, double horasTrabalhadas) { // construtor da classe Horista
        super(nome, dataNascimento, salario); // chama o construtor da classe pai
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void PagarSalario() { // método override para pagamento de salário do Horista
        double valorFinal = valorHora * horasTrabalhadas; // calcula o salário final do Horista: valor por hora X total de horas trabalhadas
        System.out.println(this.getNome() + " ganha o valor de: R$" + valorFinal + "/mês"); // imprime o salário do Horista;

    }
    
}

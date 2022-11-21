package ex02;

import java.math.BigDecimal; // importando a biblioteca java.math.BigDecimal para usar o BigDecimal (ideal para valores monetários);
import java.util.Date; // importação de biblioteca para uso de data e calendário

public class Operario extends Funcionario{ // classe Operario que herda de Funcionario

    private double valorProducao; 
    private int qtdProduzida; 

    public Operario(String nome, Date dataNascimento, BigDecimal salario, double valorProducao, int qtdProduzida) { // construtor da classe Operario
        super(nome, dataNascimento, salario); // chama o construtor da classe pai
        this.valorProducao = valorProducao;
        this.qtdProduzida = qtdProduzida;
    }


    @Override
    public void PagarSalario() { // método override para pagamento de salário do Operario
        double valorFinal = valorProducao * qtdProduzida; // calcula o salário final do Operario: valor por produção X quantidade produzida;
        System.out.println(this.getNome() + " ganha o valor de: R$" + valorFinal + "/mês"); // imprime o salário do Operario;
    }

}

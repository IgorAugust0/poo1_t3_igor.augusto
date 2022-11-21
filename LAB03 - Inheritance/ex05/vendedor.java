package ex02;

import java.math.BigDecimal; // importando a biblioteca java.math.BigDecimal para usar o BigDecimal (ideal para valores monetários);
import java.util.Date; // importação de biblioteca para uso de data e calendário

public class vendedor extends Funcionario{ // classe vendedor que herda de Funcionario

    private double comissão;
    private int qntvendas;

    public vendedor(String nome, Date dataNascimento, BigDecimal salario, double comissão, int qntvendas) { // construtor da classe vendedor
        super(nome, dataNascimento, salario);
        this.comissão = comissão;
        this.qntvendas = qntvendas;
    }

    @Override // método override para pagamento de salário do vendedor
    public void PagarSalario() { 
        double valorfinal = this.getSalario().doubleValue() + (comissão * qntvendas); // calcula o salário final do vendedor: valor fixo + comissão X vendas;
        System.out.println(this.getNome() + " ganha o valor de: R$" + valorfinal + "/mês"); // imprime o salário do vendedor;
    }
    
}

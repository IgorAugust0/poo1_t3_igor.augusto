package ex02;

import java.math.BigDecimal; // importando a biblioteca java.math.BigDecimal para usar o BigDecimal (ideal para valores monetários);
import java.util.Date; // importação de biblioteca para uso de data e calendário

public class chefe extends  Funcionario { // classe chefe que herda de Funcionario
    public chefe(String nome, Date dataNascimento, BigDecimal salario) {
        super(nome, dataNascimento, salario);
    }

    @Override
    public void PagarSalario() { // método override para pagamento de salário do chefe
        System.out.println(this.getNome() + " ganha o valor de: R$" + this.getSalario().toString() + "/mês"); // imprime o salário do chefe: salário fixo e predefinido;
    }
    
}

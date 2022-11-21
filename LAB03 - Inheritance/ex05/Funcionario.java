package ex02;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Funcionario { // classe abstrata para funcionário

    // A classe *Funcionario* deve incluir os campos privados *nome*, *dataNascimento* e *salario*.
    private String nome; 
    private Date DataNascimento;
    private BigDecimal salario;

    public Funcionario(String nome, Date dataNascimento, BigDecimal salario) { // construtor da classe Funcionario
        this.nome = nome;
        DataNascimento = dataNascimento;
        this.salario = salario;
    }

    public abstract void PagarSalario(); // método abstrato para pagamento de salário

    public String getNome() { // getter para nome, pois o mesmo é privado
        return nome;
    }

    public Date getDataNascimento() { // getter para data de nascimento, pois o mesmo é privado
        return DataNascimento;
    }

    public BigDecimal getSalario() { // getter para salario, pois o mesmo é privado
        return salario;
    }
    
}

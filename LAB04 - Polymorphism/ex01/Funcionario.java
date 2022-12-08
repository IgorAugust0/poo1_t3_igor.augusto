import java.util.Date;

public abstract class Funcionario {
    private String nome;
    private Date dataNascimento;
    private double salario;

    public Funcionario(String nome, Date dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public abstract void PagarSalario();

    public String getNome() {
        return nome;
    }

    public Date getdataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }
}

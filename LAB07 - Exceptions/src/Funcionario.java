

public class Funcionario {
    private String CPF;
    private String nome;
    private float salario;
    private float tetoSalarial;

    public Funcionario(String CPF, String nome, float salario) {
        this.CPF = CPF;
        this.nome = nome;
        this.salario = salario;
        tetoSalarial = 40000;
    }

    public void aumentarSalario(float porcento) throws ValorInvalidoException {
        float total = salario * (1 + porcento / 100);
        if (total < 0) {
            throw new ValorInvalidoException("Valor inválido de salário!");
        } else if (total > tetoSalarial) {
            throw new ValorInvalidoException("Valor ultrapassa o teto");
        } else {
            System.out.println("O salário atual é: " + total);
        }
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public float getTetoSalarial() {
        return this.tetoSalarial;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(float salario) {
        this.salario = salario;
    }

    public void setTetoSalarial(float tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }
}

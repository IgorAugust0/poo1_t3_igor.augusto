package ex02;

public abstract class ContaCorrente {
    private float saldo;
    private int estado; // 1 - ativa, 2 - inativa
    private int numConta;
    private int senha;

    public ContaCorrente(float saldo, int numConta, int senha) {
        this.saldo = saldo;
        this.estado = 1; // 1 - ativa, 2 - inativa
        this.numConta = numConta;
        this.senha = senha;
    }

    public boolean debitaValor(float valor, int senha) {
        if (this.senha != senha) // senha deve ser válida
            return false;
        if (this.estado != 1) // conta deve estar ativa
            return false;
        if (valor <= 0) // valor deve ser maior que zero
            return false;
        if (valor > this.saldo) // valor deve ser menor ou igual ao saldo
            return false;

        this.saldo -= valor; // debita o valor
        if (saldo == 0)
            this.estado = 2; // inativa a conta
        return true;
    }

    public void debitaValor(float valor) {
        this.saldo -= valor;
    }

    public float getSaldo(int senha) {
        if (this.senha == senha)
            return saldo;
        return -1;
    }

    public void creditaValor(float valor, int senha) {
        if (this.senha == senha)
            this.saldo += valor;
        else
            System.out.println("Senha inválida, valor não creditado");
    }

    protected int getEstado(int senha) {
        if (this.senha == senha)
            return this.estado;
        else
            return -1;
    }

    protected void atualizaEstado(int senha, int novoEstado) {
        if (this.senha == senha)
            this.estado = novoEstado;
    }

    protected boolean isSenha(int senha) {
        if (senha == this.senha)
            return true;
        else
            return false;
    }

    public static ContaCorrente criaConta(float saldo, int numConta, float limite, int senha) {
        if (limite > 0)
            return new ContaEspecial(saldo, numConta, senha, limite);
        if (limite == 0)
            return new ContaComum(saldo, numConta, senha, 0);
        else
            throw new IllegalArgumentException("Limite deve ser maior OU igual a zero");
    }

    public void imprimeDados() {
        if (ContaEspecial.class.isInstance(this)) // isInstance() verifica se o objeto é uma instância da classe passada como parâmetro (ContaEspecial.class) 
            System.out.println("Conta Especial");
        else
            System.out.println("Conta Comum");

        System.out.println("Conta: " + this.numConta);
        System.out.println("Saldo: " + this.saldo);

        if (this.estado == 1)
            System.out.println("Estado: Ativa\n");
        else
            System.out.println("Estado: Inativa\n");
    }

    public int getNumConta() {
        return numConta;
    }

    public int getSenha() {
        return senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getEstado() {
        return estado;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}

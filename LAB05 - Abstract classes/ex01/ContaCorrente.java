package ex01;

public class ContaCorrente {
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
        if (this.senha != senha)
            return false; // senha deve ser válida
        if (this.estado != 1)
            return false; // conta deveria estar ativa
        if (valor <= 0)
            return false;
        if (valor > this.saldo)
            return false;

        this.saldo -= valor;
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

    public void creditaValor(int senha, float valor) {
        if (this.senha == senha)
            this.saldo += valor;
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

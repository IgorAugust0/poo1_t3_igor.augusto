package ex02;

public class ContaComum extends ContaCorrente{
    private float limite;
    public ContaComum(float saldo, int numConta, int senha, float limite) {
        super(saldo, numConta, senha);
        if (this.limite == 0)
        this.limite = limite;
    }
}

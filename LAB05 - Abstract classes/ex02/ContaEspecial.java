package ex02;

public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float saldo, int numConta, int senha, float limite) {
        super(saldo, numConta, senha);
        if (this.limite < 0)
            throw new IllegalArgumentException("Limite deve ser maior OU igual a zero");
        this.limite = limite;

    }

    public ContaCorrente transformaEmContaComum() {
        if (this.limite == 0) {
            ContaCorrente conta = new ContaComum(this.getSaldo(), this.getNumConta(), this.getSenha(), 0);
            return conta;
        }
        return this;
    }

    /* Variação do método debitaValor da superclasse ContaCorrente que utiliza outros métodos da superclasse ContaCorrente:
    (Neste caso, não vi necessidade de sobrescrever o método da superclasse ContaCorrente, pois o método da superclasse já faz o que é necessário para a conta especial).

    @Override
    public boolean debitaValor(float val, int senha){ // sobrescreve o método da superclasse ContaCorrente para que a conta especial possa debitar valores de acordo com o limite
        if(isSenha(senha)){ 
            return false;
        }
        if(this.getEstado(senha) != 1) return false;
        if(val<=0) return false;
        if(val > this.getSaldo(senha)) return false;
        debitaValor(val);
        return true;
    }*/
}

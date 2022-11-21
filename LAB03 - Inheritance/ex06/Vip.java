package ex03;

// Crie uma classe {VIP}, que herda {Ingresso} e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double ValorIngresso() { // metodo que retorna o valor do ingresso
        return super.getValor() + this.valorAdicional;
    }
}

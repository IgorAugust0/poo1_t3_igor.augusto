package ex03;

// Crie uma classe chamada {Ingresso}, que possui um valor e um método {escreveValor()}.
public class Ingresso { // classe pai de todos os ingressos

    private double valor;

    public Ingresso(double valor) { // construtor da classe pai
        this.valor = valor;
    }

    public void escreveValor() { // metodo que escreve o valor do ingresso
        System.out.println(this.valor);
    }

    public double getValor() { // metodo que retorna o valor do ingresso
        return valor;
    }
}

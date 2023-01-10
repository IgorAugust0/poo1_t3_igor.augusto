package ex01;
public class Servicos implements Classificavel{
    public double preco;

    public Servicos(double preco) {
        this.preco = preco;
    }

    public boolean ehMenorQue(Classificavel obj) {
        Servicos s = (Servicos) obj; // casting explícito
        return (this.preco < s.preco);
    }

    public void imprime() {
        System.out.println("Preço: " + this.preco);
    }

    public double getPreco() {
        return preco;
    }
}

package ex01;
public class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public boolean ehMenorQue(Classificavel obj) {
        Produto p = (Produto) obj; // casting explícito
        return (this.codigo < p.codigo);
    }

    public void imprime() {
        System.out.println("Código: " + this.codigo);
    }
    
    public int getCodigo() {
        return codigo;
    }
}

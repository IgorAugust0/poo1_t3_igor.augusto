package ex02;

public class Quadrado extends FormaBidimensional {

    public Quadrado(double largura) {
        super(largura, largura);
    }

    @Override
    public double ObterArea() {
        return this.GetLargura() * this.GetLargura();
    }

    @Override
    public String descricao() {
        return "É um quadrado!";
    }
}

package ex02;

public class Quadrado extends FormaBidimensional {

    public Quadrado(double lado) {
        super(lado, lado);
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

package ex02;

public class Cubo extends FormaTridimensional {

    public Cubo(double lado) {
        super(lado, lado, lado);
    }

    @Override
    public double ObterArea() {
        return 6.0 * Math.pow(this.GetLargura(), 2.0);
    }

    @Override
    public double ObterVolume() {
        return Math.pow(this.GetLargura(), 3.0);
    }

    @Override
    public String descricao() {
        return "É um cubo";
    }
}

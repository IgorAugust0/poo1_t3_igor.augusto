package ex02;

public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double ObterArea() {
        return 6.0 * Math.pow(this.lado, 2.0);
    }

    @Override
    public double ObterVolume() {
        return Math.pow(this.lado, 3.0);
    }

    @Override
    public String descricao() {
        return "É um cubo";
    }
}

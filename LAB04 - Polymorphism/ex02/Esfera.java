package ex02;

public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double ObterArea() {
        return 4 * (Math.PI * Math.pow(this.raio, 2));
    }

    @Override
    public double ObterVolume() {
        return (4 / 3) * (Math.PI * Math.pow(this.raio, 3));
    }

    @Override
    public String descricao() {
        return "É uma esfera!";
    }

}

package ex02;

public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
        super();
    }

    @Override
    public double ObterArea() {
        return Math.PI * Math.pow(this.raio, 2.0); // Math.pow(raio, 2) = r^2 = raio ao quadrado = raio * raio
    }

    @Override
    public String descricao() {
        return "É um círculo!";
    }
}

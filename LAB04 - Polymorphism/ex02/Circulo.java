package ex02;

public class Circulo extends FormaBidimensional {

    public Circulo(double raio) {
        super(raio, raio);
    }

    @Override
    public double ObterArea() {
        return Math.PI * this.GetLargura() * this.GetLargura();
    }

    @Override
    public String descricao() {
        return "É um círculo!";
    }
}


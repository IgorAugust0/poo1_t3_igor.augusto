package ex02;

public class Esfera extends FormaTridimensional {
    public Esfera(double raio) {
        super(raio, raio, raio);
    }

    @Override
    public double ObterArea() {
        return 4.0 * Math.PI * Math.pow(this.GetLargura(), 2.0);
    }

    @Override
    public double ObterVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.GetLargura(), 3.0);
    }

    @Override
    public String descricao() {
        return "Área da esfera: ";
    }

}

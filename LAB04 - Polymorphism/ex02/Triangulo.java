package ex02;

public class Triangulo extends FormaBidimensional {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double ObterArea() {
        return (this.GetAltura() * this.GetLargura()) / 2;
    }

    @Override
    public String descricao() {
        return "Área do triângulo: ";
    }
}

package ex02;

public class Triangulo extends FormaBidimensional {
    public Triangulo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double ObterArea() {
        return (this.GetAltura() * this.GetLargura()) / 2;
    }

    @Override
    public String descricao() {
        return "É um triângulo";
    }
}

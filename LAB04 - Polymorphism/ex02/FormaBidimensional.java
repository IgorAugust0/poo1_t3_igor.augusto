package ex02;

public abstract class FormaBidimensional extends Forma {
    private double altura;
    private double largura;

    public FormaBidimensional(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public FormaBidimensional() {
        super();
    }

    public abstract double ObterArea();
    public abstract String descricao();

    public double GetAltura() {
        return altura;
    }

    public double GetLargura() {
        return largura;
    }
}

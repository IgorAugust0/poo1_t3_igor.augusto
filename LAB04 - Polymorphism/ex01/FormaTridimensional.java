package ex01;

public abstract class FormaTridimensional extends Forma{
    private double altura;
    private double largura;
    private double comprimento;

    public FormaTridimensional(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public FormaTridimensional(){
        super();
    }

    public abstract double ObterArea();
    public abstract double ObterVolume();
    public abstract String descricao();

    public double GetAltura() {
        return altura;
    }

    public double GetLargura(){
        return largura;
    }

    public double GetComprimento(){
        return comprimento;
    }
}

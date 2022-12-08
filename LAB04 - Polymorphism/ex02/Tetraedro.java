package ex02;

public class Tetraedro extends FormaTridimensional {
    private double lado;

    public Tetraedro(double lado){
        this.lado = lado;
    }

    @Override
    public double ObterArea() {
        return Math.pow(this.lado, 2) * Math.sqrt(3);
    }

    @Override
    public double ObterVolume(){
        return (Math.pow(this.lado, 3) * Math.sqrt(2)) / 12;
    }

    @Override
    public String descricao(){
        return "É um tetraedro";
    }
}

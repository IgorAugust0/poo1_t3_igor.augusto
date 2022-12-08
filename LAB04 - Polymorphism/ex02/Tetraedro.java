package ex02;

public class Tetraedro extends FormaTridimensional {

    public Tetraedro(double lado){
        super(lado, lado, lado);
    }

    @Override
    public double ObterArea(){
        return (Math.pow(GetAltura(), 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double ObterVolume(){
        return (Math.pow(GetAltura(), 3) * Math.sqrt(2)) / 12;
    }

    @Override
    public String descricao(){
        return "Área do tetraedro: ";
    }
}

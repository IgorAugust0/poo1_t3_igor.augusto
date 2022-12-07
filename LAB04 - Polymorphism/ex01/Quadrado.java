package ex01;

public class Quadrado extends FormaBidimensional {
    
    public Quadrado(double largura, double altura){
        super(largura, altura);
    }

    @Override
    public double ObterArea(){
        return this.GetAltura() * this.GetLargura();
    }

    @Override
    public String descricao(){
        return "É um quadrado!";
    }
}

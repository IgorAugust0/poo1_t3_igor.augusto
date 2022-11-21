package ex03;

// Crie uma classe {CamaroteSuperior}, que é mais cara (possui valor adicional). 
// Possui um método para retornar o valor do ingresso. Herda a classe {VIP}.
public class CamaroteSuperior extends Vip{  

    private double ValorAdicionalsup; // atributo que guarda o valor adicional do camarote superior

    public CamaroteSuperior(double valor, double valorAdicional, double valorAddicional) { // construtor da classe filha 
        super(valor, valorAdicional); // chama o construtor da classe pai e passa o valor do ingresso e o valor adicional do camarote superior
        ValorAdicionalsup = valorAddicional;
    }

    @Override // sobrescreve o metodo ValorIngresso() da classe pai
    public double ValorIngresso() { // metodo que retorna o valor do ingresso
        return super.ValorIngresso() + ValorAdicionalsup; // soma o valor do ingresso com o valor adicional do camarote superior
    }
}

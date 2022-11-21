package ex03;

// Crie uma classe {CamaroteInferior} (que possui a localização do ingresso e métodos para acessar e imprimir esta localização) e 
// uma classe {CamaroteSuperior}, que é mais cara (possui valor adicional). Herda a classe {VIP}.
public class CamaroteInferior extends Vip {

    public String localizacao; // atributo que guarda a localização do camarote

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional); // chama o construtor da classe pai
        this.localizacao = localizacao;
    }

    public void PrintLocalizacao() { // metodo que imprime a localização do camarote
        System.out.println(localizacao);
    }

    public String getLocalizacao() { // getter para a localização do camarote inferior
        return localizacao;
    }

    public void setLocalizacao(String localizacao) { // setter para a localização do camarote inferior
        this.localizacao = localizacao;
    }
}

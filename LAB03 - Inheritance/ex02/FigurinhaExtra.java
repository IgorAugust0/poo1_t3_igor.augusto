import java.time.LocalDate;

public class FigurinhaExtra extends Figurinha{
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nomeJogador, LocalDate dataNascimento, float altura, float peso, String posicao, String pais, String categoria, String cor) {
        super(nomeJogador, dataNascimento, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }

    public FigurinhaExtra(Figurinha jogador, String categoria, String cor) {
        super(jogador);
        this.categoria = categoria;
        this.cor = cor;
    }

    @Override
    public void MostrarFigurinha() {
        super.MostrarFigurinha();
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Cor: " + this.cor);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
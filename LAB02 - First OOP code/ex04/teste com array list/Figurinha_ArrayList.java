import java.time.LocalDate;

public class Figurinha_ArrayList {
    private String nomeJogador;
    private LocalDate dataNascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;

    public Figurinha_ArrayList(String nomeJogador, LocalDate dataNascimento, float altura, float peso, String posicao, String pais) {
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void imprimir() {
        System.out.println("Nome do jogador: " + this.nomeJogador);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Posição: " + this.posicao);
        System.out.println("País: " + this.pais);
    }
    public String getNomeJogador() {
        return nomeJogador;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

}

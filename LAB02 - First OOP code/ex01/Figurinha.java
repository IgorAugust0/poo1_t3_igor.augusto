import java.util.Date;

public class Figurinha {
    String nomeJogador;
    Date dataNascimento;
    float altura;
    float peso;
    String posicao;
    String pais;

    public Figurinha(String nomeJogador, Date dataNascimento, float altura, float peso, String posicao, String pais) {
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
}

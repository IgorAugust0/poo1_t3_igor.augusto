package ex01;
public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public boolean ehMenorQue(Classificavel obj) {
        Cliente c = (Cliente) obj; // casting explícito
        return (this.nome.compareTo(c.nome) < 0); // compareTo() compara strings
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
    }
    
    public String getNome() {
        return nome;
    }
}

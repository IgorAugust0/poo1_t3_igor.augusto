package ex03;

// Crie uma classe {Normal}, que herda {Ingresso} e possui um método que imprime: "Ingresso Normal".
public class Normal extends Ingresso { // classe filha de Ingresso que herda o metodo escreveValor()

    public Normal(double valor) { // construtor da classe filha
        super(valor);
    }

    public void PrintIngressoNormal() { // metodo que escreve o valor do ingresso
        System.out.println("Ingresso normal");
    }
}

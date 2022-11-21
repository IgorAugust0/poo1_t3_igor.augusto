package ex01;

import java.util.*;

public class C1 {
    // Para cada classe, inclua um atributo público, protegido e privado (pode ser de qualquer tipo)
    public List<String> A1;
    private int B1;
    protected String C1;

    protected int getB1() {return B1;} // para poder obter o valor do atributo que é privado

    // Para cada classe, construa um construtor padrão sem parâmetros
    public C1() {
        // Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    // Para cada classe, construa um construtor com parâmetros
    public C1(List<String> a, int b, String c) {
        this.A1 = a;
        this.B1 = b;
        this.C1 = c;

        // Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor
        System.out.println("Classe C1: chamada do construtor padrao, com parametros");
    }

    // Em todas as classes, inclua um método que chama mostar_atributos, que mostra os valores de *todos* os atributos de um objeto (não utilizar super)
    public void mostrar_atributos() {
        System.out.println("Atributo A da classe C1: " + this.A1);
        System.out.println("Atributo B da classe C1: " + this.B1);
        System.out.println("Atributo C da classe C1: " + this.C1);

    }

    // Em todas as classes, inclua um método que chama mostrar_atributos_super, que mostra os valores de *todos* os atributos de um objeto e que utilize super
    public void mostrar_atributos_super() {
        System.out.println("A classe não possui atributos super");
    }
    
}

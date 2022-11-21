package ex01;

import java.util.*;

public class C3 extends C2 {
    // Para cada classe, inclua um atributo público, protegido e privado (pode ser de qualquer tipo)
    public List<String> A3;
    private int B3;
    protected String C3;

    // Para cada classe, construa um construtor padrão sem parâmetros
    public C3() {
        super();

        // Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3(List<String> a, int b, String c, List<String> a1, int b1, String c1, List<String> a2, int b2, String c2) {
        super(a, b, c, a1, b1, c1);
        this.A3 = a2;
        this.B3 = b2;
        this.C3 = c2;

        // Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor
        System.out.println("Classe C3: chamada do construtor padrao, com parametros");
    }

    // Na classe C3 inclua um construtor que use o "super" para chamar o construtor da classe C2 com parâmetros
    public C3(List<String> a, int b, String c, List<String> a1, int b1, String c1) {
        super(a, b, c, a1, b1, c1);
    }

    // Em todas as classes, inclua um método que chama mostar_atributos, que mostra os valores de *todos* os atributos de um objeto (não utilizar super)
    public void mostrar_atributos(){
        super.mostrar_atributos();
        System.out.println("Atributo A da classe C3: " + this.A3);
        System.out.println("Atributo B da classe C3: " + this.B3);
        System.out.println("Atributo C da classe C3: " + this.C3);

    }

    // Em todas as classes, inclua um método que chama mostrar_atributos_super, que mostra os valores de *todos* os atributos de um objeto e que utilize super
    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("Atributo super A2 da classe C2: " + super.A2);
        System.out.println("Atributo super A2 da classe C2: " + super.getB2());
        System.out.println("Atributo super C2 da classe C2: " + super.C2);

    }
    
}

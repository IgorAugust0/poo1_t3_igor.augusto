package ex01;

import java.util.*;

public class C2 extends C1 {
    // Para cada classe, inclua um atributo público, protegido e privado (pode ser de qualquer tipo)
    public List<String> A2;
    private int B2;
    protected String C2;
    
    protected int getB2() {return B2;} // para poder obter o valor do atributo que é privado

    // Para cada classe, construa um construtor padrão sem parâmetros
    public C2() {
        super(); // chama o construtor padrao da classe pai

        // Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    // Para cada classe, construa um construtor com parâmetros
    public C2(List<String> a, int b, String c, List<String> a1, int b1, String c1) {
        super(a, b, c); // chama o construtor da classe pai e passa os parametros 
        this.A2 = a1;
        this.B2 = b1;
        this.C2 = c1;

        // Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor
        System.out.println("Classe C2: chamada do construtor padrao, com parametros");
    }
    
    // Em todas as classes, inclua um método que chama mostar_atributos, que mostra os valores de *todos* os atributos de um objeto (não utilizar super)
    public void mostrar_atributos(){
        super.mostrar_atributos(); // chama o metodo da classe pai
        System.out.println("Atributo A da classe C2: " + this.A2);
        System.out.println("Atributo B da classe C2: " + this.B2);
        System.out.println("Atributo C da classe C2: " + this.C2);
    }

    // Em todas as classes, inclua um método que chama mostrar_atributos_super, que mostra os valores de *todos* os atributos de um objeto e que utilize super
    public void mostrar_atributos_super(){
        System.out.println("Atributo super A1 da classe C1: " + super.A1);
        System.out.println("Atributo super B1 da classe C1: " + super.getB1());
        System.out.println("Atributo super C1 da classe C1: " + super.C1);
    }

}

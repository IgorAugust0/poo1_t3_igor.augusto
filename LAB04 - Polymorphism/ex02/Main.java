package ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Forma> formas = new ArrayList<>();

    private static void adicionarForma() {
        formas.add(new Circulo(10));
        formas.add(new Cubo(10));
        formas.add(new Esfera(10));
        formas.add(new Quadrado(10));
        formas.add(new Tetraedro(10));
        formas.add(new Triangulo(12, 8));
    }
        public static void main(String[] args) {
            adicionarForma();
            formas.forEach(e -> {
                if (e instanceof FormaBidimensional) {
                    System.out.printf("Área do " + ((FormaBidimensional) e).descricao() + ": %.2f\n\n", ((FormaBidimensional) e).ObterArea());
                } else if (e instanceof FormaTridimensional) {
                    System.out.printf("Área do " + ((FormaTridimensional) e).descricao() + ": %.2f\n", ((FormaTridimensional) e).ObterArea());
                    System.out.printf("Volume do " + ((FormaTridimensional) e).descricao() + ": %.2f\n\n", ((FormaTridimensional) e).ObterVolume());
                }
            });
        
        }
}

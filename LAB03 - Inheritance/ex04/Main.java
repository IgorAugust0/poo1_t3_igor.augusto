package ex01;

import java.util.Arrays;     // importando pacote Arrays que guarda o método que permite a criação de arrays.
import java.util.List;       // importando pacote List que guarda o método que permite a criação de listas.

public class Main {

    // Definindo os elementos da lista de strings
    private static List<String> A = Arrays.asList("VODKA", "WHISKEY");
    private static List<String> B = Arrays.asList("RUM", "COGNAC");
    private static List<String> C = Arrays.asList("MARTINI", "LIQUOR");

    public static void inicio() { System.out.println("==================\nINÍCIO DO PROGRAMA\n==================\n"); System.out.println("=========================================\nChamadas dos construtores de cada classe: \n=========================================\n");}
    public static void print_atrib() { System.out.println("\n================================\nMostrando atributos das classes: \n================================"); }
    public static void print_atrib_super() { System.out.println("\n===================================================\nMostrando atributos das classes que utilizam super: \n===================================================");}
    public static void fim() { System.out.println("\n==================\nFIM DO PROGRAMA\n==================\n"); }

    public static void main(String[] args) {
        
        inicio();
        C1 z = new C1(A, 10, "vodka");
        C2 x = new C2(A, 100, "tequila", B, 777, "gin");
        C3 y = new C3(A, 1000, "beer", B, 999, "wine", C, 99, "bourbon");
        
        print_atrib();
        System.out.println("\nMostrando atributos da classe C1: ");
        z.mostrar_atributos();
        System.out.println("\nMostrando atributos da classe C2: ");
        x.mostrar_atributos();
        System.out.println("\nMostrando atributos da classe C3: ");
        y.mostrar_atributos();
        
        print_atrib_super();
        System.out.println("\nMostrando atributos super da classe C1: ");
        z.mostrar_atributos_super();
        System.out.println("\nMostrando atributos super da classe C2: ");
        x.mostrar_atributos_super();
        System.out.println("\nMostrando atributos super da classe C3: ");
        y.mostrar_atributos_super();
        fim();
    }
    
}

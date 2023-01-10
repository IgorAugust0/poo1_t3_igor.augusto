package ex01;
public class Main {
    public static void main(String[] args) {
        Produto p[] = new Produto[3];
        p[0] = new Produto(300);
        p[1] = new Produto(100);
        p[2] = new Produto(200);
        Cliente c[] = new Cliente[3];
        c[0] = new Cliente("C");
        c[1] = new Cliente("A");
        c[2] = new Cliente("B");
        Servicos s[] = new Servicos[3];
        s[0] = new Servicos(3000);
        s[1] = new Servicos(1000);
        s[2] = new Servicos(2000);

        Classificador cl = new Classificador();
        cl.ordena(p);
        cl.ordena(c);
        cl.ordena(s);

        for (Produto ps : p) { // for each
            ps.imprime();
        }
        
        for (Cliente cs : c) {
            cs.imprime();
        }

        for (Servicos ss : s) {
            ss.imprime();
        }
    }
}

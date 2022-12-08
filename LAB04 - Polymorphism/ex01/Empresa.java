import java.util.Date;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[4];

        f[0] = new Chefe("Joao", new Date(10111990), 20000);
        f[1] = new Vendedor("Maria", new Date(9072000), 5000, 500, 30);
        f[2] = new Operario("Pedro", new Date(11031999), 0, 15, 100);
        f[3] = new Horista("Ana", new Date(11031999), 0, 20, 40);

        System.out.println("Folha de Pagamento da Empresa");

        for (int i = 0; i < f.length; i++) {
            f[i].PagarSalario();
        }
        FolhaPagamento.FolhaDePagamento(f);
    }
}

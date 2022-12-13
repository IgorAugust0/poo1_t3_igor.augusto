package ex01;

public class FolhaPagamento {
    static double FolhaDePagamento(Funcionario[] funcionarios) {
        double total = 0;
        for (int i = 0; i < funcionarios.length; i++) {
            total += funcionarios[i].getSalario();
        }
        System.out.println("\nTotal da folha de pagamento: R$ " + total);
        return total;
    }

}

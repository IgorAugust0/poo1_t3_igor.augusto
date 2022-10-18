import java.util.Scanner;

public class exemplo04 {

    public static int altera_preco(float preco, float porcentagem) {
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem / 100; // 10 >>> 1 + 10/100 = 1.1 ;; -5 =>> 1 + (-5/100) 0.95
            preco = (preco) * temp; // preço modificado
            return 0;
        } else {
            return -1;
        }
    }

    public static String erro(int erro) {
        if (erro == 1) {
            return "Erro: preco nao alterado. Porcentagem invalida\n";
        } else {
            return "\n\nPreco alterado com sucesso";
        }
    }

    public static void main(String[] args) {
        char[] nome = new char[4];
        float[] preco = new float[4];
        int[] qtd_estoque = new int[4];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Digite o nome do produto: ");
                nome[i] = sc.next().charAt(0);
                System.out.println("Digite o preço do produto: ");
                preco[i] = sc.nextFloat();
                System.out.println("Digite a quantidade em estoque: ");
                qtd_estoque[i] = sc.nextInt();
            }
        }
        // sc.close(); // fecha o scanner

        System.out.println("\nAumentando o preco em 10%% do produto 1 e 3");
        altera_preco(preco[0], -110);
        altera_preco(preco[2], 10);

        System.out.println("\nReduzindo o preco em 5%% do produto 2 e 4");

        if (altera_preco(preco[1], -5) == -1)
            erro(1);
        else
            erro(0);

        System.out.println("\nAlterando o preco do prod. 3");
        altera_preco(preco[3], -110);
        if (altera_preco(preco[3], -110) == -1)
            erro(1);
        else
            erro(0);

        System.out.println("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nome do produto: " + nome[i]);
            System.out.println("Preço do produto: " + preco[i]);
            System.out.println("Quantidade em estoque: " + qtd_estoque[i]);
        }
    }

}
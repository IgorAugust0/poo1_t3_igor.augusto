package ex02;

import java.math.BigDecimal; // importando a biblioteca java.math.BigDecimal para usar o BigDecimal (ideal para valores monetários);
 ; // importação de biblioteca para uso de data e calendário (e várias outras)

public class Empresa { 
    private static List<Funcionario> Cargos; 

    private static void criarArray(){ // método para preenchimento do array de funcionários
        Funcionario c1 = new chefe("Elon Musk", new Date(28061971), new BigDecimal(100000)); // cria um novo funcionário do tipo chefe
        Funcionario c2 = new vendedor("Bill Gates", new Date(28101955), new BigDecimal(3777), 12.3, 300); 
        Funcionario c3 = new Horista("Steve Jobs", new Date(24021955), new BigDecimal(0), 30, 500); // cria um novo funcionário do tipo horista, horista trabalha por hora então não possui salário fixo
        Funcionario c4 = new Operario("Alan Turing", new Date(23061972), new BigDecimal(3000),  300, 10); // cria um novo funcionário do tipo operario
        Cargos = Arrays.asList(c1, c2, c3, c4); // preenche o array de funcionários com os funcionários criados
    }

    public static void inicio() { System.out.println("================================================================\nCÁLCULO DOS SALÁRIOS DOS FUNCIONÁRIOS COM CRITÉRIOS PREDEFINIDOS\n================================================================\n");}
    public static void fim() { System.out.println("\n================\nFIM DO PROGRAMA!\n================\n");}

    public static void main(String[] args) { // método main do programa
        inicio();
        criarArray(); // chama o método para preenchimento do array de funcionários
        Cargos.forEach(e -> e.PagarSalario()); // método para pagamento de salário de todos os funcionários
        fim();
    }
    
}

package ex02;

public class UsaBanco {
    public static void main(String []args){
        // Utilizando o método criaConta da classe ContaCorrente 
        ContaCorrente conta1 = ContaCorrente.criaConta(1000, 111, 0, 1234); // conversão de conta especial para conta comum, limite = 0
        conta1.debitaValor(100, 1234);
        conta1.imprimeDados();
        ContaCorrente conta2 = ContaCorrente.criaConta(1000, 222, 1000, 555);
        conta2.creditaValor(200, 777); // senha errada
        conta2.imprimeDados();        
    

        // Criando um array de contas e imprimindo os dados de cada uma.
        ContaCorrente conts[] = new ContaCorrente[2];
        conts[0] = new ContaEspecial(1000, 333, 1234, 2);
        conts[0].debitaValor(100, 1234);
        conts[1] = new ContaEspecial(1000, 444, 4321, 0);
        conts[1].debitaValor(200, 4321);

        for (int i = 0; i < conts.length; i++) {
            conts[i].imprimeDados();
        }
    }

}

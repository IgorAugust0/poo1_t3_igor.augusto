public class Main {
    public static void main(String[] args){
        Funcionario f[] = new Funcionario[3];

        f[0]= new Funcionario("21324566", "AAA", 5000);
        f[1]= new Funcionario("21324566", "BBB", 10000);
        f[2]= new Funcionario("21324566", "CCC", 39000);

        for(Funcionario fs : f){
            fs.aumentarSalario(10);
        }
    }
}

package ex01;

import java.util.Date;

public class Chefe extends Funcionario {

    public Chefe(String nome, Date dataNascimento, double salario) {
        super(nome, dataNascimento, salario);
    }

    @Override
    public void PagarSalario() {
        System.out.println("\nFunção: Chefe");
        System.out.println("Nome: " + this.getNome() + "\nSalario: " + this.getSalario());

    }
}
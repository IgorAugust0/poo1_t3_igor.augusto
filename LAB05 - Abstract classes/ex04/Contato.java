package ex04;

import java.util.Scanner;

public abstract class Contato {
    private String nome;
    private String apelido;
    private String email;
    private String aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public Contato() {
    }

    public String imprimirBasico() {
        return "Nome: " + nome + "\nApelido: " + apelido + "\nEmail: " + email + "\nAniversário: " + aniversario;
    }

    public abstract void imprimirContato();
    public abstract void criaContato();

    protected Contato lerDados() {
        try {
            Scanner sc = new Scanner(System.in);
            String nome, apelido, email, aniversario;

            System.out.println("Digite o nome:");
            nome = sc.nextLine();
            System.out.println("Digite o apelido:");
            apelido = sc.nextLine();
            System.out.println("Digite o email:");
            email = sc.nextLine();
            System.out.println("Digite o aniversário:");
            aniversario = sc.nextLine();

            this.setNome(nome);
            this.setApelido(apelido);
            this.setEmail(email);
            this.setAniversario(aniversario);
            sc.close();

        } catch (Exception e) {
            System.out.println("Erro ao ler dados do contato");
        }

        return this;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

}

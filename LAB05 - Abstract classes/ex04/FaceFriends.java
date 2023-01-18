package ex04;

import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Contato contatos[] = new Contato[100];
        Scanner sc = new Scanner(System.in);

        int opcao = 0, i = 0, tipo, ind;

        System.out.println("Bem-vindo ao FaceFriends!\n");

        while (opcao != 8) {
            System.out.println("Escolha uma opção:"
                    + "\n1 - Inserir Contato"
                    + "\n2 - Imprimir todos os contatos"
                    + "\n3 - Imprimir somente familiares"
                    + "\n4 - Imprimir somente amigos"
                    + "\n5 - Imprimir somente colegas de trabalho"
                    + "\n6 - Imprimir somente melhores amigos, irmãos e colegas de trabalho"
                    + "\n7 - Imprimir dados de um contato"
                    + "\n8 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: // Inserir Contato
                    System.out.println("\nEscolha o tipo de contato:"
                            + "\n1 - Familiar"
                            + "\n2 - Amigo"
                            + "\n3 - Colega de trabalho");
                    tipo = sc.nextInt();

                    if (tipo == 1) {
                        contatos[i] = new Familia();
                        contatos[i].criaContato();
                        i++;
                    } else if (tipo == 2) {
                        contatos[i] = new Amigos();
                        contatos[i].criaContato();
                        i++;
                    } else if (tipo == 3) {
                        contatos[i] = new Trabalho();
                        contatos[i].criaContato();
                        i++;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2: // Imprimir todos os contatos
                    for (int j = 0; j < i; j++) {
                        contatos[j].imprimirContato();
                    }
                    break;

                case 3: // Imprimir somente familiares
                    for (int j = 0; j < i; j++) {
                        if (contatos[j] instanceof Familia) {
                            contatos[j].imprimirContato();
                        }
                    }
                    break;

                case 4: // Imprimir somente amigos
                    for (int j = 0; j < i; j++) {
                        if (contatos[j] instanceof Amigos) {
                            contatos[j].imprimirContato();
                        }
                    }
                    break;

                case 5: // Imprimir somente colegas de trabalho
                    for (int j = 0; j < i; j++) {
                        if (contatos[j] instanceof Trabalho) {
                            contatos[j].imprimirContato();
                        }
                    }
                    break;

                case 6: // Imprimir somente melhores amigos (grau = 1), os IRMÃOS
                        // (parentesco.equals("irmão")) e os COLEGAS de trabalho
                        // (tipo.equals("colega")).
                    for (int j = 0; j < i; j++) {
                        if (contatos[j] instanceof Amigos) {
                            if (((Amigos) contatos[j]).getGrau() == 1) {
                                contatos[j].imprimirContato();
                            }
                        }
                        if (contatos[j] instanceof Familia) {
                            if (((Familia) contatos[j]).getParentesco().equals("irmão")) {
                                contatos[j].imprimirContato();
                            }
                        }
                        if (contatos[j] instanceof Trabalho) {
                            if (((Trabalho) contatos[j]).getTipo().equals("colega")) {
                                contatos[j].imprimirContato();
                            }
                        }
                    }
                    break;

                case 7: // Imprimir dados de um único contato e seu tipo
                    System.out.println("Digite o índice do contato:");
                    ind = sc.nextInt();

                    if (ind < i) {
                        if (contatos[ind] instanceof Familia)
                            System.out.println("Familiar");
                        else if (contatos[ind] instanceof Amigos)
                            System.out.println("Amigo");
                        else if (contatos[ind] instanceof Trabalho)
                            System.out.println("Colega de trabalho");
                        contatos[ind].imprimirContato();

                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 8: // Sair
                    System.out.println("Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }
        sc.close();
    }
}
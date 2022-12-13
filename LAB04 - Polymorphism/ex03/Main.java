package ex03;

public class Main {

    public static void main(String[] args) {

        Universidade UFU = new Universidade("Universidade Federal de Uberlândia", 1969);
        Estudante estudantes[] = new Estudante[3];

        estudantes[0] = new EstudanteGraduacao("João", "Rua 1", "Programação Orientada a Objetos");
        estudantes[1] = new EstudanteMestrado("Pedro", "Rua 2", "Ciência da Computação", "Banco de Dados", "Acadêmico", "Banquinho de Dados");
        estudantes[2] = new EstudanteDoutorado("Maria", "Rua 3", "Sistemas de Informação", "Machine Learning e Redes Neurais", "Perdeu o emprego rs");
        // Para instanciar os objetos comentados abaixo, é necessário desfazer da abstração das classes EstudantePosGrad e EstudanteGraduacao
        // estudantes[3] = new EstudantePosGrad("Maria", "Rua 2", "Ciência da Computação", "Machine Learning e Redes Neurais");
        // estudantes[4] = new Estudante("Maria", "Rua 2");
        
        for(int i = 0; i < estudantes.length; i++){
                UFU.addEstudante(estudantes[i], i);
        }
        
        UFU.mostraEstudantes();
        UFU.mostraNome();

        Estudante est[] = new EstudantePosGrad[4];
        UFU.copiaEstPos(est, 4);
        est[0].print(); 

    }
}

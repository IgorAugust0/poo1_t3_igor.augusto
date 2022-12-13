package ex03;

public class Universidade {
    private String nomeUni;
    private int anoFundacao;

    private Estudante[] estudantes = new Estudante[100];

    public Universidade(String nomeUni, int anoFundacao) {
        this.nomeUni = nomeUni;
        this.anoFundacao = anoFundacao;
    }

    public void mostraEstudantes() {
        int estGrad = 0;
        int estMest = 0;
        int estDout = 0;

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] instanceof EstudanteGraduacao) {
                estGrad++;
            }
            if (estudantes[i] instanceof EstudanteMestrado) {
                estMest++;
            }
            if (estudantes[i] instanceof EstudanteDoutorado) {
                estDout++;
            }
        }
        System.out.println("Estudantes Graduação: " + estGrad +
                "\nEstudantes Mestrado: " + estMest +
                "\nEstudantes Doutorado: " + estDout);
    }

    public void addEstudante(Estudante est, int pos) {
        if (pos < estudantes.length) {
            estudantes[pos] = est;
        }
    }

    /*public void addEstudante2(Estudante est) {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == null) {
                estudantes[i] = est;
                break;
            }
        }
    }*/

    public void mostraNome() {
        for (Estudante estudantesi : estudantes) {
            if (estudantesi instanceof EstudanteDoutorado) {
                System.out.println("Nome: " + ((EstudanteDoutorado) estudantesi).getNome() +
                        "Título da Tese: " + ((EstudanteDoutorado) estudantesi).getTituloTese() +
                        "Linha de Pesquisa: " + ((EstudanteDoutorado) estudantesi).getLinhaDePesquisa() + "\n");
            } else {
                System.out.println("Nome: " + estudantesi.getNome() + "\n");
            }
        }
    }

    public void copiaEstPos(Estudante est[], int n) {
        for (int i = 0; i < this.estudantes.length && i < n; i++) {
            if (this.estudantes[i] instanceof EstudantePosGrad) {
                int pos = 0;
                est[pos] = this.estudantes[i];
                pos++;
                this.estudantes[i].print();
            } else {
                this.estudantes[i].print();
            }
        }
    }

    public String getNomeUni() {
        return nomeUni;
    }

    public void setNomeUni(String nomeUni) {
        this.nomeUni = nomeUni;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
}

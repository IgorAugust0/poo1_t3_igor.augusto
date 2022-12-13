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
        System.out.println("Nome da Universidade: " + nomeUni +
                "\nAno de Fundação: " + anoFundacao +
                "\nGraduação: " + estGrad +
                "\nMestrado: " + estMest +
                "\nDoutorado: " + estDout +
                "\nTotal de Estudantes: " + (estGrad + estMest + estDout) + '\n');
    }

    public void addEstudante(Estudante est, int pos) {
        if (pos < estudantes.length) {
            estudantes[pos] = est;
        }
    }

    

    public void mostraNome() {
        for (Estudante estudantesi : estudantes) {
            if (estudantesi instanceof EstudanteDoutorado) {
                System.out.println("Nome: " + ((EstudanteDoutorado) estudantesi).getNome() + "\n" +
                        "Título da Tese: " + ((EstudanteDoutorado) estudantesi).getTituloTese() + "\n" +
                        "Linha de Pesquisa: " + ((EstudanteDoutorado) estudantesi).getLinhaDePesquisa() + "\n");
            } else if (estudantesi instanceof EstudanteMestrado) {
                System.out.println("Nome: " + ((EstudanteMestrado) estudantesi).getNome() + "\n" +
                        "Título da Dissertação: " + ((EstudanteMestrado) estudantesi).getTituloDissertacao() + "\n" +
                        "Linha de Pesquisa: " + ((EstudanteMestrado) estudantesi).getLinhaDePesquisa() + "\n");
            } else if (estudantesi instanceof EstudanteGraduacao) {
                System.out.println("Nome: " + ((EstudanteGraduacao) estudantesi).getNome() + "\n" +
                        "Titulo do Trabalho de Conclusão: " + ((EstudanteGraduacao) estudantesi).getTituloTCC() + "\n");
            }
        }
    }
    
    public void copiaEstPos(Estudante[] est, int n) {
        int j = 0;
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] instanceof EstudantePosGrad) {
                est[j] = estudantes[i];
                j++;
            }
            if (j == n) {
                break;
            }
        }
    }

    /*public void copiaEstPos(Estudante est[], int n) {
        for (int i = 0; i < this.estudantes.length && i < n; i++) {
            int pos = 0;
            if (this.estudantes[i] instanceof EstudantePosGrad) {
                est[pos] = this.estudantes[i];
                pos++;
                this.estudantes[i].print();
            } else {
                this.estudantes[i].print();
            }
        }
    }*/

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

package ex03;

public class EstudanteDoutorado extends EstudantePosGrad {
    private String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao, String linhaDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhaDePesquisa);
        this.tituloTese = tituloTese;
    }

    /*@Override
    public double calc_cr(boolean incluiReprovacao) {
        return 10;
    }*/

    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" + "tituloTese='" + tituloTese + '\'' +'}');
    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}

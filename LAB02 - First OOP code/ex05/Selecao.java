public class Selecao {
    private String nomeSelecao;
    private String tecnico;
    private String pais;
    Figurinha[] jogadores = new Figurinha[11];

    public Selecao(String nomeSelecao, String tecnico, String pais) {

        this.nomeSelecao = nomeSelecao;
        this.tecnico = tecnico;
        this.pais = pais;

        for (int i = 0; i < jogador.length; i++) {
            jogador[i] = new Figurinha(pais);
        }

    }

    public Figurinha getJogador(int i) {
        return jogadores[i];
    }

    public void setJogador(Figurinha jogador, int i) {
        this.jogadores[i] = jogador;
    }

    public void imprimir() {
        System.out.println("Nome da seleção: " + this.nomeSelecao);
        System.out.println("Técnico: " + this.tecnico);
        System.out.println("País: " + this.pais);
        System.out.println("Jogadores: ");
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprimir();
        }
    }

}

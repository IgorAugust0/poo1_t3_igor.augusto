public class Selecao {
    private String nomeSelecao;
    private String tecnico;
    private String pais;
    private int anoFundacao;
    private int qtdTitulos;
    private Figurinha[] jogadores = new Figurinha[11];

    public Selecao(String nomeSelecao, String tecnico, String pais, int anoFundacao, int qtdTitulos) {
        this.nomeSelecao = nomeSelecao;
        this.tecnico = tecnico;
        this.pais = pais;
        this.anoFundacao = anoFundacao;
        this.qtdTitulos = qtdTitulos;
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
        System.out.println("Ano de fundação: " + this.anoFundacao);
        System.out.println("Quantidade de títulos: " + this.qtdTitulos);
        System.out.println("Jogadores: " + this.jogadores);
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprimir();
        }
    }
    
}

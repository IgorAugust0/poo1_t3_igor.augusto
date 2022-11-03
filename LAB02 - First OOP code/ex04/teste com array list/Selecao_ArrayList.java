import java.util.List;

public class Selecao_ArrayList {
    private String nomeSelecao;
    private String tecnico;
    private String pais;
    private int anoFundacao;
    private int qtdTitulos;
    // private Figurinha[] jogadores = new Figurinha_ArrayList[11];
    private List<String> jogadores;

    public Selecao_ArrayList(String nomeSelecao, String tecnico, String pais, int anoFundacao, int qtdTitulos, List<String> jogadores) {
        this.nomeSelecao = nomeSelecao;
        this.tecnico = tecnico;
        this.pais = pais;
        this.anoFundacao = anoFundacao;
        this.qtdTitulos = qtdTitulos;
    }

    public String getJogador(int i) {
        return jogadores.get(i);
    }
    public void setJogador(List<String> jogador, int i) {
        this.jogadores = jogador;
    }

    public void imprimir() {
        System.out.println("Nome da seleção: " + this.nomeSelecao);
        System.out.println("Técnico: " + this.tecnico);
        System.out.println("País: " + this.pais);
        System.out.println("Ano de fundação: " + this.anoFundacao);
        System.out.println("Quantidade de títulos: " + this.qtdTitulos);
        System.out.println("Jogadores: " + this.jogadores);
        
    }
    
}

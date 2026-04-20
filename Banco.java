import java.util.ArrayList;
public class Banco {
    public final static int TAMANHO_MAX_PRO_NOME = 10;

    private String nome;

    private ArrayList <ContaCorrente> contasCorrentes;

    public Banco(String nome) {
        setnome(nome);
        this.contasCorrentes = new ArrayList<>(); // Inicializa a lista de contas correntes

    }

    public String getNome() {
        return this.nome;

    }

    public void setnome(String novoNome) {
        if (novoNome.length() > TAMANHO_MAX_PRO_NOME) {
            return; // Não altera o nome se exceder o tamanho máximo

        }
        this.nome = novoNome;

    }
    public int getNumeroDeContasCorrentes() {
        return contasCorrentes.size();
    }
}
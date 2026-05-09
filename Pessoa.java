import java.util.ArrayList;

public class Pessoa {
    private final String cpf;

    private String nome;

    private ArrayList<Avaliavel> itensAvaliados;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.itensAvaliados = new ArrayList<>();
    }

    public Avaliavel getUltimoItemAvaliado() {
        return itensAvaliados.get(itensAvaliados.size() - 1); // Retorna o último item avaliado na lista
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf + " | Nome: " + nome;
        
    }

    public void avaliar(Avaliavel avaliavel, int nota) {
        if (nota < 1 || nota > 5) {
            throw new RuntimeException("Nota inválida");
    
    }
        avaliavel.receberAvaliacao(nota, this); // Chama o método receberAvaliacao do item avaliado, passando a nota e a pessoa que fez a avaliação      
 }
}

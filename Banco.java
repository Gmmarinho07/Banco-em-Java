import java.util.ArrayList;
public class Banco {
    public final static int TAMANHO_MAX_PRO_NOME = 10;
    public final static double SALARIO_BASE = 2000;

    private String nome;

    private ArrayList <ContaCorrente> contasCorrentes;
    private ArrayList<Funcionario> funcionarios;

    public Banco(String nome) {
        setnome(nome);
        this.contasCorrentes = new ArrayList<>(); // Inicializa a lista de contas correntes
        this.funcionarios = new ArrayList<>(); // Inicializa a lista de funcionários

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

    // Adicionar funionário e gerente
    public void adicionarFuncionario(String cpf, String nome, String matricula, boolean ehGerente) {
        if (ehGerente) {
            funcionarios.add(new Gerente(cpf, nome, matricula, this));
        } else {
            funcionarios.add(new Funcionario(cpf, nome, matricula, this));


        }
    }
    public Funcionario localizarFuncionario(String matricula) {
        for (Funcionario f : funcionarios) {
            if (f.getMatricula().equals(matricula)) {
                return f; // Retorna o funcionário encontrado
            }
        }
        return null; // Retorna null se nenhum funcionário for encontrado com a matrícula fornecida
    }
    public Gerente localizarGerente(String matricula) {
        Funcionario f = localizarFuncionario(matricula);
        if (f instanceof Gerente) { // Verifica se o funcionário encontrado é um gerente
            return (Gerente) f; // Retorna o gerente encontrado
        }
        return null; // Retorna null se nenhum gerente for encontrado com a matrícula fornecida
    
    }
    public void promoverFuncionario(Funcionario f) {
        System.out.println(f.getNome() + " será promovido!");
        f.salario *=1.3; // Aumenta o salário do funcionário em 30%
        System.out.println(f.toString()); // Imprime as informações do funcionário após a promoção
    }
}

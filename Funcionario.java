public class Funcionario extends Pessoa {
    private String matricula;
    protected double salario;
    private Banco banco;

    public Funcionario(String cpf, String nome, String matricula, Banco banco) {
        super(cpf, nome);
        this.matricula = matricula;
        this.banco = banco;
        this.salario = Banco.SALARIO_BASE;

    }
    public String getMatricula() {
        return matricula;

    }

    public double getSalario() {
        return salario;

    }

    public void imprimirContraCheque() {
        System.out.println("Salário atual: " + salario);

    }

    @Override
    public String toString() {
        return super.toString() +
        " | Matrícula: " + matricula +
        " | Salário: " + salario;
    }
    
}

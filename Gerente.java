import java.util.ArrayList;
public class Gerente extends Funcionario {
    private ArrayList<Funcionario> subordinados;

    public Gerente(String cpf, String nome, String matricula, Banco banco) {
        super(cpf, nome, matricula, banco);
        this.salario = Banco.SALARIO_BASE * 2;
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Funcionario f) {
        subordinados.add(f); // Usando o método add para adicionar um funcionário à lista de subordinados

    }
    public void imprimirEquipe() {
        for (Funcionario f : subordinados) {
            System.out.println(f.toString()); // Imprime as informações de cada funcionário subordinado

        }
    }
    @Override
    public String toString() {
        return super.toString() + 
        " | Equipe: " + subordinados.size();
    }
    
}


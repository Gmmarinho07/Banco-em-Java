public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco( "Banco Real");


        meuBanco.adicionarFuncionario("111", "Ana", "F1", false);
        meuBanco.adicionarFuncionario("222", "Bruno", "F2", false);
        meuBanco.adicionarFuncionario("333", "Carlos", "F3", false);
        meuBanco.adicionarFuncionario("444", "Diana", "G1",true);
        meuBanco.adicionarFuncionario("555", "Eduardo", "G2", true);

        // promovendo
        Funcionario f = meuBanco.localizarFuncionario("F1");
        meuBanco.promoverFuncionario(f);           
    }
    
}

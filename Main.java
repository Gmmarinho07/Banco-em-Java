import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        Banco meuBanco = new Banco( "Banco Real");
        System.out.println(
            "O banco " + meuBanco.getNome() + " tem " + meuBanco.getNumeroDeContasCorrentes() + " contas correntes.");
            
    }
    
}

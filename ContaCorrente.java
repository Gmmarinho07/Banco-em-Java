public class ContaCorrente {
    private Pessoa correntista;
    private long numeroConta; // Número da conta corrente
    private float saldoEmReais;
    private int limiteDeChequeEspecialEmReais;

    public ContaCorrente(long numeroConta, Pessoa correntista) {
        this.numeroConta = numeroConta;
        this.correntista = correntista;

    }

    public Pessoa getCorrentista() {
        return correntista;
    }
    
    public long getNumeroConta() {
        return numeroConta;
    }
}



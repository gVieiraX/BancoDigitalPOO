
public abstract class Conta  implements iConta{

    private static final int AGENCIA_PADRAO = 1;
    private  static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(){

    }

    public void depositar(){

    }

    public void transferir(){

    }


    public int getAgenica() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }
}

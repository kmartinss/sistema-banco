public class ContaCorrente extends Conta {
    private int saldo;

    public ContaCorrente(int numeroConta) {
        super(numeroConta);
        this.saldo = 0;
    }

    @Override
    public double sacar(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo insuficiente! Não foi possível sacar o valor informado.\n");
            return 0;
        }
        return super.sacar(valor);
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor);
    }

    @Override
    public String getDados() {
        return "[CORRENTE] " + getNumeroConta();
    }

    @Override
    public String toString() {
        return String.format("\n[CORRENTE] | %s", super.toString() + saldo);
    }
}
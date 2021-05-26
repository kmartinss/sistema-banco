public abstract class Conta {

    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public double sacar(double valor) {
        if (valor < 0) {
            return 0;
        }
        saldo -= valor;
        return valor;
    }

    public boolean depositar(double valor) {
        if (valor < 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public abstract String getDados(); // abstract torna o método obrigatório em todas extends

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return String.format("Conta numero: %d  Saldo: R$ %.1f", numeroConta, getSaldo());
    }

}

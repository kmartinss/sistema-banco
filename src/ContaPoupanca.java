public class ContaPoupanca extends Conta {
    
    private static double taxa;

    public ContaPoupanca(int numeroConta) {
        super(numeroConta);
    }

    @Override
    public double sacar(double valor) {
        if (getSaldo() >= valor) {
            super.sacar(taxa);
            return super.sacar(valor);
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Conta Poupança - Taxa de operação: R$ %.2f  %s", taxa, super.toString());
    }

    // o método que altera o atributo de classe deve ser static também
    public static void setTaxa(double taxaPoup) {
        taxa = taxaPoup;
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public String getDados() {
        return "[POUPANÇA] " + getNumeroConta();
    }
}

public class ContaPoupanca extends Conta {
    private static double taxa;

    public ContaPoupanca(int numeroConta) {
        super(numeroConta);
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

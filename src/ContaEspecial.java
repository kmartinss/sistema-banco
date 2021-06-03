public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numeroConta, double limite) {
        super(numeroConta);
        if (limite < 0) {
            this.limite = 0;
        } else {
            this.limite = limite;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite >= 0) {
            this.limite = limite;
        }
    }

    @Override
    public double sacar(double valor) {
        if (getSaldo() + getLimite() >= valor) {
            return super.sacar(valor);
        }
        System.out.println("Limite excedido! Saque não realizado.\n");
        return 0;
    }

    @Override
    public String toString() {
        return String.format("[ESPECIAL] | Limite: R$ %.2f  %s", limite, super.toString());
    }

    @Override
    public String getDados() {
        return "\n[ESPECIAL] " + getNumeroConta();
    }
}

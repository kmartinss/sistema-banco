import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> listaContas;

    public GerenciaConta() {
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) throws InterruptedException {
        listaContas.add(new ContaCorrente(numeroConta));
        System.out.println("Criando...");
        Thread.sleep(1000);
        System.out.println("Sua conta corrente foi criada com sucesso!");
    }

    public void novoContaEspecial(int numeroConta, double limite) throws InterruptedException {
        listaContas.add(new ContaEspecial(numeroConta, limite));
        System.out.println("Criando...");
        Thread.sleep(1000);
        System.out.println("Sua conta especial foi criada com sucesso!");

    }

    public void novaContaPoupanca(int numeroConta) throws InterruptedException {
        listaContas.add(new ContaPoupanca(numeroConta));
        System.out.println("Criando...");
        Thread.sleep(1000);
        System.out.println("Sua conta poupança foi criada com sucesso!");
    }

    public String listar() {
        String saida = "";

        for (Conta conta : listaContas) {
            saida += conta.getDados();
        }

        return saida;
    }

    private Conta procurar(int numeroConta) {
        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public boolean remover(int numero) {
        Conta conta = procurar(numero);
        if (conta != null) {
            return listaContas.remove(conta);
        }
        return false;
    }

    public boolean sacar(int contaNumero, double valor) {
        Conta conta = procurar(contaNumero);
        if (conta != null) {
            return conta.sacar(valor) != 0;
        }
        return false;
    }

    public boolean depositar(int contaNumero, double valor) {
        Conta conta = procurar(contaNumero);
        if (conta != null) {
            return conta.depositar(valor);
        }
        return false;
    }

    public boolean exibirConta(int contaNumero) {
        Conta conta = procurar(contaNumero);
        if (conta != null) {
            System.out.println(conta);
            return true;
        }
        return false;
    }

public boolean TaxaPoup(double taxa) {
    if (taxa < 0) {
        return false;
    }
    ContaPoupanca.setTaxa(taxa);
    return true;
}
}

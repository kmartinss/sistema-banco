import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> listaContas;

    public GerenciaConta() {
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaContas.add(new ContaCorrente(numeroConta));
        System.out.println("Conta corrente criada com sucesso!");
    }

    // public void removeContaCorrente(int numeroConta) {
    // listaContas.remove(new ContaCorrente(numeroConta));
    // System.out.println("Conta corrente removida com sucesso!");
    // }

    public void novoContaEspecial(int numeroConta, double limite) {
        listaContas.add(new ContaEspecial(numeroConta, limite));
        System.out.println("Conta especial criada com sucesso!");

    }

    public void novaContaPoupanca(int numeroConta) {
        listaContas.add(new ContaPoupanca(numeroConta));
        System.out.println("Conta poupança criada com sucesso!");
    }

    public String listar() {
        String saida = "";

        for (Conta conta : listaContas) {
            saida += conta.getDados() + "\n";
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

    // public boolean remover(int numeroConta) {
    //     for (Conta conta : listaContas) {

    //         String numConta = String.valueOf(numeroConta);
    //         String getNumeroConta = String.valueOf(conta.getNumeroConta());
    //         if (getNumeroConta.equals(numConta)) {
    //             int numeroConvertido = Integer.parseInt(numConta);
    //             listaContas.remove(numeroConvertido);
    //             return true;
    //         }
    //     }
    //     return false;
    // }

}

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        GerenciaConta contas = new GerenciaConta();

        int opcao, numeroConta = 0;
        double limite;

        do {
            System.out.println("[1] Nova conta corrente");
            System.out.println("[2] Nova conta especial");
            System.out.println("[3] Nova conta poupança");
            System.out.println("[4] Realizar depósito");
            System.out.println("[5] Realizar saque");
            System.out.println("[6] Listar");
            System.out.println("[7] Remover conta");
            System.out.println("[8] Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Vamos criar uma conta corrente.\n Informe o número da sua conta: ");
                    numeroConta = input.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Vamos criar uma conta especial.\n Informe o número da sua conta: ");
                    numeroConta = input.nextInt();
                    System.out.println("Informe o limite: ");
                    limite = input.nextDouble();
                    contas.novoContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.println("Vamos criar uma conta poupança.\n Informe o número da sua conta: ");
                    numeroConta = input.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                //ok
                    System.out.print("Informe o numero da conta: ");
                    numeroConta = input.nextInt();
                    System.out.print("Informe o valor do depósito: R$ ");
                    double valorDeposito = input.nextDouble();
                    contas.depositar(numeroConta, valorDeposito);
                    contas.exibirConta(numeroConta);
                    break;

                case 5:
                //ok
                    System.out.print("Informe o numero da conta: ");
                    numeroConta = input.nextInt();
                    System.out.print("Informe o valor do saque: R$ ");
                    double valorSaque = input.nextDouble();
                    contas.sacar(numeroConta, valorSaque);
                    contas.exibirConta(numeroConta);
                    break;

                case 6:
                //ok
                    System.out.println(contas.listar());
                    break;

                case 7:
                    // OK
                    System.out.println("Digite o número da conta que você deseja remover:");
                    numeroConta = input.nextInt();
                    contas.remover(numeroConta);
                    break;
                case 8:
                    break;

                default:
                    System.err.println("Opção inválida.");
                    break;
            }

        } while (opcao != 8);

        input.close();
    }
}

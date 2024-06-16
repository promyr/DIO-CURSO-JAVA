package Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        double saldo = 0;
        double saldoP= 0;
        Cliente belchior = new Cliente("Belchior");
        Conta cc = new ContaCorrente(belchior);
        Conta pp = new ContaPoupanca(belchior);



        while (continuar) {
            System.out.println(" ");
            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            System.out.println("3.Consultar Saldo");
            System.out.println("4.Transferir");
            System.out.println("5.Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Escolha a conta para depósito:");
                    System.out.println("1. Conta Corrente");
                    System.out.println("2. Conta Poupança");
                    int tipoContaDeposito = scanner.nextInt();

                    System.out.println(" ");
                    System.out.println("Digite o valor a ser depositado:");
                    double deposito = scanner.nextDouble();

                    if (tipoContaDeposito == 1) {
                        cc.depositar(deposito);
                        System.out.println(" ");
                        System.out.println("Depósito realizado na conta corrente.");
                        System.out.println(" ");
                        cc.imprimirExtrato();

                    } else if (tipoContaDeposito == 2) {
                        pp.depositar(deposito);
                        System.out.println("Depósito realizado na conta poupança.");
                        System.out.println(" ");
                        pp.imprimirExtrato();
                    } else {
                        System.out.println("Tipo de conta inválido.");
                    }
                    break;

                case 2:
                    System.out.println("Escolha a conta para saque:");
                    System.out.println("1. Conta Corrente");
                    System.out.println("2. Conta Poupança");
                    int tipoContaSaque = scanner.nextInt();

                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();

                    if (tipoContaSaque == 1) {
                        cc.sacar(valorSaque);
                        System.out.println(" ");
                        cc.imprimirExtrato();
                    } else if (tipoContaSaque == 2) {
                        pp.sacar(valorSaque);
                        System.out.println(" ");
                        pp.imprimirExtrato();
                    } else {
                        System.out.println("Tipo de conta inválido.");
                    }
                    break;

                    case 3:
                        cc.imprimirExtrato();
                        System.out.println(" ");
                        pp.imprimirExtrato();
                        break;

                case 4:
                        System.out.println(" ");
                        System.out.println("Escolha a conta origem:");
                        System.out.println("1. Conta Corrente");
                        System.out.println("2. Conta Poupança");
                        int tipoContaOrigem = scanner.nextInt();

                        System.out.println(" ");
                        System.out.println("Escolha a conta destino:");
                        System.out.println("1. Conta Corrente");
                        System.out.println("2. Conta Poupança");
                        int tipoContaDestino = scanner.nextInt();

                        System.out.println(" ");
                        System.out.println("Digite o valor a ser transferido:");
                        double transferencia = scanner.nextDouble();

                        if (tipoContaOrigem == 1 && tipoContaDestino == 2) {
                            cc.transferir(transferencia, pp);
                            System.out.println(" ");
                            System.out.println("Valor transferido entre contas.");
                            System.out.println(" ");
                            cc.imprimirExtrato();
                            System.out.println(" ");
                            pp.imprimirExtrato();

                        } else if (tipoContaOrigem == 2 && tipoContaDestino == 1) {
                            pp.transferir(transferencia, cc);
                            System.out.println(" ");
                            System.out.println("Valor transferido entre contas.");
                            System.out.println(" ");
                            pp.imprimirExtrato();
                            System.out.println(" ");
                            cc.imprimirExtrato();

                        } else if (tipoContaOrigem == 1 && tipoContaDestino == 1) {
                            System.out.println("Transferência entre contas do mesmo tipo não permitida.");
                        } else if (tipoContaOrigem == 2 && tipoContaDestino == 2) {
                            System.out.println("Transferência entre contas do mesmo tipo não permitida.");
                        } else {
                            System.out.println("Tipo de conta inválido.");
                        }
                        break;


                    case 5:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }
}

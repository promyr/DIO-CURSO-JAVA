import java.util.Scanner;

public class ContaTerminal  {
    String Agencia;
    String nomeCliente;
    int numeroConta;
    double saldo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  Solicitara os dados do usuario
        System.out.println("Digite o numero da agencia: ");
            String Agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente");
            String nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da conta");
          int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta");
           Double saldo = scanner.nextDouble();

            scanner.close();

        System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agencia é " + Agencia + ", conta " + numeroConta + " e o seu saldo é R$" + saldo);
    }
}
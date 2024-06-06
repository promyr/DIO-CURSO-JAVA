import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 25.0;
        double valorSolicitado =27.0;
        System.out.println("o seu saldo é R$" + saldo);
        System.out.println("Qual valor deseja retirar?");


        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo é " + saldo);
        } else
            System.out.println("Saldo é insuficiente");
    }
}
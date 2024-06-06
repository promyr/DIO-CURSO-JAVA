import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo1 parâmetro");
        int parametroDois = terminal.nextInt();


        try {
            contar(parametroDois, parametroUm);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

        static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (parametroUm <= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
            int contagem =  parametroDois - parametroUm;
            System.out.println("imprimindo o numero " + contagem);
            //realizar o for para imprimir os números com base na variável contagem

        }
    }

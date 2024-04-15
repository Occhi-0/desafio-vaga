import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();
        scanner.close();

        boolean pertence = numeroInformado == num1 || numeroInformado == num2;

        while (num1 + num2 <= numeroInformado) {
            int proximoNumero = num1 + num2;
            if (proximoNumero == numeroInformado) {
                pertence = true;
                break;
            }
            num1 = num2;
            num2 = proximoNumero;
        }

        System.out.println(numeroInformado + (pertence ? " pertence" : " não pertence") + " à sequência de Fibonacci.");
    }
}


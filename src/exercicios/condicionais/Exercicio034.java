package exercicios.condicionais;
import java.util.Scanner;

public class Exercicio034 {
    public static void main(String[] args) {
        System.out.println("Verifica se a soma de três números é positiva, negativa ou zero");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;

        if (soma > 0) {
            System.out.println("A soma é positiva.");
        } else if (soma < 0) {
            System.out.println("A soma é negativa.");
        } else {
            System.out.println("A soma é igual a zero.");
        }

        scanner.close();
    }
}

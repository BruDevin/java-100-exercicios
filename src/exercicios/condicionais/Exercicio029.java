package exercicios.condicionais;
import java.util.Scanner;

public class Exercicio029 {
    public static void main(String[] args) {
        System.out.println("Verifica se um número é par ou ímpar");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        scanner.close();
    }
}

package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio093 {
    public static void main(String[] args) {
        System.out.println("Verifica se é primo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (verificaPrimo(num)) {
            System.out.println("É primo.");
        } else {
            System.out.println(("Não é primo."));
        }

        scanner.close();
    }

    public static boolean verificaPrimo(int num) {
        if (num <= 1) {
            return false;
        } else {
            return verificaPrimoRecursivo(num, 2);
        }
    }

    public static boolean verificaPrimoRecursivo(int num, int divisor) {
        if (divisor == num) {
            return true;
        }

        if (num % divisor == 0) {
            return false;
        }

        return verificaPrimoRecursivo(num, divisor + 1);
    }
}

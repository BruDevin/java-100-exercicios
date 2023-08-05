package exercicios.loops;

import java.util.Scanner;

public class Exercicio057 {
    public static void main(String[] args) {
        System.out.println("Exibe os primeiros n números primos");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int contaPrimos = 0;
        int testaPrimos = 2;

        while (contaPrimos < num) {
            if (ehPrimo(testaPrimos)) {
                System.out.println(testaPrimos);
                contaPrimos++;
            }

            testaPrimos++;
        }

        scanner.close();
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

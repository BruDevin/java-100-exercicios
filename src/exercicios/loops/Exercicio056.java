package exercicios.loops;

import java.util.Scanner;

public class Exercicio056 {
    public static void main(String[] args) {
        System.out.println("Lista os primos menores que n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        /*for (int i = 2; i < num; i++) {
            boolean ehPrimo = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(i);
            }
        }*/

        //

        for (int i = 2; i < num; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
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

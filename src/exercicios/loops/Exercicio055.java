package exercicios.loops;

import java.util.Scanner;

public class Exercicio055 {
    /*public static void main(String[] args) {
        System.out.println("Verifica se um número é primo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = "É primo.";

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                resultado = "Não é primo.";
            }
        }

        System.out.println(resultado);

        scanner.close();
    }*/

    //

    public static void main(String[] args) {
        System.out.println("Verifica se um número é primo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        boolean ehPrimo = true;

        if (num <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                }
            }
        }

        if (ehPrimo) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }

        scanner.close();
    }
}

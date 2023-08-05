package exercicios.loops;

import java.util.Scanner;

public class Exercicio054 {
    public static void main(String[] args) {
        System.out.println("Calcula uma potência");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int exp = scanner.nextInt();

        /*int potencia = 1;

        for (int i = 1; i <= exp; i++) {
            potencia *= base;
        }*/

        //

        double potencia = Math.pow(base, exp);

        System.out.println("Resultado: " + potencia);

        scanner.close();
    }
}

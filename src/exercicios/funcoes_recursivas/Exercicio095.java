package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio095 {
    public static void main(String[] args) {
        System.out.println("Calcula uma potência");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int exp = scanner.nextInt();

        double potencia = calculaPotencia(base, exp);

        System.out.println("Potência: " + potencia);

        scanner.close();
    }

    public static double calculaPotencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * calculaPotencia(base, exp - 1);
        }
    }
}

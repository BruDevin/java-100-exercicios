package exercicios.loops;

import java.util.Scanner;

public class Exercicio068 {
    public static void main(String[] args) {
        System.out.println("MMC");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int maior = Math.max(num1, num2);
        int mmc = maior;

        while (mmc % num1 != 0 || mmc % num2 !=0) {
            mmc += maior;
        }

        System.out.println("MMC: " + mmc);

        scanner.close();
    }
}

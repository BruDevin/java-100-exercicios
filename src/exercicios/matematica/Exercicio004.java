package exercicios.matematica;

import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        System.out.println("Média geométrica entre três números");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double mediaGeometrica = Math.pow(numero1 * numero2 * numero3, 1.0/3.0);

        System.out.println("A média geométrica dos números é: " + mediaGeometrica);

        scanner.close();
    }
}

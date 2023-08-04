package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio030 {
    public static void main(String[] args) {
        System.out.println("Verifica se um número é positivo, negativo ou zero");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Número 0");
        }

        scanner.close();
    }
}

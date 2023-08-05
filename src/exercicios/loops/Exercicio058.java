package exercicios.loops;

import java.util.Scanner;

public class Exercicio058 {
    public static void main(String[] args) {
        System.out.println("Exibe os n primeiros quadrados perfeitos");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int contador = 0;
        int testaQuadrado = 1;

        while (contador < num) {
            if (ehQuadrado(testaQuadrado)) {
                System.out.println(testaQuadrado);
                contador++;
            }

            testaQuadrado++;
        }

        scanner.close();
    }

    public static boolean ehQuadrado(int num) {
        int raiz = (int) Math.sqrt(num);

        if (raiz* raiz == num) {
            return true;
        }

        return false;
    }
}

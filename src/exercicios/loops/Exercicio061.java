package exercicios.loops;

import java.util.Scanner;

public class Exercicio061 {
    public static void main(String[] args) {
        System.out.println("Exibe a sequência de Fibonacci até o número n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        while (primeiroTermo <= num) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }

}

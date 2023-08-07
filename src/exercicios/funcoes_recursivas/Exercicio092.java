package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio092 {
    public static void main(String[] args) {
        System.out.println("Calcula a sequência de Fibonacci até determinado número de termos");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(calculaFibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int calculaFibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return calculaFibonacci(num - 1) + calculaFibonacci(num - 2);
        }
    }
}

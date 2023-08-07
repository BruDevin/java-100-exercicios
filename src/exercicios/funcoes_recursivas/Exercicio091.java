package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio091 {
    public static void main(String[] args) {
        System.out.println("Calcula o fatorial de um número");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        long fatorial = calculaFatorial(num);

        System.out.println("Fatorial: " + fatorial);
    }

    private static long calculaFatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * calculaFatorial(num - 1);
        }
    }
}

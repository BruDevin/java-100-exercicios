package exercicios.loops;

import java.util.Scanner;

public class Exercicio060 {
    public static void main(String[] args) {
        System.out.println("Exibe a soma dos positivos informados (informe um negativo para sair)");

        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int soma = 0;

        do {
            soma += num;

            System.out.print("Digite um número (negativo para sair): ");
            num = scanner.nextInt();
        } while (!(num < 0));

        System.out.println(soma);

        scanner.close();
    }
}

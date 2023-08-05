package exercicios.loops;

import java.util.Scanner;

public class Exercicio062 {
    public static void main(String[] args) {
        System.out.println("Calcula a média dos números informados");

        Scanner scanner = new Scanner(System.in);

        double num;
        double soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = scanner.nextDouble();

            soma += num;
            contador++;
        } while (!(num == 0));

        double media = soma;

        System.out.println("Média: " + media / (contador - 1));
    }
}

package exercicios.loops;

import java.util.Scanner;

public class Exercicio063 {
    public static void main(String[] args) {
        System.out.println("Retorna o maior e o menor dos números informados");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (zero para sair): ");
        int maior = scanner.nextInt();
        int menor = maior;

        while (true) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num ==0) {
                break;
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println ("Maior: " + maior);
        System.out.println ("Menor: " + menor);

        scanner.close();
    }
}

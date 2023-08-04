package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio043 {
    public static void main(String[] args) {
        System.out.println("Verifica se um número é divisível por 3 e 5 ao mesmo tempo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisível por 3 e por 5.");
        } else {
            System.out.println("Não é divisível por 3 e por 5 ao mesmo tempo.");
        }

        scanner.close();
    }
}

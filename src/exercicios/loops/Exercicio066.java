package exercicios.loops;

import java.util.Scanner;

public class Exercicio066 {
    public static void main(String[] args) {
        System.out.println("Verifica se é palídromo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        /*String fraseReversa = new StringBuilder(frase).reverse().toString();

        if (frase.equalsIgnoreCase(fraseReversa)) {
            System.out.println("É palíndromo.");
        } else {
            System.out.println("Não é palíndromo.");
        }*/

        //

        int i = 0;
        int j = frase.length() - 1;
        boolean ehPalindromo = true;

        String fraseMin = frase.toLowerCase();

        while (i < j) {
            if (fraseMin.charAt(i) != fraseMin.charAt(j)) {
                ehPalindromo = false;
                break;
            }

            i++;
            j--;
        }

        if (ehPalindromo) {
            System.out.println("É palíndromo.");
        } else {
            System.out.println("Não é palíndromo.");
        }

        scanner.close();
    }
}

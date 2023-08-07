package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio099 {
    public static void main(String[] args) {
        System.out.println("Verifica se é palíndromo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String string = scanner.nextLine().toLowerCase();

        boolean ehPalindromo = verificaPalindromo(string);

        System.out.println("É palíndromo? " + ehPalindromo);
    }

    public static boolean verificaPalindromo(String string) {
        if (string.length() <= 1) {
            return true;
        } else {
            char primeiro = string.charAt(0);
            char ultimo = string.charAt(string.length() - 1);

            if (primeiro == ultimo) {
                String subPalavra = string.substring(1, string.length() - 1);
                return verificaPalindromo(subPalavra);
            } else {
                return false;
            }
        }
    }
}

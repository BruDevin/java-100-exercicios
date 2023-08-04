package exercicios.strings;

import java.util.Scanner;

public class Exercicio020 {
    public static void main(String[] args) {
        System.out.println("Verifica se é palíndromo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraFormatada = palavra.replace(" ", "").toLowerCase();

        boolean palindromo = true;

        for (int i = 0; i < palavraFormatada.length() / 2; i++) {
            char a = palavraFormatada.charAt(i);
            char b = palavraFormatada.charAt(palavraFormatada.length() - i - 1);

            if (a != b) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scanner.close();
    }
}

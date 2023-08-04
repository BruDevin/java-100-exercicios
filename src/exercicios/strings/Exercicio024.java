package exercicios.strings;

import java.util.Scanner;

public class Exercicio024 {
    public static void main(String[] args) {
        System.out.println("Conta as vogais de uma palavra");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int contadorVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));

            if (letra == 'a' ||
            letra == 'e' ||
            letra == 'i' ||
            letra == 'o' ||
            letra == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("A quantidade de vogais é: " + contadorVogais + ".");

        scanner.close();
    }
}

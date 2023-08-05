package exercicios.loops;

import java.util.Scanner;

public class Exercicio064 {
    public static void main(String[] args) {
        System.out.println("Conta as vogais de uma frase");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int vogais = 0;

        /*char[] chars = frase.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a'
            || chars[i] == 'á'
            || chars[i] == 'à'
            || chars[i] == 'e'
            || chars[i] == 'é'
            || chars[i] == 'i'
            || chars[i] == 'í'
            || chars[i] == 'o'
            || chars[i] == 'ó'
            || chars[i] == 'u'
            || chars[i] == 'ú') {
                vogais++;
            }
        }*/

        //

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a'
                    || frase.charAt(i) == 'à'
                    || frase.charAt(i) == 'á'
                    || frase.charAt(i) == 'e'
                    || frase.charAt(i) == 'é'
                    || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'í'
                    || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'ó'
                    || frase.charAt(i) == 'u'
                    || frase.charAt(i) == 'ú') {
                vogais++;
            }
        }

        System.out.println(vogais + " vogais");

        scanner.close();
    }
}

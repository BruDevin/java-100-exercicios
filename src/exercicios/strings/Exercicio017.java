package exercicios.strings;

import java.util.Scanner;

/*public class Exercicio017 {
    public static void main(String[] args) {
        System.out.println("Separar as letras de uma palavra");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length() - 1; i++) {
            char letra = palavra.charAt(i);
            System.out.print(letra + " - ");
        }

        System.out.print(palavra.charAt(palavra.length() - 1));

        scanner.close();
    }
}*/

//

public class Exercicio017 {
    public static void main(String[] args) {
        System.out.println("Separar as letras de uma palavra");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        char[] letras = palavra.toCharArray();

        for (char letra : letras) {
            System.out.print(letra + " ");
        }

        scanner.close();
    }
}
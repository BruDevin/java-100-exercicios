package exercicios.strings;

import java.util.Scanner;

/*public class Exercicio023 {
    public static void main(String[] args) {
        System.out.println("Conta os espaços em branco de uma frase");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorEspacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorEspacos++;
            }
        }

        System.out.println("O número de espaços em branco é: " + contadorEspacos + ".");

        scanner.close();
    }
}*/

//

public class Exercicio023 {
    public static void main(String[] args) {
        System.out.println("Conta os espaços em branco de uma frase");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] partes = frase.split(" ");

        int contadorDeEspacos = partes.length - 1;

        System.out.println("A quantidade de espaços em branco é: " + contadorDeEspacos + ".");
    }
}
package exercicios.loops;

import java.util.Scanner;

public class Exercício065 {
    public static void main(String[] args) {
        System.out.println("Exibe a frase de trás pra frente");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        for (int i = frase.length(); i > 0; i--) {
            System.out.print(frase.charAt(i -1));
        }

        scanner.close();
    }
}

package exercicios.strings;

import java.util.Scanner;

public class Exercicio025 {
    public static void main(String[] args) {
        System.out.println("Recebe um nome completo e exibe o sobrenome primeiro");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome completo: ");
        String nome = scanner.nextLine();

        String[] partes = nome.split(" ");

        String sobrenome = partes[partes.length - 1];

        System.out.print("Nome com sobrenome primeiro: " + sobrenome + ",");

        for (int i = 0; i < partes.length -1; i++) {
            System.out.print(" " + partes[i]);
        }

        scanner.close();
    }
}

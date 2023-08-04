package exercicios.strings;

import java.util.Scanner;

public class Exercicio022 {
    public static void main(String[] args) {
        System.out.println("Exibir o primeiro nome de um nome completo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome completo: ");
        String nome = scanner.nextLine();

        String[] partesDoNome = nome.split(" ");

        String primeiroNome = partesDoNome[0];

        System.out.println("O primeiro nome é " + primeiroNome + ".");

        scanner.close();
    }
}

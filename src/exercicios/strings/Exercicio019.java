package exercicios.strings;

import java.util.Scanner;

public class Exercicio019 {
    public static void main(String[] args) {
        System.out.println("Verificar se nome começa com a letra \"A\"");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        String nomeMinusculo = nome.toLowerCase();

        if (nomeMinusculo.startsWith("a")) {
            System.out.println("O nome começa com a letra A.");
        } else {
            System.out.println("O nome não começa com a letra A.");
        }

        scanner.close();
    }
}

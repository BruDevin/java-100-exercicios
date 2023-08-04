package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio038 {
    public static void main(String[] args) {
        System.out.println("Verifica se o cidadão tem idade para votar");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        Integer idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else {
            System.out.println("Pode votar.");
        }

        scanner.close();
    }
}

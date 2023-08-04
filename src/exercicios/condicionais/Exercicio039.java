package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio039 {
    public static void main(String[] args) {
        System.out.println("Verifica se o cidadão tem idade para votar, e se é obrigado ou não");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        Double idade = scanner.nextDouble();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else {
            System.out.println("Pode votar.");
            if (idade < 18 || !(idade < 70)) {
                System.out.println("Voto facultativo.");
            } else {
                System.out.println("Voto obrigatório.");
            }
        }

        scanner.close();
    }
}

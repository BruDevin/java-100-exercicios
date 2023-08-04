package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio032 {
    public static void main(String[] args) {
        System.out.println("Calcula a média e verifica se o aluno foi aprovado");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media < 6) {
            System.out.println("O aluno foi reprovado.");
        } else {
            System.out.println("O aluno foi aprovado.");
        }

        scanner.close();
    }
}

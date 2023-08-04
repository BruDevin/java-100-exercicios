package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio040 {
    public static void main(String[] args) {
        System.out.println("Verifica se um aluno ficou aprovado, reprovado ou em recuperação");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        Double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        Double nota3 = scanner.nextDouble();

        Double media = (nota1 + nota2 + nota3) / 3;

        if (!(media < 7)) {
            System.out.println("Aprovado.");
        } else if (media < 4) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Em recuperação.");
        }

        scanner.close();
    }
}

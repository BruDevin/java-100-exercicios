package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio031 {
    public static void main(String[] args) {
        System.out.println("Verifica se um aluno foi aprovado");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double primeiraNota = scanner.nextDouble();

        System.out.print("digite a nota da segunda prova: ");
        double segundaNota = scanner.nextDouble();

        if (primeiraNota < 6) {
            System.out.println("O aluno foi reprovado na primeira prova.");
        } else {
            System.out.println("O aluno foi aprovado na primeira prova.");
        }

        if (segundaNota < 6) {
            System.out.println("O aluno foi reprovado na segunda prova.");
        } else {
            System.out.println("O aluno foi aprovado na segunda prova.");
        }

        scanner.close();
    }
}

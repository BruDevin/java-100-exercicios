package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio044 {
    public static void main(String[] args) {
        System.out.println("Verifica se é criança, adolescente, adulto ou idoso");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        Integer idade = scanner.nextInt();

        if (idade < 13) {
            System.out.println("Criança.");
        } else if (idade < 18) {
            System.out.println("Adolescente.");
        } else if (idade < 60) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Idoso.");
        }

        scanner.close();
    }
}

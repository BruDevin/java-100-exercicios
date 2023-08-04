package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio041 {
    public static void main(String[] args) {
        System.out.println("Verifica se é dia útil ou fim de semana");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = scanner.nextLine();

        if (dia.equalsIgnoreCase("sábado")
                || dia.equalsIgnoreCase("sabado")
                || dia.equalsIgnoreCase("domingo")) {
            System.out.println("Fim de semana.");
        } else {
            System.out.println("Dia útil.");
        }

        scanner.close();
    }
}

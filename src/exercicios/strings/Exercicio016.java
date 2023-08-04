package exercicios.strings;

import java.util.Scanner;

public class Exercicio016 {
    public static void main(String[] args) {
        System.out.println("Concatenar duas palavras");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        String resultado = palavra1 + palavra2;

        System.out.println("A palavra resultante da concatenação é: " + resultado);

        scanner.close();
    }
}

package exercicios.strings;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio021 {
    public static void main(String[] args) {
        System.out.println("Verifica se uma palavra é anagrama de outra");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        palavra1 = palavra1.replace(" ", "").toLowerCase();
        palavra2 = palavra2.replace(" ", "").toLowerCase();

        if (palavra1.length() != palavra2.length()) {
            System.out.println("Uma palavra não é anagrama da outra.");
        } else {
            char[] arr1 = palavra1.toCharArray();
            char[] arr2 = palavra2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Uma palavra é anagrama da outra.");
            } else {
                System.out.println("Uma palavra não é anagrama da outra.");
            }
        }

        scanner.close();
    }
}

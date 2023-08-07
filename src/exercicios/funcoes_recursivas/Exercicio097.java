package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio097 {
    public static void main(String[] args) {
        System.out.println("Inverte uma string");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();

        String stringInvertida = inverteString(string);

        System.out.println("Texto original: " + string);
        System.out.println("Texto invertido: " + stringInvertida);
    }

    public static String inverteString (String string) {
        if (string.isEmpty()) {
            return string;
        } else {
            char primeiroChar = string.charAt(0);
            String restoString = string.substring(1);
            return inverteString(restoString) + primeiroChar;
        }
    }
}

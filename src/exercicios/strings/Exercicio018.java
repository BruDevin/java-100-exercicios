package exercicios.strings;

import java.util.Scanner;

/*public class Exercicio018 {
    public static void main(String[] args) {
        System.out.println("Substituir as letras \"a\" por \"e\"");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String novaFrase = frase.replace("a", "e");

        System.out.println("Frase modificada: " + novaFrase);

        scanner.close();
    }
}*/

//

public class Exercicio018 {
    public static void main(String[] args) {
        System.out.println("Substituir as letras \"a\" por \"e\"");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a') {
                novaFrase += 'e';
            } else if (letra == 'A') {
                novaFrase += 'E';
            } else {
                novaFrase += letra;
            }
        }

        System.out.println("Frase modificada: " + novaFrase);

        scanner.close();
    }
}

package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio036 {
    public static void main(String[] args) {
        System.out.println("Verifica quantos maiores de idade entre três pessoas");

        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[3];

        System.out.print("Digite a primeira idade: ");
        idades[0] = scanner.nextInt();

        System.out.print("Digite a segunda idade: ");
        idades[1] = scanner.nextInt();

        System.out.print("Digite a terceira idade: ");
        idades[2] = scanner.nextInt();

        int contadorMaiores = 0;

        for (int i = 0; i < 3; i++) {
            if (!(idades[i] < 18)) {
                contadorMaiores++;
            }
        }

        System.out.println(contadorMaiores + " são maiores de idade.");

        scanner.close();
    }
}

package exercicios.loops;

import java.util.Scanner;

public class Exercicio050 {
    public static void main(String[] args) {
        System.out.println("Exibe a taboada");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer num = scanner.nextInt();

        Integer resultado;

        System.out.println("Taboada de " + num);
        /*for (int i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }*/

        //

        Integer i = 1;

        while (i <= 10) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
            i++;
        }

        scanner.close();
    }
}

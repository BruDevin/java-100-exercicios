package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio094 {
    public static void main(String[] args) {
        System.out.println("Soma dos dígitos de um número");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int soma = calculaSoma(num);

        System.out.println("Soma: " + soma);
    }

    public static int calculaSoma(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + calculaSoma(num / 10);
        }
    }
}

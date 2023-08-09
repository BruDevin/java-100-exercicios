package exercicios.extras;

import java.util.Scanner;

public class SequenciaDeCollatz {
    public static void main(String[] args) {
        int num = recebeNumeroInteiro();
        exibeSequenciaDeCollatz(num);
    }

    private static int recebeNumeroInteiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        return scanner.nextInt();
    }

    private static void exibeSequenciaDeCollatz(int num) {
        System.out.print(num + " ");
        if (num == 1) {
            return;
        }
        if (num % 2 == 0) {
            num /= 2;
        } else {
            num = (num * 3) + 1;
        }
        exibeSequenciaDeCollatz(num);
    }

}

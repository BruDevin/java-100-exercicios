package exercicios.extras;

import java.util.Scanner;

public class TorreDeHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de discos: ");
        int numDiscos = scanner.nextInt();

        resolveTorreDeHanoi (numDiscos, 'A', 'B', 'C');

        scanner.close();
    }

    public static void resolveTorreDeHanoi (int numDiscos, char origem, char auxiliar, char destino) {
        if (numDiscos == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            resolveTorreDeHanoi(numDiscos - 1, origem, destino, auxiliar);
            System.out.println("Mover disco " + numDiscos + " de " + origem + " para " + destino);
            resolveTorreDeHanoi(numDiscos - 1, auxiliar, origem, destino);
        }
    }
}

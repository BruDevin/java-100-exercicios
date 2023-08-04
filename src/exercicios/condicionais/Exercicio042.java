package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio042 {
    public static void main(String[] args) {
        System.out.println("Verifica como está o IMC da pessoa: ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        Double altura = scanner.nextDouble();

        Double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso normal.");
        } else if (imc < 30) {
            System.out.println("Acima do peso.");
        } else if (imc < 35) {
            System.out.println("Obesidade.");
        } else {
            System.out.println("Obesidade grave.");
        }
    }
}

package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio037 {
    public static void main(String[] args){
        System.out.println("Verifica s eé possível formar um triângulo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        Integer lado1 = scanner.nextInt();

        System.out.print("Digite o segundo lado: ");
        Integer lado2 = scanner.nextInt();

        System.out.print("Digite o terceiro lado: ");
        Integer lado3 = scanner.nextInt();

        Boolean triangulo = (lado1 + lado2 > lado3)
                && (lado2 + lado3 > lado1)
                && (lado3 + lado1 > lado2);

        if (triangulo) {
            System.out.println("Pode formar triângulo");
        } else {
            System.out.println("Não pode formar triângulo.");
        }

        scanner.close();
    }
}

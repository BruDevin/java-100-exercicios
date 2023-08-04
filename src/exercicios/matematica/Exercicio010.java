package exercicios.matematica;

import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        System.out.println("Perímetro e área de um triângulo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado a do triângulo: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado b do triângulo: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado c do triângulo: ");
        double c = scanner.nextDouble();

        System.out.print("Digite a altura h relativa ao lado b do triângulo: ");
        double h = scanner.nextDouble();

        double perimetro = a + b + c;
        double area = b * h / 2;

        System.out.println("O perímetro do triângulo é: " + perimetro);
        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}

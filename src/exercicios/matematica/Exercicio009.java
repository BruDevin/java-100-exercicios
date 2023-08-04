package exercicios.matematica;

import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args) {
        System.out.println("Perímetro e área de um retângulo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        double perimetro = (largura + comprimento) * 2;
        double area = largura * comprimento;

        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}

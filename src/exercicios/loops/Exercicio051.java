package exercicios.loops;

public class Exercicio051 {
    public static void main(String[] args) {
        System.out.println("Tabuada de 1 a 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada de " + i);

            for (int j = 1; j <= 10; j++) {
                Integer resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();
        }
    }
}

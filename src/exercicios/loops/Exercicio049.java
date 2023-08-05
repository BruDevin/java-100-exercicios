package exercicios.loops;

public class Exercicio049 {
    public static void main(String[] args) {
        System.out.println("Lista os números pares de 1 a 50 e o ímpares de 51 a 100");

        /*Integer i = 2;

        while (i <= 50) {
            System.out.println(i);
            i += 2;
        }

        i = 51;

        while (i <=100) {
            System.out.println(i);
            i += 2;
        }*/

        //

        /*for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }

        for (int i = 51; i <= 100; i += 2) {
            System.out.println(i);
        }*/

        //

        /*Integer i = 1;

        while (i <= 100) {
            if (i <= 50 && i % 2 == 0) {
                System.out.println(i);
            } else if (i > 50 && i % 2 == 1){
                System.out.println(i);
            }
            i++;
        }*/

        //

        for (int i = 1; i <= 100; i++) {
            if (i <=50 && i % 2 == 0) {
                System.out.println(i);
            } else if (i > 50 && i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}

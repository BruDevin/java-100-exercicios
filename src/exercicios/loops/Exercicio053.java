package exercicios.loops;

public class Exercicio053 {
    public static void main(String[] args) {
        System.out.println("Soma todos os pares de 1 a 100");

        int soma = 0;

        for (int i = 2; i <= 100; i += 2) {
            soma += i;
        }

        System.out.println("A soma de todos os pares de 1 a 100 é " + soma + ".");
    }

}

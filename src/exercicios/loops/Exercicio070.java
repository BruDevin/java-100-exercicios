package exercicios.loops;

import java.util.Scanner;

public class Exercicio070 {
    public static void main(String[] args) {
        System.out.println("Valida um CPF");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            System.out.println("CPF inválido.");
            return;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            System.out.println("CPF inválido");
            return;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (10 - i);
        }

        int resto = soma % 11;
        int primeiroDigito = (resto < 2) ? 0 : 11 - resto;

        if (primeiroDigito != Character.getNumericValue(cpf.charAt(9))) {
            System.out.println("CPF inválido");
            return;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (11 - i);
        }

        resto = soma % 11;
        int segundoDigito = (resto < 2) ? 0 : 11 - resto;

        if (segundoDigito != Character.getNumericValue(cpf.charAt(10))) {
            System.out.println("CPF inválido");
            return;
        }

        System.out.println("CPF válido");

        scanner.close();
    }
}

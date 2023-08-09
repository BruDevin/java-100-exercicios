package exercicios.extras;

import java.util.Scanner;

public class PalavrasPrimas {
    public static void main(String[] args) {
        String palavra = recebePalavra();
        boolean resultado = isPalavraPrima(palavra);
        exibeResultado(resultado);
    }

    private static String recebePalavra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        return palavra;
    }

    public static boolean isPalavraPrima (String palavra) {
        int valorPalavra = calculaValorPalavra(palavra);
        boolean isPalavraPrima = true;
        if (valorPalavra < 2) {
            isPalavraPrima = false;
        } else {
            for (int i = 2; i <= Math.sqrt(valorPalavra); i++) {
                if (valorPalavra % i == 0) {
                    isPalavraPrima = false;
                    break;
                }
            }
        }

        return isPalavraPrima;
    }

    private static int calculaValorPalavra(String palavra) {
        int valorPalavra = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            int valorLetra = letra - 'a' + 1;
            valorPalavra += valorLetra;
        }

        return valorPalavra;
    }

    private static void exibeResultado(boolean resultado) {
        if (resultado) {
            System.out.println("A palavra é prima.");
        } else {
            System.out.println("A palavra não é prima.");
        }
    }
}

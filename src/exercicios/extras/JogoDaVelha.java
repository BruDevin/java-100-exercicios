package exercicios.extras;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        String sair = "";
        Scanner scanner = new Scanner(System.in);
        char[][] jogoDaVelha = geraTabuleiroVazio();
        int[] jogada = new int[2];

        while (!sair.equalsIgnoreCase("s")) {

            do {
                jogada = joga();
            } while(verificaCasaOcupada(jogada, jogoDaVelha));

            atualizaJogo(jogada, 'X', jogoDaVelha);

            imprimeTabuleiro(jogoDaVelha);

            System.out.println(verificaJogoDaVelha(jogoDaVelha));

            if (!verificaJogoDaVelha(jogoDaVelha).equalsIgnoreCase("O jogo não terminou!")) {
                return;
            }

            do {
                jogada = joga();
            } while(verificaCasaOcupada(jogada, jogoDaVelha));

            atualizaJogo(jogada, 'O', jogoDaVelha);

            imprimeTabuleiro(jogoDaVelha);

            System.out.println(verificaJogoDaVelha(jogoDaVelha));

            if (!verificaJogoDaVelha(jogoDaVelha).equalsIgnoreCase("O jogo não terminou!")) {
                return;
            }


            System.out.print("Qualquer tecla para continuar ou s para sair: ");
            sair = scanner.nextLine();
        }

    }

    private static void atualizaJogo(int[] jogada, char jogador, char[][] jogoDaVelha) {
        jogoDaVelha[jogada[0]][jogada[1]] = jogador;
    }

    private static boolean verificaCasaOcupada(int[] jogada, char[][] jogoDaVelha) {
        return jogoDaVelha[jogada[0]][jogada[1]] != ' ';
    }

    private static int[] joga() {
        int[] jogada = new int[2];
        Random random = new Random();
        jogada[0] = random.nextInt(3);
        jogada[1] = random.nextInt(3);
        return jogada;
    }

    private static void imprimeTabuleiro(char[][] jogoDaVelha) {
        System.out.println(Arrays.toString(jogoDaVelha[0]));
        System.out.println(Arrays.toString(jogoDaVelha[1]));
        System.out.println(Arrays.toString(jogoDaVelha[2]));
    }

    private static char[][] geraTabuleiroVazio() {
        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        return tabuleiro;
    }


    public static String verificaJogoDaVelha  (char[][] matriz) {
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] == matriz[i][1]
                    && matriz[i][1] == matriz [i][2]
                    && matriz[i][0] != ' ') {
                return "Jogador " + matriz[i][0] + " venceu!";
            }
        }

        for (int i = 0; i < 3; i++) {
            if (matriz[0][i] == matriz[1][i]
                    && matriz[1][i] == matriz [2][i]
                    && matriz[0][i] != ' ') {
                return "Jogador " + matriz[0][i] + " venceu!";
            }
        }

        if (((matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2])
        || (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]))
        && matriz[1][1] != ' ') {
            return "Jogador " + matriz[1][1] + " venceu!";
        }

        boolean haEspacoVazio = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == ' ') {
                    haEspacoVazio = true;
                    break;
                }
            }
        }

        if (!haEspacoVazio) {
            return "Empate!";
        }

        return "O jogo não terminou!";
    }
}

package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
        char[] respostas = new char[10];
        int pontuacao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Resposta da questão %d: ", i + 1);
            respostas[i] = sc.next().toLowerCase().charAt(0);

            if (respostas[i] == gabarito[i]) {
                System.out.printf("Q%d: %c : Correto\n", i + 1, respostas[i]);
                pontuacao++;
            } else {
                System.out.printf("Q%d: %c : Errada, resposta correta (%c)\n", i + 1, respostas[i], gabarito[i]);
            }
        }

        System.out.println("Pontuação Final: " + pontuacao);

        sc.close();
    }
}

package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3.0;

        if (media == 10) {
            System.out.println("Aprovado com Distinção - Média: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado - Média: " + media);
        } else {
            System.out.println("Reprovado - Média: " + media);
        }

        sc.close();
    }
}

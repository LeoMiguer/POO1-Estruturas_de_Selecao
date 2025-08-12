package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;
        char conceito;

        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6) {
            conceito = 'C';
        } else if (media >= 4) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.printf("Notas: %.2f, %.2f%n", n1, n2);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}

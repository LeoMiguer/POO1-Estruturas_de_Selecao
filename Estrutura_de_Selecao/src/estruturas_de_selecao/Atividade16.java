package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a média do aluno: ");
        double media = sc.nextDouble();

        if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Em Exame");
        } else if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Média inválida.");
        }
        sc.close();
    }
}

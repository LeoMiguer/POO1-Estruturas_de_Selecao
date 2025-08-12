package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro menor que 1000: ");
        int num = sc.nextInt();

        if (num < 0 || num >= 1000) {
            System.out.println("Número inválido.");
            sc.close();
            return;
        }

        int centenas = num / 100;
        int dezenas = (num % 100) / 10;
        int unidades = num % 10;

        if (centenas > 0) {
            System.out.print(centenas + " centenas");
        }
        if (dezenas > 0) {
            if (centenas > 0) System.out.print(", ");
            System.out.print(dezenas + " dezenas");
        }
        if (unidades > 0) {
            if (centenas > 0 || dezenas > 0) System.out.print(", ");
            System.out.print(unidades + " unidades");
        }
        System.out.println();

        sc.close();
    }
}

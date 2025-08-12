package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano com 4 dígitos: ");
        int ano = sc.nextInt();

        boolean bissexto = false;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        sc.close();
    }
}

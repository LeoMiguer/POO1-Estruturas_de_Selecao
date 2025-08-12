package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            num++; // par para ímpar
            System.out.println("Número era par. Agora transformado em ímpar: " + num);
        } else {
            num--; // ímpar para par
            System.out.println("Número era ímpar. Agora transformado em par: " + num);
        }
        sc.close();
    }
}

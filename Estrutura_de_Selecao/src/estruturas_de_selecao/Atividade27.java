package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        if (num == Math.floor(num)) {
            System.out.println("Número inteiro");
        } else {
            System.out.println("Número decimal");
        }
        sc.close();
    }
}

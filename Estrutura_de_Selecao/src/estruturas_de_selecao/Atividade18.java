package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1 do triângulo: ");
        double l1 = sc.nextDouble();
        System.out.print("Digite o lado 2 do triângulo: ");
        double l2 = sc.nextDouble();
        System.out.print("Digite o lado 3 do triângulo: ");
        double l3 = sc.nextDouble();

        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triângulo Equilátero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo.");
        }
        sc.close();
    }
}

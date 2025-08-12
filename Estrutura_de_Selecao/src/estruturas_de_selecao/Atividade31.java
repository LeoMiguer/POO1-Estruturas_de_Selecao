package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de morangos (Kg): ");
        double kgMorango = sc.nextDouble();

        System.out.print("Quantidade de maçãs (Kg): ");
        double kgMaca = sc.nextDouble();

        double precoMorango = (kgMorango <= 5) ? 2.50 : 2.20;
        double precoMaca = (kgMaca <= 5) ? 1.80 : 1.50;

        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;

        double totalCompra = totalMorango + totalMaca;
        double totalKg = kgMorango + kgMaca;

        if (totalKg > 8 || totalCompra > 25) {
            totalCompra *= 0.90; // desconto de 10%
        }

        System.out.printf("Valor a pagar: R$ %.2f\n", totalCompra);

        sc.close();
    }
}

package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de litros vendidos: ");
        double litros = sc.nextDouble();

        System.out.print("Tipo de combustível (A-álcool, G-gasolina): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        double precoLitro = 0;
        double desconto = 0;

        if (tipo == 'A') {
            precoLitro = 1.90;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = 2.50;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            sc.close();
            return;
        }

        double valorTotal = precoLitro * litros;
        double valorDesconto = valorTotal * desconto;
        double valorPagar = valorTotal - valorDesconto;

        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);

        sc.close();
    }
}

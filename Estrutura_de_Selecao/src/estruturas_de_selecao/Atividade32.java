package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tipos de carne:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o tipo de carne (1, 2 ou 3): ");
        int tipo = sc.nextInt();

        System.out.print("Quantidade (Kg): ");
        double quantidade = sc.nextDouble();

        System.out.println("Forma de pagamento:");
        System.out.println("1 - Cartão Tabajara");
        System.out.println("2 - Dinheiro ou outro cartão");
        System.out.print("Digite a forma de pagamento (1 ou 2): ");
        int pagamento = sc.nextInt();

        double precoKg = 0;
        String nomeCarne = "";

        switch (tipo) {
            case 1:
                nomeCarne = "Filé Duplo";
                precoKg = (quantidade <= 5) ? 4.90 : 5.80;
                break;
            case 2:
                nomeCarne = "Alcatra";
                precoKg = (quantidade <= 5) ? 5.90 : 6.80;
                break;
            case 3:
                nomeCarne = "Picanha";
                precoKg = (quantidade <= 5) ? 6.90 : 7.80;
                break;
            default:
                System.out.println("Tipo de carne inválido.");
                sc.close();
                return;
        }

        double precoTotal = precoKg * quantidade;
        double desconto = 0;

        if (pagamento == 1) { // Cartão Tabajara
            desconto = precoTotal * 0.05;
        }

        double valorPagar = precoTotal - desconto;

        System.out.println("----- CUPOM FISCAL -----");
        System.out.println("Tipo da carne: " + nomeCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.println("Tipo de pagamento: " + (pagamento == 1 ? "Cartão Tabajara" : "Outro"));
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);

        sc.close();
    }
}

package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite o código de origem: ");
        int codigo = sc.nextInt();

        String procedencia;

        switch (codigo) {
            case 1:
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Norte";
                break;
            case 3:
                procedencia = "Leste";
                break;
            case 4:
                procedencia = "Oeste";
                break;
            case 5:
            case 6:
                procedencia = "Nordeste";
                break;
            case 7:
            case 8:
                procedencia = "Centro-oeste";
                break;
            default:
                procedencia = "Importado";
        }

        System.out.printf("Preço: R$ %.2f - Procedência: %s%n", preco, procedencia);

        sc.close();
    }
}

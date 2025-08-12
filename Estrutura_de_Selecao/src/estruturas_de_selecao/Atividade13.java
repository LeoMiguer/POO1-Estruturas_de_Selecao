package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        System.out.print("Quantidade de horas trabalhadas no mês: ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora * horas;

        double ir = 0;
        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.10;
        } else {
            ir = salarioBruto * 0.20;
        }

        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = ir + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("(-) IR (%.0f%%): R$ %.2f%n", (ir == 0 ? 0 : (ir / salarioBruto) * 100), ir);
        System.out.printf("(-) INSS (10%%): R$ %.2f%n", salarioBruto * 0.10);
        System.out.printf("FGTS (11%%): R$ %.2f%n", fgts);
        System.out.printf("Total de descontos: R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}

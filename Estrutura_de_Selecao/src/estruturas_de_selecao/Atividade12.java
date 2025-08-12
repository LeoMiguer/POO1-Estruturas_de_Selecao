package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário do colaborador: ");
        double salario = sc.nextDouble();

        double reajuste = 0;
        double percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario <= 700) {
            percentual = 15;
        } else if (salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        reajuste = salario * (percentual / 100);
        double novoSalario = salario + reajuste;

        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentual);
        System.out.printf("Valor do aumento: R$ %.2f%n", reajuste);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n", novoSalario);

        sc.close();
    }
}

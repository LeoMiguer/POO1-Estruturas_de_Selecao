package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Qual operação deseja realizar? (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;
        boolean valido = true;

        switch (op) {
            case '+': resultado = n1 + n2; break;
            case '-': resultado = n1 - n2; break;
            case '*': resultado = n1 * n2; break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                    valido = false;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);

            // Par ou ímpar
            if (resultado % 2 == 0) {
                System.out.println("O resultado é par.");
            } else {
                System.out.println("O resultado é ímpar.");
            }

            // Positivo ou negativo
            if (resultado > 0) {
                System.out.println("O resultado é positivo.");
            } else if (resultado < 0) {
                System.out.println("O resultado é negativo.");
            } else {
                System.out.println("O resultado é zero.");
            }

            // Inteiro ou decimal
            if (resultado == Math.floor(resultado)) {
                System.out.println("O resultado é inteiro.");
            } else {
                System.out.println("O resultado é decimal.");
            }
        }

        sc.close();
    }
}

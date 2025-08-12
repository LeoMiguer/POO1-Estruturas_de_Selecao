package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = Character.toUpperCase(sc.next().charAt(0));

        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            sc.close();
            return;
        }

        System.out.printf("Altura: %.2f m, Peso: %.2f kg, Sexo: %c%n", altura, peso, sexo);
        System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);

        if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");
        }
        sc.close();
    }
}

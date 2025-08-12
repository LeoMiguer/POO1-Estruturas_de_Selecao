package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respostasPositivas = 0;

        System.out.println("Responda as perguntas com Sim ou Não:");

        System.out.print("Telefonou para a vítima? ");
        if (sc.next().equalsIgnoreCase("Sim")) respostasPositivas++;

        System.out.print("Esteve no local do crime? ");
        if (sc.next().equalsIgnoreCase("Sim")) respostasPositivas++;

        System.out.print("Mora perto da vítima? ");
        if (sc.next().equalsIgnoreCase("Sim")) respostasPositivas++;

        System.out.print("Devia para a vítima? ");
        if (sc.next().equalsIgnoreCase("Sim")) respostasPositivas++;

        System.out.print("Já trabalhou com a vítima? ");
        if (sc.next().equalsIgnoreCase("Sim")) respostasPositivas++;

        if (respostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }

        sc.close();
    }
}

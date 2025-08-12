package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra (F ou M): ");
        char sexo = Character.toUpperCase(sc.next().charAt(0));
        if (sexo == 'F') {
            System.out.println("F - Feminino");
        } else if (sexo == 'M') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Letra inválida.");
        }
        sc.close();
    }
}

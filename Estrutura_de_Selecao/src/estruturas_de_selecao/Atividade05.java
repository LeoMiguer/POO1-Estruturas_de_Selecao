package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = Character.toLowerCase(sc.next().charAt(0));
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra '" + letra + "' é uma vogal.");
        } else {
            System.out.println("A letra '" + letra + "' não é uma vogal.");
        }
        sc.close();
    }
}

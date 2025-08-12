package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Em que turno você estuda? (M - Matutino, V - Vespertino, N - Noturno): ");
        char turno = Character.toUpperCase(sc.next().charAt(0));

        switch (turno) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Turno inválido.");
        }
        sc.close();
    }
}

package estruturas_de_selecao;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma data (dd/mm/aaaa): ");
        String data = sc.nextLine();

        String[] partes = data.split("/");
        if (partes.length != 3) {
            System.out.println("Data inválida.");
            sc.close();
            return;
        }

        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            boolean valido = true;

            if (ano < 1) {
                valido = false;
            } else if (mes < 1 || mes > 12) {
                valido = false;
            } else if (dia < 1) {
                valido = false;
            } else {
                int[] diasMes = {31, (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if (dia > diasMes[mes - 1]) {
                    valido = false;
                }
            }

            if (valido) {
                System.out.println("Data válida.");
            } else {
                System.out.println("Data inválida.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Data inválida.");
        }

        sc.close();
    }
}

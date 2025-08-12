package estruturas_de_selecao;

import java.util.Scanner;
import java.util.Arrays;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.print("Digite o primeiro número: ");
        nums[0] = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        nums[1] = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        nums[2] = sc.nextInt();

        Arrays.sort(nums);
        System.out.println("Números em ordem decrescente:");
        for (int i = 2; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        sc.close();
    }
}

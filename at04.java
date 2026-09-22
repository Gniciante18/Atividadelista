package L02;

import java.util.Scanner;

public class at04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiros: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiros: ");
        int n2 = sc.nextInt();

        if (n2 == 0) {
            System.out.println("A verificação não pode ser feita pois o segundo número é zero.");
        } else {
            if (n1 % n2 == 0) {
                System.out.println(n1 + " é múltiplo de " + n2 + ".");
            } else {
                System.out.println(n1 + " Nao é multiplo de " + n2 + ".");
            }
        }

    }
}
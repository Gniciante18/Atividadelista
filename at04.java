package L01;

import java.util.Scanner;

public class at04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double n3 = sc.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4.0;

        System.out.printf("A média final do aluno é: %.2f%n", media);
    }
}
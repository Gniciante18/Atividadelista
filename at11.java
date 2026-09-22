package L02;

import java.util.Scanner;

public class at11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a frequência (%): ");
        double frequencia = sc.nextDouble();

        if (frequencia < 75.0) {
            System.out.println("Reprovado por falta");
        } else {
            System.out.print("Digite a média final: ");
            double media = sc.nextDouble();

            if (media >= 7.0) {
                System.out.println("Aprovado");
            } else if (media >= 5.0) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado por nota");
            }
        }

    }
}
package L01;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = sc.nextDouble();

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else if (media >= 5.0) {
            System.out.println("Situação: RECUPERAÇÃO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }
}
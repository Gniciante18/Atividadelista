package L02;

import java.util.Scanner;

public class at09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite o tempo de casa em anos: ");
        double tempoAnos = sc.nextDouble();

        double percentual;

        if (tempoAnos < 1) {
            percentual = 0.0;
        } else if (tempoAnos <= 3) {
            percentual = 5.0;
        } else if (tempoAnos <= 10) {
            percentual = 10.0;
        } else {
            percentual = 15.0;
        }

        double bonus = salario * (percentual / 100.0);

        System.out.printf("Percentual de bônus: %.0f%%%n", percentual);
        System.out.printf("Valor do bônus     : R$ %.2f%n", bonus);

    }
}
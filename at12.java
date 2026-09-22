package L01;

import java.util.Scanner;

public class at12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o consumo mensal de energia (kWh): ");
        double consumo = sc.nextDouble();

        double precoPorKwh;

        if (consumo <= 100) {
            precoPorKwh = 0.50;
        } else if (consumo <= 300) {
            precoPorKwh = 0.75;
        } else {
            precoPorKwh = 1.10;
        }

        double valorTotal = consumo * precoPorKwh;

        System.out.printf("Preço aplicado por kWh: R$ %.2f%n", precoPorKwh);
        System.out.printf("Valor total da conta: R$ %.2f%n", valorTotal);
    }
}
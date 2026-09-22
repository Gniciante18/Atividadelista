package L01;

import java.util.Scanner;

public class at03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em Reais (R$): ");
        double valorReais = sc.nextDouble();

        System.out.print("Digite a cotação do Dólar (US$): ");
        double cotacaoDolar = sc.nextDouble();

        double valorConvertido = valorReais / cotacaoDolar;

        System.out.printf("R$ %.2f equivalem a US$ %.2f%n", valorReais, valorConvertido);
    }
}
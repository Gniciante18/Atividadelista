package L01;

import java.util.Scanner;

public class at06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Área do círculo: %.2f%n", area);
        System.out.printf("Perímetro do círculo: %.2f%n", perimetro);
    }
}
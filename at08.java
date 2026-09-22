package L01;

import java.util.Scanner;

public class at08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graaus Celsius (°C): ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.1f °C correspondem a: %.1f °F e %.2f K%n", celsius, fahrenheit, kelvin);
    }
}
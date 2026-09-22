package L02;

import java.util.Scanner;

public class at03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura (°C): ");
        double temp = sc.nextDouble();

        System.out.print("Digite a umidade relativa do ar (%): ");
        double umidade = sc.nextDouble();

        if (temp >= 38) {
            System.out.println("Alerta de calor extremo!");
        }
        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa!");
        }
        if (temp >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada!");
        }

    }
}
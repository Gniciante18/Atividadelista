package L02;

import java.util.Scanner;

public class at08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade máxima da via (km/h): ");
        double maxima = sc.nextDouble();

        System.out.print("Digite a velocidade do veículo (km/h): ");
        double veiculo = sc.nextDouble();

        if (veiculo <= maxima) {
            System.out.println("Dentro do limite. Sem multa.");
        } else if (veiculo <= maxima * 1.20) {
            System.out.println("Infração Média.");
        } else if (veiculo <= maxima * 1.50) {
            System.out.println("Infração Grave.");
        } else {
            System.out.println("Infração Gravíssima.");
        }


    }
}
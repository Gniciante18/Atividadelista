package L02;

import java.util.Scanner;

public class at02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("É positivo.");
        }
        if (numero % 2 == 0) {
            System.out.println("É par.");
        }
        if (numero % 5 == 0) {
            System.out.println("É múltiplo de 5.");
        }
        if (Math.abs(numero) >= 10 && Math.abs(numero) <= 99) {
            System.out.println("Tem dois dígitos.");
        }
    }
}
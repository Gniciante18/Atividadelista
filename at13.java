package L02;

import java.util.Scanner;

public class at13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> System.out.printf("Resultado: %.2f%n", n1 + n2);
            case 2 -> System.out.printf("Resultado: %.2f%n", n1 - n2);
            case 3 -> System.out.printf("Resultado: %.2f%n", n1 * n2);
            case 4 -> {
                if (n2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                } else {
                    System.out.printf("Resultado: %.2f%n", n1 / n2);
                }
            }
            default -> System.out.println("Opção inválida.");
        }

    }
}
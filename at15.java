package L02;

import java.util.Scanner;

public class at15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo do veículo (1-Carro, 2-Moto): ");
        int tipo = sc.nextInt();

        double tarifaHora;

        switch (tipo) {
            case 1 -> tarifaHora = 8.00;
            case 2 -> tarifaHora = 5.00;
            default -> {
                System.out.println("Opção inválida.");
                sc.close();
                return;
            }
        }

        System.out.print("Digite a quantidade de horas: ");
        int horas = sc.nextInt();
        sc.nextLine();

        double valorTotal = horas * tarifaHora;

        System.out.print("Possui cupom de desconto? (sim/nao): ");
        String temCupom = sc.nextLine();

        if (temCupom.equalsIgnoreCase("sim")) {
            if (valorTotal >= 50.00) {
                valorTotal *= 0.80;
            } else {
                System.out.println("O cupom vale apenas para compras acima de R$ 50,00.");
            }
        }

        if (horas > 12) {
            System.out.println("Aviso: Permanência longa.");
        }
        if (horas > 24) {
            System.out.println("Aviso: Cobrança de diária.");
        }

        if (horas <= 2) {
            System.out.println("Classificação: Permanência Curta");
        } else if (horas <= 6) {
            System.out.println("Classificação: Permanência Média");
        } else {
            System.out.println("Classificação: Permanência Longa");
        }

        System.out.printf("Valor final a pagar: R$ %.2f%n", valorTotal);

    }
}
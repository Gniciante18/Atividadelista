package L02;

import java.util.Scanner;

public class at12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o limite diário de saque: R$ ");
        double limiteDiario = sc.nextDouble();

        System.out.print("Digite o valor a ser sacado: R$ ");
        double valorSaque = sc.nextDouble();

        if (saldo < valorSaque) {
            System.out.println("Saldo insuficiente.");
        } else {
            if (valorSaque > limiteDiario) {
                System.out.println("Valor ultrapassa o limite diário de saque.");
            } else {
                saldo -= valorSaque;
                System.out.println("Saque efetuado com sucesso.");
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }
        }


    }
}
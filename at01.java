package L01;

import java.util.Scanner;

public class at01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos e mede " + altura + "m de altura.");
    }
}
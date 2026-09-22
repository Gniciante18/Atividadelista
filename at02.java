package L01;

import java.util.Scanner;

public class at02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisaoInteira = n1 / n2;
        int resto = n1 % n2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Produto: " + multiplicacao);
        System.out.println("Divisão Inteira: " + divisaoInteira);
        System.out.println("Resto da Divisão: " + resto);
    }
}

package L01;

import java.util.Scanner;

public class at05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada (R$): ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoInss = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - descontoInss;

        System.out.printf("Salário Bruto  : R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS  : R$ %.2f%n", descontoInss);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
    }
}
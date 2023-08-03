package Atividades;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double salarioLimite = 1350.00;
        final double percentualAumentoSuperior = 0.10;
        final double percentualAumentoInferior = 0.15;

        System.out.print("Qual o salario do funcionario?: R$ ");
        double salario = scanner.nextDouble();

        double aumento;
        if (salario > salarioLimite) {
            aumento = salario * percentualAumentoSuperior;
        } else {
            aumento = salario * percentualAumentoInferior;
        }

        double novoSalario = salario + aumento;
        System.out.printf("Obteve um aumento de R$ %.2f , o novo salario é de R$ %.2f", aumento, novoSalario);

        scanner.close();
    }
}
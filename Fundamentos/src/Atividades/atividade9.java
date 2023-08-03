package Atividades;

import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores deseja inserir? ");
        int quantidadeValores = scanner.nextInt();

        double soma = 0;
        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Insira o valor " + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / quantidadeValores;
        System.out.println("A media aritmetica e: " + media);

        scanner.close();
    }
}


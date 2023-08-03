package Atividades;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double precoMenorQue200Km = 0.50;
        final double precoMaiorOuIgual200Km = 0.45;
        final int limiteDistancia = 200;

        System.out.print("Escreva a distancia que o passageiro deseja percorrer em km: ");
        double distancia = scanner.nextDouble();

        double precoPassagem;
        if (distancia <= limiteDistancia) {
            precoPassagem = distancia * precoMenorQue200Km;
        } else {
            precoPassagem = distancia * precoMaiorOuIgual200Km;
        }

        System.out.printf("O preço da passagem e de R$ %.2f", precoPassagem);

        scanner.close();
    }
 }



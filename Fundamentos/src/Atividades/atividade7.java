package Atividades;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de KW/h consumidos: ");
        double consumo = input.nextDouble();

        System.out.print("Digite o tipo de instalacao (R para residencia, I para industria, C para comercio): ");
        char tipoInstalacao = input.next().charAt(0);

        double preco = calcularPreco(consumo, tipoInstalacao);
        System.out.println("O preço a pagar e: R$" + preco);

        input.close();
    }

    public static double calcularPreco(double consumo, char tipoInstalacao) {
        double preco = 0.0;

        switch (tipoInstalacao) {
            case 'R':
                if (consumo <= 500) {
                    preco = consumo * 0.40;
                } else {
                    preco = consumo * 0.65;
                }   break;
            case 'I':
                if (consumo <= 1000) {
                    preco = consumo * 0.55;
                } else {
                    preco = consumo * 0.60;
                }   break;
            case 'C':
                if (consumo <= 5000) {
                    preco = consumo * 0.55;
                } else {
                    preco = consumo * 0.60;
                }   break;
            default:
                System.out.println("Tipo de instalacao inválido.");
                break;
        }

        return preco;
    }
}


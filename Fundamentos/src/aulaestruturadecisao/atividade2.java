/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaestruturadecisao;

/**
 *
 * @author Aluno
 */ 

import java.util.Scanner;

public class atividade2 {
  public class CalculoValorConstrucao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do terreno (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno (em metros): ");
        double comprimento = scanner.nextDouble();

        double areaTotal = largura * comprimento;
        double valorPorMetroQuadrado;

        if (areaTotal <= 250) {
            valorPorMetroQuadrado = 8.50;
        } else if (areaTotal <= 350) {
            valorPorMetroQuadrado = 9.50;
        } else {
            valorPorMetroQuadrado = 11.50;
        }

        double valorFinal = areaTotal * valorPorMetroQuadrado;

        System.out.println("Area total do terreno: " + areaTotal + "m²");
        System.out.println("Valor por metro quadrado: R$ " + valorPorMetroQuadrado);
        System.out.println("Valor a ser pago: R$ " + valorFinal);

        scanner.close();
    }
  }
}

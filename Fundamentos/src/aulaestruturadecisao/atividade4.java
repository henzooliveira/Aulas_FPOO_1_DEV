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

public class atividade4 {
    

public class CalculoEconomia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados dos itens
        String[] itens = {"Notebook Lenovo", "Celular MotoG22", "Carro Hb20", "Apartamento"};
        double[] valoresTotais = {3299.00, 1789.00, 68000.00, 180000.00};
        double[] percentuaisEconomia = {0.05, 0.10, 0.02, 0.01};

        for (int i = 0; i < itens.length; i++) {
            System.out.println("Item: " + itens[i]);
            System.out.println("Valor total: R$ " + valoresTotais[i]);
            System.out.println("Percentual a economizar: " + (percentuaisEconomia[i] * 100) + "%");

            System.out.print("Digite o valor que você pretende economizar por mes: R$ ");
            double valorEconomiaMensal = scanner.nextDouble();

            int meses = (int) Math.ceil(valoresTotais[i] / (valorEconomiaMensal * percentuaisEconomia[i]));

            System.out.println("Quantidade de meses para economizar: " + meses);
            System.out.println("-----------------------------------");
        }

        scanner.close();
    }
  }
}

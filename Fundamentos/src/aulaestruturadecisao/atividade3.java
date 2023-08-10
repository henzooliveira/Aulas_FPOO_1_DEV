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

public class atividade3 {
   

public class CalculoPrecoAlmoco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o prato desejado:");
        System.out.println("1. Arroz, feijao, bife acebolado - R$ 19,99");
        System.out.println("2. Arroz, feijao, filé de frango - R$ 18,99");
        System.out.println("3. Arroz, feijao, brajola - R$ 23,99");
        System.out.print("Opcao: ");
        
        int opcao = scanner.nextInt();
        
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();
        
        double valorTotal = 0.0;

        switch (opcao) {
            case 1:
                valorTotal = 19.99 * quantidade;
                break;
            case 2:
                valorTotal = 18.99 * quantidade;
                break;
            case 3:
                valorTotal = 23.99 * quantidade;
                break;
            default:
                System.out.println("Opcao invalida.");
                System.exit(0);
        }

        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        scanner.close();
    }
  }
}

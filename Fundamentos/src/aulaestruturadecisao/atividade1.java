/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaestruturadecisao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class atividade1 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite o cargo do funcionario(Gerente, supervisor, tecnico, auxiliar");
      String cargo = scanner.nextLine();
      
      System.out.println("Digite o salario: R$");
      double salarioBruto = scanner.nextDouble();
      
      double salarioLiquido = calcularSalario(cargo, salarioBruto);
      
      if (salarioLiquido == -1) {
          System.out.println("Cargo nao encontrado na tabela");
      }else{
          System.out.printf("O salario liquido  %s e de; R$ %.2f%n", cargo,salarioLiquido);
      }
      scanner.close();
    }
  
  public static double calcularSalario(String cargo, double salarioBruto) {
      double descontoINSS = 0.0;
      double convenio = 0.0;
      
      switch (cargo) {
          case "gerente":
              descontoINSS = salarioBruto * 0.00;
              convenio = 289.00;
              
              break;
          case "supervisor":
              descontoINSS = salarioBruto * 0.07;
              convenio = 239.00;
              
              break;
          default:
          case "tecnico":
              descontoINSS = salarioBruto * 0.04;
              convenio = 189.00;
              
              break;
          case "auxiliar":
              descontoINSS = salarioBruto * 0.02;
              convenio = 156.00;
              
              throw new AssertionError();
      }
      
      double salarioLiquido = salarioBruto - descontoINSS - convenio;
      return salarioLiquido;
      
  }
}

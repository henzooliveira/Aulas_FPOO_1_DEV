/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaestruturadecisao;

/**
 *
 * @author Aluno
 */
public class IfElse1 {
    public static void main(String[] args) {
        int temperatura = 30;
        
        if (temperatura ==15) {
            System.out.println("esta ficando frio");
        } else if (temperatura==20) {
            System.out.println("esta ficando agradavel");
        } else if (temperatura==30) {
            System.out.println("eita o nordeste chegou");
        }
        
        switch (temperatura) {
            case 15:
                System.out.println("esta ficando frio");
                break;
            case 20:
                System.out.println("esta ficando agradavel");
                break;
            case 30:
                System.out.println("eita o nordeste chegou");
                break;
                default:
                    throw new AssertionError();
                    
        }
    }
}

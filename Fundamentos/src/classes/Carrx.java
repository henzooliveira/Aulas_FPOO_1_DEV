/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carrx {
    public static void main(String[] args) {
        Carro Carro1 = new Carro("gsf", "ggf", CorEnum.ROXO, 1, true, 0, 0);
        Carro1.andar(10);
        System.out.println(Carro1);
    }
}

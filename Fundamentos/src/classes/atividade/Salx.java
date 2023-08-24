/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Salx {
    public static void main(String[] args) {
        Sala sala1 = new Sala(35, 35, 3, true, 35);
        System.out.println(sala1);
        sala1.estasendousada();
        System.out.println(sala1);
        sala1.naoesatsendousada();
    }
}

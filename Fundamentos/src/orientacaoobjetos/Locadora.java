/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Cliente c1 = new Cliente("kárlõs");
        System.out.println(c1);
        double valorlocacaoSimples = c1.calcularlocacao(3);
        System.out.println("0 valor para locação do filme simples é:" + valorlocacaoSimples);
        
        Cliente c2 = new Cliente("Ráfáellã", "jáóõ@gmail");
        System.out.println(c2);
        double valorlocacaoLancamento = c2.calcularlocacao(3, true);
        System.out.println("0 valor para locação do filme lançamento é:" + valorlocacaoLancamento);
    }
    
}

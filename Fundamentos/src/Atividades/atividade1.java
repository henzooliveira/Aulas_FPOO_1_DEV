package Atividades;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        double pi = Math.PI;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do raio:");
        double raio = scanner.nextDouble();
        
        double area_circulo = pi * raio * raio;
        
        System.out.println("A area do circulo é:" + area_circulo);
    }
}

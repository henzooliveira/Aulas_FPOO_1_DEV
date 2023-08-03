package Atividades;

    import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int limiteVelocidade = 80;
        final double valorMultaPorKm = 5.0;

        System.out.print("Digite a velocidade do carro (em km/h): ");
        double velocidadeCarro = scanner.nextDouble();

        if (velocidadeCarro > limiteVelocidade) {
            double kmAcimaLimite = velocidadeCarro - limiteVelocidade;
            double valorMulta = kmAcimaLimite * valorMultaPorKm;
            System.out.printf("isso não foi sugoi >:u! Valor da multa: R$ %.2f", valorMulta);
        } else {
            System.out.println("Velocidade esta dentro do limite.");
        }

        scanner.close();
    }
}
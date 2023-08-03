package Atividades;

public class CalculaMedia {
    public static void main(String[] args) {
        Aluno a1 = new Aluno( "moises", "naoseioque@gmail.com", 1234, 8, 9);
        
        double media = a1.CalcularMedia();
        System.out.println("A media é: " + media);
    }
}

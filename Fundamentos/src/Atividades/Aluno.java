package Atividades;

public class Aluno {
   private String nome;
   private String email;
   private int ra;
   private double nota1;
   private double nota2;
   private double media;

    public Aluno(String nome, String email, int ra, double nota1, double nota2) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
   
    public double CalcularMedia() {
        this.media = (this.nota1 + this.nota2);
        return this.media;
    }
}

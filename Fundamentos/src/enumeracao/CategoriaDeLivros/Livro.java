/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.CategoriaDeLivros;

/**
 *
 * @author Aluno
 */
public class Livro {
    private NomeLivro nomeLivro;

    @Override
    public String toString() {
        return "Livro{" + "nomeLivro=" + nomeLivro + '}';
    }

    public Livro(NomeLivro nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
}

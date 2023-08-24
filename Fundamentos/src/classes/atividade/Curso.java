/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nomeCurso;
    private String descricao;
    private EnumCategoria categoria;
    private boolean Temvagas;

    public Curso(String nomeCurso, String descricao, EnumCategoria categoria) {
        this.nomeCurso = nomeCurso;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Curso{" + "nomeCurso=" + nomeCurso + ", descricao=" + descricao + ", categoria=" + categoria + ", vagas=" + Temvagas + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum MarchaEnum {
    PRIMEIRA_MARCHA("primeira marcha", 1),
    SEGUNDA_MARCHA("segunda marcha", 2),
    TERCEIRA_MARCHA("terceira marcha", 3),
    QUARTA_MARCHA("quarta marcha",4),
    MARCHA_RE("marcha re", -1),
    NEUTRO("neutro", 0);
    
    private String marcha;
    private int numeroMarcha;

    private MarchaEnum(String marcha, int numeroMarcha) {
        this.marcha = marcha;
        this.numeroMarcha = numeroMarcha;
    }
    
    public String getMarcha(){
        return marcha;
    }
    public int getNumeroMarcha(){
        return numeroMarcha;
    }
}

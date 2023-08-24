/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum MemoriaEnum {
    MEMORIA1("4GB"),
    MEMORIA2("8GB"),
    MEMORIA3("12GB");
    
    private String memoria;
    
    private MemoriaEnum(String memoria){
        this.memoria = memoria;
    }
    private String getMemoria(){
        return memoria;
    }
}

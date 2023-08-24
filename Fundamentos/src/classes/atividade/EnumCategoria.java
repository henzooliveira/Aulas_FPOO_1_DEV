/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum EnumCategoria {
    ARTES_E_HUMANIDADES("Artes e Humanidades"),
    CIENCIAS_BIOLOGICAS("Ciencias Biologicas"),
    EDUCAÇÃO("Educação");
    
    private String categoria;
    
    private EnumCategoria( String categoria){
        this.categoria = categoria;
    }
    private String getCategoria(){
        return categoria;
    }
}

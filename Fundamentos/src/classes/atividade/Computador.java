/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Computador {
    private MemoriaEnum memoria;
    private ProcessadorEnum procssador;
    private double capacidadeDiscoRigido;
    private String sistemaOperacional;

    public Computador(MemoriaEnum memoria, ProcessadorEnum procssador, double capacidadeDiscoRigido, String sistemaOperacional) {
        this.memoria = memoria;
        this.procssador = procssador;
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", procssador=" + procssador + ", capacidadeDiscoRigido=" + capacidadeDiscoRigido + ", sistemaOperacional=" + sistemaOperacional + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSalas;
    private boolean temProjetor;
    private int numeroComputadores;
    private String situacao;

    public Sala(int numeroCadeiras, int numeroMesas, int numeroSalas, boolean temProjetor, int numeroComputadores) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSalas = numeroSalas;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
        this.situacao = situacao;
    }
    
    public void estasendousada(){
        this.situacao = "está sendo utilizada no momento :/";

    }
    public void naoesatsendousada(){
        this.situacao = "nao esta sendo utilizada no momento";
                                        
 }

    @Override
    public String toString() {
        return "Sala{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSalas=" + numeroSalas + ", temProjetor=" + temProjetor + ", numeroComputadores=" + numeroComputadores + ", situacao=" + situacao + '}';
    }
    
}

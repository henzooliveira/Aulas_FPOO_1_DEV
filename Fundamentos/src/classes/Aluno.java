/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String Nome;
    private String email;
    private int ra;
    private String situacao;

    public Aluno(String Nome, String email, int ra) {
        this.Nome = Nome;
        this.email = email;
        this.ra = ra;
        this.situacao = situacao;

    }
        public void fazendoprova(){
        this.situacao = "fazendo";

    }
    public void naoestafazendoprova(){
        this.situacao = "nao fez";
                                        
 }

    @Override
    public String toString() {
        return "Aluno{" + "Nome=" + Nome + ", email=" + email + ", ra=" + ra + ", situacao=" + situacao + '}';
    }
    
}

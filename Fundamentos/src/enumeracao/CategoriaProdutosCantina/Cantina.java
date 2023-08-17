/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.CategoriaProdutosCantina;

/**
 *
 * @author Aluno
 */
public class Cantina {
    private ProdutosCantina produtosCantina;
    private double valor;
    private int quantidade;
    
       public Cantina(ProdutosCantina produtosCantina, double valor, int quantidade) {
        this.produtosCantina = produtosCantina;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Cantina{" + "produtosCantina=" + produtosCantina + ", valor=" + valor + ", quantidade=" + quantidade + '}';
    }

 
}

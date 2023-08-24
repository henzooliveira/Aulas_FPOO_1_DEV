/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int rodas;
    private MarchaEnum marcha;
    private boolean estaEmRe;
    private String situacao;
    private int velocidade;

    public Carro(String modelo, String marca, CorEnum cor, MarchaEnum marcha , boolean estaEmRe, int ano, int rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.marcha = marcha;
        this.estaEmRe = estaEmRe;
        this.ano = ano;
        this.rodas = rodas;
        this.situacao = "parado";
        this.velocidade = 0;
    }
    public void trocarDeMarcha(MarchaEnum marcha){
        this.marcha.getNumeroMarcha();
    }
    public void engatarRe(boolean re){
        this.estaEmRe = re;
    }

    public Carro(String modelo, CorEnum cor) {
        this.modelo = modelo;
        this.cor = cor;
    }
    
     public void andar(int velocidade){
        this.situacao = "andando";
        this.velocidade = velocidade;
    }
    public void freiar(){
        this.situacao = "freiando";
        this.velocidade -= 1;                                            
 }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carros;

/**
 *
 * @author Pessoal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro();
        meuCarro.cor ="Azul";
        meuCarro.modelo = "fles";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 500;
        
        meuCarro.ligarMortor();
        meuCarro.acelera(20);
        System.out.println(meuCarro.velocidadeAtual);
        meuCarro.acelera(30);
        System.out.println(meuCarro.velocidadeAtual);
        meuCarro.acelera(200);
        System.out.println(meuCarro.velocidadeAtual);
    }
    
}

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
public class Carro {

    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;

    void ligarMortor() {
        System.out.println("Motor Lisgado");
    }

    void acelera(double quantidade) {
        double novaVelocidade = this.velocidadeAtual + quantidade;
        velocidadeAtual = novaVelocidade;
    }

    int passaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if(this.velocidadeAtual >= 40 && this.velocidadeAtual <80){
            return 2;
        }
        return 3;
    }
}

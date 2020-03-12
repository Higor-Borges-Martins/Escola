/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldswing;

/**
 *
 * @author Pessoal
 */
public class ExecicioOO {

    String titular;
    String agencia;
    int numero;
    double saldo;
    Data dataAbertura;

    public void saca(double quantia) {

        this.saldo -= quantia;
    }
//
    public void deposito(double quantia) {
       this.saldo += quantia;
    }
//
    public double calcularRendimento() {

        return this.saldo += (this.saldo * 0.1);
    }
    
    String recuperaDadosParaImpressao(){
        String dados = "Titular: "+ this.titular; 
        dados += "\nNúmero: "+ this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSalvdo: "+ this.saldo;
        dados += "\nData de apertura" + this.dataAbertura.formatada();
        return dados;
    }
}

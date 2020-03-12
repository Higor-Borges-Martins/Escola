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
public class ContaExecircio {

    String titula;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.err.println("Não é pocivel realizar esse saque!");
        }
    }

    void depositar(double valor) {
        this.saldo += valor;
    }
    
    double calculaRendimento(){
        this.saldo += (this.saldo * 0.1);
        return this.saldo;
    }
    
    String recuperarDadosParaImpressao(){
        String dados = "Titular: " + this.titula;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nNúmero: " + this.numero;
        dados += "\nData de Abertura: " + this.dataDeAbertura;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nRendimento Mensal: " + this.calculaRendimento();
       dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
        return dados;
        
    }

}

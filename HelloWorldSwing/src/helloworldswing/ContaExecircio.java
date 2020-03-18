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

    private String titula;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;
    private double limite = 50;

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public String getTitula() {
        return this.titula;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setData(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public Data getData() {
        return this.dataDeAbertura;
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    void sacar(double valor) {

        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.err.println("Não é pocivel realizar esse saque!");
        }
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }else{
            System.out.println("Valor invalido");
        }

    }

    double calculaRendimento() {
        this.saldo += (this.saldo * 0.1);
        return this.saldo;
    }

    String recuperarDadosParaImpressao() {
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

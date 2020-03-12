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
public class Conta {

    int numero;
    Cliente titula;
    double saldo;
    double limite;

    boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }

    void debosita(double quantidade) {
        this.saldo += quantidade;
    }
    
    boolean transferencia(Conta destino, double valor){
        
        if(!this.saca(valor)){
            System.out.println("Não foi possivel realisar a transação");
            return false;
        }else{
          destino.debosita(valor);
          return true;
        }
    } 

}

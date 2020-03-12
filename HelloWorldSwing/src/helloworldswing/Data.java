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
public class Data {

    int dia;
    int mes;
    int ano;

//    String formatada() {
//        String data = this.dia + "/" + this.mes + "/" + this.ano;
//        return data;
//    }
    
    String formatada(){
        String data = this.dia + "/" + this.mes + "/" + this.ano;
        return data;
    }
}

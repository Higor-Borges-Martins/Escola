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
public class CasaHy {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    
    public CasaHy(){
     porta1 = new Porta();
     porta2 = new Porta();
     porta3 = new Porta();
    }
    
    public void pintarCasa(String tinta){
        this.cor = tinta;
    }
    
    int quantasPotasEstaoAbertas(){
        int cont = 0;
        cont = (porta1.aberto)? cont+1 : cont;
        cont = (porta2.aberto)? cont+1 : cont;
        cont = (porta3.aberto)? cont+1 : cont;
        return cont;
    }
    
    String statusDaCasa(){
        String dados = "A cor da casa é " + this.cor + " ";
        dados += (this.porta1.aberto) ? "porta 1 esta Aberta, " : "porta 1 esta Fechada, ";
        dados += (this.porta2.aberto) ? "porta 2 esta Aberto, ": "porta 2 esta Fechado, ";
        dados += (this.porta3.aberto) ? "porta 3 esta Aberta, ": "porta 3 esta Fechada, ";
        return dados;
    }
}

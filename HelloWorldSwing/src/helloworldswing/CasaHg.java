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
public class CasaHg {

    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    public CasaHg() {
        porta1 = new Porta();
        porta2 = new Porta();
        porta3 = new Porta();
    }

    public void pintarCasa(String tinta) {
        this.cor = tinta;
    }

    public int quantasPortasEstaoApertas() {
        int close = 0;

        close = (porta1.aberto) ? close + 1 : close;
        close = (porta2.aberto) ? close + 1 : close;
        close = (porta3.aberto) ? close + 1 : close;
        return close;

    }
    public String statusCasa(){
        String dados;
        dados = "Cor da casa " +this.cor;
        dados += (porta1.aberto) ? "Porta1 aberta, " : "Porta1 fechada";
        dados += (porta2.aberto) ? "Porta1 aberta, " : "Porta2 fechada";
        dados += (porta3.aberto) ? "Porta3 aberta, " : "Porta3 fechada";
        return dados;
    }
}

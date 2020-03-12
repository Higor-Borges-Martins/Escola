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
public class Porta {

    boolean aberto;
    String cor;
    int dimencaoX;
    int dimencaoY;
    int dimencaoZ;

    void abrir() {
        this.aberto = true;
    }

    void fechar() {
        this.aberto = false;
    }

    void pintaPorta(String s) {
        this.cor = s;
    }

    void estaAberta(){
        if(this.aberto){
            System.out.println("Porta aberta");
        }else{
            System.out.println("Porta Fechada");
        }
    }
    
    String valores(){
        String dados;
        if(this.aberto){
            dados = "\nPorta Aberta";
        }else{
            dados = "\nPorta Fechada";
        }
        
        dados += "\nCor: " + this.cor;
        dados += "\nLargura: " + this.dimencaoX;
        dados += "\nAltura: " + this.dimencaoY;
        dados += "\nEspesura: " + this.dimencaoZ;
        return dados;
    }
}

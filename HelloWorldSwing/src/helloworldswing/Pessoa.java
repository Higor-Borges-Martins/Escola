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
public class Pessoa {
    
    String nome;
   int idade;
   
   public void fazAniversario(){
       idade += 1;
       
       System.out.println("Parabéns: " + this.nome + " de " + this.idade);
   }
    
}

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
public class FibonacciHy {

    int aux = 0;

    int calcularFibonacci(int i) {
        System.out.println(i);
        if (i < 10) {
            i = this.aux + i;
            this.aux = i - this.aux;
            calcularFibonacci(i);
        }

        return i;

    }

}

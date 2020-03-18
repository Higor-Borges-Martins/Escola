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

    private String nome;
    private String cpf;
    private int idade;

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void fazAniversario() {
        idade += 1;

        System.out.println("Parabéns: " + this.nome + " de " + this.idade);
    }

    public void mudarCPF(String cpf) {

        if (this.idade < 60) {
            System.out.println(" De preferencia aos idosos");

        } else {
            if (validarCPF(cpf)) {
                this.cpf = cpf;
            } else {
                System.err.println("CPF invalido");
            }
        }
    }

    private boolean validarCPF(String cpf) {

        char numero[] = cpf.toCharArray();
        if (cpf.length() != 11) {
            return false;
        } else {
            for (int i = 0; i < numero.length; i++) {
                if (!Character.isDigit(numero[i])) {
                    return false;
                }
            }

        }
        return true;
    }
}

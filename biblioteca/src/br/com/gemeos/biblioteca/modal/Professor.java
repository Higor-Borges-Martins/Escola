/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.biblioteca.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Pessoal
 */
@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Professor extends Pessoa{

    @Column(length = 7)
    private double salario;

    public Professor() {
        super();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " Professor{" + super.toString() + "salario=" + salario + '}';
    }
}


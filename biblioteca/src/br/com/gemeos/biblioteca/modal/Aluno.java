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
public class Aluno extends Pessoa{

    public Aluno() {
        super();
    }
    
    @Column(length = 100, nullable = true)
    private long matricula;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + '}' + super.toString();
    }

}
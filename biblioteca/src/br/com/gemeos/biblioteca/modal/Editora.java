/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.biblioteca.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Pessoal
 */
@Entity
public class Editora {

    @Id
    @GeneratedValue
    private long idEditora;
    @Column (length = 20, nullable = true)
    private String nomeEditora;
    @OneToOne(cascade =CascadeType.ALL)
    private Endereco endereco;

    public long getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(long idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Editora{" + "idEditora=" + idEditora + ", nomeEditora=" + nomeEditora + ", endereco=" + endereco + '}';
    }
}



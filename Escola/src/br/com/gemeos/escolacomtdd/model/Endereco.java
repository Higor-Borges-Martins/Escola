package br.com.gemeos.escolacomtdd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pessoal
 */
@Entity
public class Endereco {
    
    @Id
    @GeneratedValue
    private long idEndereco;
    @Column(length = 100, nullable = true)
    private String rua;
    @Column(length = 100, nullable = true)
    private String bairro;
    @Column(length = 100, nullable = true)
    private String numero;
    @Column(length = 100, nullable = true)
    private String cidade;
    @Column(length = 100, nullable = true)
    private String uf;
    @Column(length = 100, nullable = true)
    private String cep;

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }

    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + '}';
    }
}

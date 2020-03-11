/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Pessoal
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable{

    @Id
    @GeneratedValue
    private long idPessoa;
    @Column(length = 100, nullable = true)
    private String nome;
    @Column(length = 20, nullable = true)
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;
    @Column(length = 20, nullable = true)
    private String telefone;
    @Column(length = 100, nullable = false)
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emal) {
        this.email = emal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
        final Pessoa other = (Pessoa) obj;
        if (this.idPessoa != other.idPessoa) {
            return false;
        }
        return true;
    }


    
    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nome=" + nome
                + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento
                + ", telefone=" + telefone + ", emal=" + email
                + ", endereco=" + endereco + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Pessoal
 */
@Entity
public class Autor {

    @Id
    @GeneratedValue
    private long idAutor;
    @Column(length = 20, nullable = true)
    private String nomeAutor;
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;
    @Temporal(TemporalType.DATE)
    private Date dtMorte;
    @Column(length = 30, nullable = true)
    private String nacionalidade;
    @Column(length = 30, nullable = true)
    private String generoLiterario;

    public long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(long idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Date getDtMorte() {
        return dtMorte;
    }

    public void setDtMorte(Date dtMorte) {
        this.dtMorte = dtMorte;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getGeneroLiterari() {
        return generoLiterario;
    }

    public void setGeneroLiterari(String generoLiterari) {
        this.generoLiterario = generoLiterari;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nomeAutor=" + nomeAutor + ", dtNascimento=" + dtNascimento + ", dtMorte=" + dtMorte + ", nacionalidade=" + nacionalidade + ", generoLiterari=" + generoLiterario + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.biblioteca.modal;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Pessoal
 */
@Entity
public class Livro {

    @Id
    @GeneratedValue
    private long idLivro;
    @Column(length = 100, nullable = true)
    private String titulo;
    @ManyToOne
    @JoinColumn (name = "autor")
    private Autor autor;
    @Temporal(TemporalType.DATE)
    private Date anoDePublicacao;
    @ManyToOne
    @JoinColumn (name = "editora")
    private Editora editora;
    @Column(length = 3, nullable = false)
    private String numeroDeEdicao;
    @Column(length = 3, nullable = true)
    private double Copias;

    public long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(long idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

   

    public Date getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(Date anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getNumeroDeEdicao() {
        return numeroDeEdicao;
    }

    public void setNumeroDeEdicao(String numeroDeEdicao) {
        this.numeroDeEdicao = numeroDeEdicao;
    }

    public double getCopias() {
        return Copias;
    }

    public void setCopias(double Copias) {
        this.Copias = Copias;
    }

    @Override
    public String toString() {
        return "Livro{ " + "idLivro= " + idLivro + ", titulo= " + titulo + ", autor= " + autor.getNomeAutor() + ", anoDePublicacao= " + anoDePublicacao + ", editora= " + editora.getNomeEditora()+ ", numeroDeEdicao= " + numeroDeEdicao + ", numero De Copias Disponiveis para Aluguel= " + Copias + '}';
    }

}


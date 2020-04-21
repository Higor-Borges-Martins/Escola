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
import javax.persistence.Temporal;
import javax.persistence.OneToOne;
import javax.persistence.TemporalType;

/**
 *
 * @author Pessoal
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Aluguel implements Serializable{

    @Id
    @GeneratedValue
    private long registro;
    @OneToOne(cascade = CascadeType.ALL)
    private Livro livro;
    @Column(length = 50, nullable = true)
    private String nomeIndividuo;
    @Temporal(TemporalType.DATE)
    private Date diaDoAluguel;

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getNomeIndividuo() {
        return nomeIndividuo;
    }

    public void setNomeIndividuo(String nomeIndividuo) {
        this.nomeIndividuo = nomeIndividuo;
    }

    public Date getDiaDoAluguel() {
        return diaDoAluguel;
    }

    public void setDiaDoAluguel(Date diaDoAluguel) {
        this.diaDoAluguel = diaDoAluguel;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "registro=" + registro + ", livro=" + livro + ", nomeIndividuo=" + nomeIndividuo + ", diaDoAluguel=" + diaDoAluguel + '}';
    }

}

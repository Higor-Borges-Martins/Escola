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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Pessoal
 */
@Entity
public class Aluguel {
    @Id
    @GeneratedValue
    private long registro;
    @Column(length = 50,nullable = true)
    private String tituloLivro;
    @Column(length = 40, nullable = true)
    private String nomeIndividuo;
    @Temporal(TemporalType.DATE)
    private Date diaDoAluguel;

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
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
        return "Aluguel{" + "registro=" + registro + ", tituloLivro=" + tituloLivro + ", nomeIndividuo=" + nomeIndividuo + ", diaDoAluguel=" + diaDoAluguel + '}';
    }
    
    
}

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
import javax.persistence.OneToOne;
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
    @OneToOne
    @JoinColumn(name = "idLivro")
    private Livro idLivro;
    @OneToOne
    @JoinColumn(name = "idPessoa")
   private Pessoa idPessoa;
    @Temporal(TemporalType.DATE)
    private Date diaDoAluguel;
    @Column(length = 10, nullable = true)
    private boolean status;

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    public Livro getLivro() {
        return this.idLivro;
    }

    public void setLivro(Livro Livro) {
        this.idLivro = Livro;
    }

    public Pessoa getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Date getDiaDoAluguel() {
        return diaDoAluguel;
    }

    public void setDiaDoAluguel(Date diaDoAluguel) {
        this.diaDoAluguel = diaDoAluguel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (status == true) {

            return "Status: Pendente," + " Aluguel{ " + "registro=" + registro + ", tituloLivro=" + idLivro.getTitulo() + ", Alugado por =" + idPessoa.getNome() + ", diaDoAluguel=" + diaDoAluguel + '}';
        } else {
            return "Status: Devolvido," +" Aluguel{ " + "registro=" + registro + ",  tituloLivro=" + idLivro.getTitulo() +", Alugado por =" + idPessoa.getNome() + ", diaDoAluguel="  + diaDoAluguel + '}';
        }
    }

}

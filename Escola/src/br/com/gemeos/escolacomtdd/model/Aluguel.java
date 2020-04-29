/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.model;

import java.util.Date;
import javax.persistence.CascadeType;
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
    private Livro Livro;
    @OneToOne
    @JoinColumn(name = "idAluno", referencedColumnName = "idPessoa")
    private Aluno idAluno;
    @OneToOne
    @JoinColumn(name = "idProfessor", referencedColumnName = "idPessoa")
    private Professor idProfessor;
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
        return Livro;
    }

    public void setLivro(Livro Livro) {
        this.Livro = Livro;
    }

    public Aluno getNomeDoAluno() {
        return idAluno;
    }

    public void setNomeDoAluno(Aluno nomeDoAluno) {
        this.idAluno = nomeDoAluno;
    }

    public Professor getNomeDoProfessor() {
        return idProfessor;
    }

    public void setNomeDoProfessor(Professor nomeDoProfessor) {
        this.idProfessor = nomeDoProfessor;
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

            return "Status: Pendente," + " Aluguel{" + "registro=" + registro + ", tituloLivro=" + Livro.getTitulo() + ", nome do aluno=" +idAluno.getNome() + ", nome do professor=" + idProfessor.getNome() + ", diaDoAluguel=" + diaDoAluguel + '}';
        } else {
            return "Status: Devolvido," +" Aluguel{" + "registro=" + registro + ",  tituloLivro=" + Livro.getTitulo() + ", nome do aluno=" + idAluno.getNome() +  ", nome do professor=" + idProfessor.getNome() +", diaDoAluguel="  + diaDoAluguel + '}';
        }
    }

}

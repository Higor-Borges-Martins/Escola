/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.facade;

import br.com.gemeos.escolacomtdd.dao.AlunoDao;
import br.com.gemeos.escolacomtdd.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class FacadeAluno {

   private AlunoDao adao = new AlunoDao();

    public void cadastrarAluno(Aluno aluno) {
        adao.cadastrarAluno(aluno);
    }

    public Aluno buscarAluno(String string) throws Exception {

        return adao.buscarAluno(string);
    }

    public void removerAluno(Aluno buscarAluno) throws Exception {

        adao.removerAluno(buscarAluno);
    }

    public List<Aluno> listarAlunos() throws Exception {

        return adao.listarAlunos();
    }

    public void editarAluno(Aluno aluno) throws Exception {

        adao.editarAluno(aluno);
    }
    
    public long gerarMatricula() throws Exception{
        
        return adao.gerarMatricula();
    }

}

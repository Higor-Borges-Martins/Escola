/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.facade;

import br.com.gemeos.escolacomtdd.dao.ProfessorDao;
import br.com.gemeos.escolacomtdd.model.Professor;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class FacadeProfessor {
    
    private ProfessorDao pdao = new ProfessorDao();
    
    public void facadeCadastrarProfessor(Professor prof){
        
        pdao.cadastrarProfessor(prof);
    }
    public List<Professor> facadeListarProfessor() throws Exception{
      return pdao.listarProfessor();
        
    }
    public Professor facadeBuscarProfessor(String cpf) throws Exception{
      return pdao.buscarProfessor(cpf);
    }
    public void facadeEditarProfessor(Professor prof) throws Exception{
       pdao.editarProfessor(prof);
        
    }
    public void facadeRemoverProfessor(Professor prof) throws Exception{
        pdao.removerProfessor(prof);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.facade;

import br.com.gemeos.escolacomtdd.dao.LivroDao;
import br.com.gemeos.escolacomtdd.model.Livro;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class FacadeLivro {
    
    LivroDao ldao = new LivroDao();
    
    public void facadeCadastrarLivro(Livro l){
        
        ldao.salvarLivro(l);
    }
    public List<Livro> facadeListaLivro() throws Exception{
        
       return ldao.listarLivro();
    }
    public Livro facadeBuscarLivro(String titulo) throws Exception{
        
        return ldao.buscarLivro(titulo);
    }
    public void facadeAtualizarLivro(Livro l) throws Exception{
        
        ldao.atualisarQuantidadeLivro(l);
    }
    public void facadeRemoverLivro(Livro l) throws Exception{
        
        ldao.removerLivro(l);
    }
    
    
    
}

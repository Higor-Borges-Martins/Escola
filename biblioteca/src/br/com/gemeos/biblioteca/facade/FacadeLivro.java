/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.biblioteca.facade;

import br.com.gemeos.biblioteca.dao.AutorDao;
import br.com.gemeos.biblioteca.dao.EditoraDao;
import br.com.gemeos.biblioteca.dao.LivroDao;
import br.com.gemeos.biblioteca.modal.Autor;
import br.com.gemeos.biblioteca.modal.Editora;
import br.com.gemeos.biblioteca.modal.Livro;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class FacadeLivro {

    LivroDao ldao = new LivroDao();
    AutorDao daoAutor = new AutorDao();
    EditoraDao daoEdit = new EditoraDao();

    public void facadeCadastrarLivro(Livro l) {

        ldao.salvarLivro(l);
    }

    public List<Livro> facadeListaLivro() throws Exception {

        return ldao.listarLivro();
    }

    public Livro facadeBuscarLivro(String titulo) throws Exception {

        return ldao.buscarLivro(titulo);
    }

    public void facadeAtualizarLivro(Livro l) throws Exception {

        ldao.atualisarQuantidadeLivro(l);
    }

    public void facadeRemoverLivro(Livro l) throws Exception {

        ldao.removerLivro(l);
    }

    public void facadeCadastrarAutor(Autor autor) {
        daoAutor.cadastrarAutor(autor);
    }

    public Autor facadeBuscarAutor(String nomeAutor) throws Exception {
        return daoAutor.buscarAutor(nomeAutor);
    }

    public void facadeCadastrarEditora(Editora editora) {
        daoEdit.cadastrarEditora(editora);
    }

    public Editora facadeBuscarEditora(String nomeEditora) throws Exception {
        return daoEdit.buscarEditora(nomeEditora);
    }
}


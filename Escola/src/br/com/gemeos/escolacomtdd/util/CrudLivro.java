/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.util;

import br.com.gemeos.escolacomtdd.facade.FacadeLivro;
import br.com.gemeos.escolacomtdd.model.Autor;
import br.com.gemeos.escolacomtdd.model.Editora;
import br.com.gemeos.escolacomtdd.model.Livro;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 *
 * @author Pessoal
 */
public class CrudLivro {

    private BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    private String resposta = new String();
    private Livro livro = new Livro();
    private Autor autor = new Autor();
    private Editora editora = new Editora();
    private FacadeLivro fldao = new FacadeLivro();
    private Conversor conversor = new Conversor();
    private MetodosDeAutorEditora metodos = new MetodosDeAutorEditora();

    public void livroEmExecução() throws IOException, ParseException, Exception {

        System.out.println("-----MENU DE LIVRO-----");
        System.out.println("1 - NOVO LIVRO");
        System.out.println("2 - LISTAR LIVROS");
        System.out.println("3 - ATUALIZAR QUANTIDADE DE COPIAS DE UM LIVRO");
        System.out.println("4 - REMOVER LIVRO");
        System.out.println("5 - BUSCAR LIVRO");
        resposta = read.readLine();

        switch (resposta) {
            case "1":
              
                 try{
                     System.out.println("Titulo do Livro");
                     livro.setTitulo(read.readLine());
                     System.out.println("Nome do Autor");
                     autor = fldao.facadeBuscarAutor(read.readLine());
                     if (autor != null) {
                         livro.setAutor(autor);
                     } else {
                         System.out.println("Autor não encontrado. \n Por favor cadastre o autor no banco de dados");
                         metodos.CadastrarAutor();
                         break;
                     }
                     System.out.println("Ano de Publicação");
                     livro.setAnoDePublicacao(conversor.stringParaData(read.readLine()));
                     System.out.println("Editora");
                     editora = fldao.facadeBuscarEditora(read.readLine());
                     if (editora != null) {
                         livro.setEditora(editora);
                     } else {
                         System.out.println("Editora não encontrado.\n Por favor cadastre a Editora no banco de dados");
                         metodos.CadastrarEditora();
                         break;
                     }
                     System.out.println("Edição");
                     livro.setNumeroDeEdicao(read.readLine());
                     System.out.println("Informe o número de copias");
                     livro.setCopias(conversor.StringParaDouble(read.readLine()));
                     fldao.facadeCadastrarLivro(livro);
                }catch(Exception e){
                    System.err.println("Falha ao realizar a operação");
                }
                break;

            case "2":
                try {
                    for (Livro perc : fldao.facadeListaLivro()) {
                        System.out.println(perc);
                    }
                } catch (Exception e) {
                    System.err.println("Falha ao realizar a operação");
                }
                break;

            case "3":
                try {
                    System.out.println("Informe o titulo do livro");
                    livro = fldao.facadeBuscarLivro(read.readLine());
                   if(livro != null){
                       System.out.println("Quantos livros");
                    livro.setCopias(livro.getCopias() + conversor.StringParaDouble(read.readLine()));
                    fldao.facadeAtualizarLivro(livro);
                   }else{
                       System.out.println("Livro não encontrado");
                   }
                    
                } catch (Exception e) {
                    System.err.println("Falha ao realizar a operação");
                }
                break;

            case "4":
                try {
                    System.out.println("Informe o titulo do livro a ser removido");
                    livro = fldao.facadeBuscarLivro(read.readLine());
                    fldao.facadeRemoverLivro(livro);
                } catch (Exception e) {
                    System.err.println("Falha ao realizar a operação");
                }
                break;

            case "5":
                try {
                    System.out.println("Titulo do livro");
                    System.out.println(fldao.facadeBuscarLivro(read.readLine()));
                } catch (Exception e) {
                    System.err.println("Falha ao realizar a operação");
                }
                break;

            default:
                System.out.println("Opção Invalida");
                break;
        }
    }
}

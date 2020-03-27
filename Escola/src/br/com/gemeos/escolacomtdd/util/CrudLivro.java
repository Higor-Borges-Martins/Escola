/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.util;

import br.com.gemeos.escolacomtdd.facade.FacadeLivro;
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
    private FacadeLivro fldao = new FacadeLivro();
    private Conversor conversor = new Conversor();

    public void livroEmExecução() throws IOException, ParseException, Exception {

        System.out.println("-----MENU DE LIVRO-----");
        System.out.println("1 - Novo Livro");
        System.out.println("2 - Listar Livros");
        System.out.println("3 - Atualizar Quantidade de Livros");
        System.out.println("4 - Remover Livro");
        System.out.println("5 - Buscar Livro");
        resposta = read.readLine();

        switch (resposta) {
            case "1":

                System.out.println("Titulo do Livro");
                livro.setTitulo(read.readLine());
                System.out.println("Nome do Autor");
                livro.setAutor(read.readLine());
                System.out.println("Ano de Publicação");
                livro.setAnoDePublicacao(conversor.stringParaData(read.readLine()));
                System.out.println("Editora");
                livro.setEditora(read.readLine());
                System.out.println("Edição");
                livro.setNumeroDeEdicao(read.readLine());
                System.out.println("Informe o número de copias");
                livro.setCopias(conversor.StringParaDouble(read.readLine()));
                fldao.facadeCadastrarLivro(livro);

                break;
            case "2":
                for (Livro perc : fldao.facadeListaLivro()) {
                    System.out.println(perc);
                }
                ;
                break;
            case "3":
                System.out.println("Informe o titulo do livro");
                livro = fldao.facadeBuscarLivro(read.readLine());
                System.out.println("Quantos livros");
                livro.setCopias(livro.getCopias() + conversor.StringParaDouble(read.readLine()));
                fldao.facadeAtualizarLivro(livro);
                break;
            case "4":
                System.out.println("Informe o titulo do livro a ser removido");
                livro = fldao.facadeBuscarLivro(read.readLine());
                fldao.facadeRemoverLivro(livro);
                break;
            case "5":
                System.out.println("Titulo do livro");
                System.out.println(fldao.facadeBuscarLivro(read.readLine()));
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
    }
}

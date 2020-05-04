/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.util;

import br.com.gemeos.escolacomtdd.facade.FacadeLivro;
import br.com.gemeos.escolacomtdd.model.Autor;
import br.com.gemeos.escolacomtdd.model.Editora;
import br.com.gemeos.escolacomtdd.model.Endereco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 *
 * @author Pessoal
 */
public class MetodosDeAutorEditora {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    private Autor autor = new Autor();
    private Editora editora = new Editora();
    private Conversor conversor = new Conversor();
    private FacadeLivro fldao = new FacadeLivro();
    private Endereco endereco = new Endereco();

    public void CadastrarAutor() throws ParseException, IOException {
        try {
            System.out.println("Nome do Autor");
            autor.setNomeAutor(read.readLine());
            System.out.println("Data de Nascimento");
            autor.setDtNascimento(conversor.stringParaData(read.readLine()));
            System.out.println("Data de Falecimento");
            autor.setDtMorte(conversor.stringParaData(read.readLine()));
            System.out.println("Nacionalidade");
            autor.setNacionalidade(read.readLine());
            System.out.println("Generos Literarios");
            autor.setGeneroLiterari(read.readLine());
            fldao.facadeCadastrarAutor(autor);
        } catch (Exception e) {
            System.err.println("Falha ao realizar a operação");
        }

    }

    public void BucarAutor() throws Exception {
        try {
            System.out.println("Nome do Autor");
            System.out.println(fldao.facadeBuscarAutor(read.readLine()));
        } catch (Exception e) {
            System.err.println("Falha ao realizar a operação");
        }
    }

    public void CadastrarEditora() throws IOException {
        try {
            System.out.println("Nome da Editora");
            editora.setNomeEditora(read.readLine());
            System.out.println("Rua ");
            endereco.setRua(read.readLine());
            System.out.println("Bairro");
            endereco.setBairro(read.readLine());
            System.out.println("Numero");
            endereco.setNumero(read.readLine());
            System.out.println("Cidade");
            endereco.setCidade(read.readLine());
            System.out.println("UF");
            endereco.setUf(read.readLine());
            System.out.println("Cep");
            endereco.setCep(read.readLine());
            editora.setEndereco(endereco);
            fldao.facadeCadastrarEditora(editora);
        } catch (Exception e) {
            System.err.println("Falha ao realizar a operação");
        }

    }

    public void testBuscarEditora() throws Exception {
        try {
            System.out.println("Nome Da Editora");
            System.out.println(fldao.facadeBuscarEditora(read.readLine()));
        } catch (Exception e) {
            System.err.println("Falha ao realizar a operação");
        }
    }
}

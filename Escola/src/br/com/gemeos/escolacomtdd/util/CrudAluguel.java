/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.util;

import br.com.gemeos.escolacomtdd.facade.FacadeAluguel;
import br.com.gemeos.escolacomtdd.facade.FacadeAluno;
import br.com.gemeos.escolacomtdd.facade.FacadeLivro;
import br.com.gemeos.escolacomtdd.facade.FacadeProfessor;
import br.com.gemeos.escolacomtdd.model.Aluguel;
import br.com.gemeos.escolacomtdd.model.Aluno;
import br.com.gemeos.escolacomtdd.model.Livro;
import br.com.gemeos.escolacomtdd.model.Professor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Pessoal
 */
public class CrudAluguel {

    private BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    private String resposta = new String();
    private Aluno aluno = new Aluno();
    private Professor prof = new Professor();
    private Livro livro = new Livro();
    private Aluguel alugar = new Aluguel();
    private FacadeAluno fadao = new FacadeAluno();
    private FacadeProfessor fpdao = new FacadeProfessor();
    private FacadeLivro fldao = new FacadeLivro();
    private FacadeAluguel facadeAlugar = new FacadeAluguel();
    private Conversor conversor = new Conversor();

    public void AluguelEmExecução() throws IOException, Exception {

        System.out.println("-----MENU DE ALUGUEL-----");
        System.out.println("1 - ALUGAR LIVRO");
        System.out.println("2 - ALUGUES PENDENTES");
        System.out.println("3 - DEVOLVER LIVRO");
        resposta = read.readLine();

        switch (resposta) {
            case "1":
                System.out.println(" Aluno: 1 \n Professor: 2");
                resposta = read.readLine();
                if (resposta.equals("1")) {
                    System.out.println("Informe CPF");
                    aluno = fadao.buscarAluno(read.readLine());
                    System.out.println(aluno);
                    alugar.setNomeIndividuo(aluno.getNome());
                    System.out.println("Titulo do Livro");
                    alugar.setTituloLivro(read.readLine());
                    livro = fldao.facadeBuscarLivro(alugar.getTituloLivro());
                    if (livro.getCopias() != 0) {
                        livro.setCopias(livro.getCopias() - 1);
                        fldao.facadeAtualizarLivro(livro);
                        System.out.println("Data em que o aluguel foi efetuado");
                        alugar.setDiaDoAluguel(conversor.stringParaData(read.readLine()));
                        facadeAlugar.facadeAlugarLivro(alugar);
                    } else {
                        System.out.println("Livro Indisponivel no momento");
                    }

                } else {
                    System.out.println("Informe CPF");
                    prof = fpdao.facadeBuscarProfessor(read.readLine());
                    System.out.println(prof);
                    alugar.setNomeIndividuo(prof.getNome());
                    System.out.println("Titulo do Livro");
                    alugar.setTituloLivro(read.readLine());
                    livro = fldao.facadeBuscarLivro(alugar.getTituloLivro());
                    if (livro.getCopias() != 0) {
                        livro.setCopias(livro.getCopias() - 1);
                        fldao.facadeAtualizarLivro(livro);
                        System.out.println("Data em que o aluguel foi efetuado");
                        alugar.setDiaDoAluguel(conversor.stringParaData(read.readLine()));
                        facadeAlugar.facadeAlugarLivro(alugar);
                    } else {
                        System.out.println("Livro Indisponivel no momento");
                    }
                }

                break;

            case "2":
                for (Aluguel perc : facadeAlugar.facadeListarAluguel()) {
                    System.out.println(perc);
                }
                break;

            case "3":
                System.out.println("Informe o registro do aluguel");
                System.out.println(alugar = facadeAlugar.facadePesquisarAluguel(conversor.StringParaLong(read.readLine())));
                livro = fldao.facadeBuscarLivro(alugar.getTituloLivro());
                livro.setCopias(livro.getCopias() + 1);
                fldao.facadeAtualizarLivro(livro);
                facadeAlugar.facadeDevolverLivro(alugar);
                break;

            default:
                System.out.println("Opção invalida");
                break;

        }
    }
}

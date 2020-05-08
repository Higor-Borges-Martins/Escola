/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.biblioteca.main;

import br.com.gemeos.biblioteca.util.CrudAluguel;
import br.com.gemeos.biblioteca.util.CrudAluno;
import br.com.gemeos.biblioteca.util.CrudLivro;
import br.com.gemeos.biblioteca.util.CrudProfessor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 *
 * @author Pessoal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException, Exception {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        CrudAluno aluno = new CrudAluno();
        CrudProfessor prof = new CrudProfessor();
        CrudLivro livro = new CrudLivro();
        CrudAluguel aluguel = new CrudAluguel();
        String resposta = new String();
       
        while (!resposta.equals("0")) {
            System.out.println("----- MENU -----");
            System.out.println("1 - ALUNO");
            System.out.println("2 - PROFESSOR");
            System.out.println("3 - LIVRO");
            System.out.println("4 - ALUGUEL");
            System.out.println("0 - SAIR");
            resposta = read.readLine();

            switch (resposta) {
                case "1":
                    aluno.alunoEmExecucao();
                    break;
                case "2":
                    prof.professorEmExecucao();
                    break;
                case "3":
                    livro.livroEmExecução();
                    break;
                case "4":
                    aluguel.AluguelEmExecução();
                    break;
                case "0":
                    System.out.println("Fechando o sistema");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opção Invalida");
            }
        }
    }
}

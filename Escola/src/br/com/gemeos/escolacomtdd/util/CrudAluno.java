/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.util;

import br.com.gemeos.escolacomtdd.facade.FacadeAluno;
import br.com.gemeos.escolacomtdd.model.Aluno;
import br.com.gemeos.escolacomtdd.model.Endereco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class CrudAluno {

    private BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    private Aluno aluno = new Aluno();
    private List<Aluno> alunos = null;
    private Endereco endereco = new Endereco();
    private FacadeAluno fadao = new FacadeAluno();
    private Conversor conversor = new Conversor();
    private String resposta = new String();

    public void alunoEmExecucao() throws IOException, ParseException, Exception {

        System.out.println("-----MENU DE ALUNO-----");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - EDITAR");
        System.out.println("3 - EXCLUIR");
        System.out.println("4 - LISTAR");
        System.out.println("5 - BUSCAR POR CPF");
        resposta = read.readLine();

        switch (resposta) {

            case "1":
                try {
                    aluno.setMatricula(fadao.gerarMatricula());
                    System.out.println("Nome do Aluno");
                    aluno.setNome(read.readLine());

                    System.out.println("cpf do Aluno");
                    aluno.setCpf(read.readLine());

                    System.out.println("Data  de Nascimento");
                    aluno.setDataDeNascimento(conversor.stringParaData(read.readLine()));

                    System.out.println("Número do telefone");
                    aluno.setTelefone(read.readLine());

                    System.out.println("Email do Aluno");
                    aluno.setEmail(read.readLine());

                    System.out.println("Rua do Aluno");
                    endereco.setRua(read.readLine());

                    System.out.println("Bairro do Aluno");
                    endereco.setBairro(read.readLine());

                    System.out.println("Numero da casa");
                    endereco.setNumero(read.readLine());

                    System.out.println("Cidade do Aluno");
                    endereco.setCidade(read.readLine());

                    System.out.println("UF do Aluno");
                    endereco.setUf(read.readLine());

                    System.out.println("Cep do Aluno");
                    endereco.setCep(read.readLine());

                    aluno.setEndereco(endereco);

                    fadao.cadastrarAluno(aluno);
                } catch (Exception e) {
                    System.out.println("Falha ao realizar a operação");
                }
                break;

            case "2":
                try {

                    System.out.println("cpf do Aluno");
                    aluno = fadao.buscarAluno(read.readLine());

                    System.out.println("-----MENU DE EDIÇÃO-----");
                    System.out.println("1 - NOME");
                    System.out.println("2 - TELEFONE");
                    System.out.println("3 - EMAIL");
                    System.out.println("4 - RUA");
                    System.out.println("5 - BAIRRO");
                    System.out.println("6 - NUMERO DA CASA");
                    System.out.println("7 - ENDEREÇO");
                    resposta = read.readLine();

                    switch (resposta) {

                        case "1":
                            System.out.println("Novo nome do Aluno");
                            aluno.setNome(read.readLine());
                            fadao.editarAluno(aluno);

                            break;

                        case "2":
                            System.out.println("Novo Numero Telefonico do Aluno");
                            aluno.setTelefone(read.readLine());
                            fadao.editarAluno(aluno);
                            break;

                        case "3":
                            System.out.println("Novo Endereço de Email do Aluno");
                            aluno.setEmail(read.readLine());
                            fadao.editarAluno(aluno);
                            break;

                        case "4":
                            System.out.println("Nova Rua do Aluno");
                            aluno.getEndereco().setRua(read.readLine());
                            fadao.editarAluno(aluno);
                            break;

                        case "5":
                            System.out.println("Novo Bairro do Aluno");
                            aluno.getEndereco().setBairro(read.readLine());
                            fadao.editarAluno(aluno);
                            break;

                        case "6":
                            System.out.println("Nova Numero da casa");
                            aluno.getEndereco().setNumero(read.readLine());
                            fadao.editarAluno(aluno);
                            break;

                        case "7":
                            System.out.println("Informe os dados do Novo Endereço do Aluno");
                            System.out.println("Nova rua do Aluno");
                            endereco.setRua(read.readLine());
                            System.out.println("Novo Bairro do Aluno");
                            endereco.setBairro(read.readLine());
                            System.out.println("Novo Numero da Casa");
                            endereco.setNumero(read.readLine());
                            System.out.println("Nova Cidade do Aluno");
                            endereco.setCidade(read.readLine());
                            System.out.println("Novo UF");
                            endereco.setUf(read.readLine());
                            System.out.println("Novo CEP do Aluno");
                            endereco.setCep(read.readLine());
                            aluno.setEndereco(endereco);
                            fadao.editarAluno(aluno);
                            break;

                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Falha ao realizar a operação");
                }
                break;

            case "3":
                try {
                    System.out.println("cpf do Aluno");
                    fadao.removerAluno(fadao.buscarAluno(read.readLine()));
                } catch (Exception e) {
                    System.out.println("Falha ao realizar a operação");
                }
                break;

            case "4":
                try {
                    alunos = fadao.listarAlunos();
                    for (Aluno perc : alunos) {
                        System.out.println(perc);
                    }
                } catch (Exception e) {
                    System.out.println("Falha ao realizar a operação");
                }
                break;

            case "5":
                try {
                    System.out.println("cpf do Aluno");
                    System.out.println(fadao.buscarAluno(read.readLine()));
                } catch (Exception e) {
                    System.out.println("Falha ao realizar a operação");
                }
                break;

            default:
                System.out.println("Opção Invalida");
                break;
        }
    }
}

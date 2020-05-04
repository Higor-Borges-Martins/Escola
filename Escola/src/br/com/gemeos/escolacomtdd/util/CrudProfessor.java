/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.util;

import br.com.gemeos.escolacomtdd.facade.FacadeProfessor;
import br.com.gemeos.escolacomtdd.model.Endereco;
import br.com.gemeos.escolacomtdd.model.Professor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class CrudProfessor {

    private BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    private Professor prof = new Professor();
    private List<Professor> professores = null;
    private Endereco endereco = new Endereco();
    private FacadeProfessor fpdao = new FacadeProfessor();
    private Conversor conversor = new Conversor();
    private String resposta = new String();

    public void professorEmExecucao() throws IOException, ParseException, Exception {

        System.out.println("-----MENU DO PROFESSOR-----");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - EDITAR");
        System.out.println("3 - EXCLUIR");
        System.out.println("4 - LISTAR");
        System.out.println("5 - BUSCAR POR CPF");
        resposta = read.readLine();

        switch (resposta) {

            case "1":

              
                 try{
                     System.out.println("Nome do Professor");
                     prof.setNome(read.readLine());

                     System.out.println("cpf do Professor");
                     prof.setCpf(read.readLine());

                     System.out.println("Data  de Nascimento");
                     prof.setDataDeNascimento(conversor.stringParaData(read.readLine()));

                     System.out.println("Número do telefone");
                     prof.setTelefone(read.readLine());

                     System.out.println("Email do Professor");
                     prof.setEmail(read.readLine());

                     System.out.println("Sarario do Professor");
                     prof.setSalario(conversor.StringParaDouble(read.readLine()));

                     System.out.println("Rua do Professor");
                     endereco.setRua(read.readLine());

                     System.out.println("Bairro do Professor");
                     endereco.setBairro(read.readLine());

                     System.out.println("Numero da casa");
                     endereco.setNumero(read.readLine());

                     System.out.println("Cidade do Professor");
                     endereco.setCidade(read.readLine());

                     System.out.println("UF do Professor");
                     endereco.setUf(read.readLine());

                     System.out.println("Cep do Professor");
                     endereco.setCep(read.readLine());

                     prof.setEndereco(endereco);

                     fpdao.facadeCadastrarProfessor(prof);
                }catch(Exception e){
                    System.err.println("Falha ao realizar a operação");
                }
                break;

            case "2":

                try {

                    System.out.println("cpf do Professor");
                    prof = fpdao.facadeBuscarProfessor(read.readLine());

                    System.out.println("-----MENU DE EDIÇÃO-----");
                    System.out.println("1 - NOME");
                    System.out.println("2 - TELEFONE");
                    System.out.println("3 - EMAIL");
                    System.out.println("4 - RUA");
                    System.out.println("5 - BAIRRO");
                    System.out.println("6 - NUMERO DA CASA");
                    System.out.println("7 - ENDEREÇO");
                    System.out.println("8 - SALARIO");
                    resposta = read.readLine();

                    switch (resposta) {

                        case "1":
                            System.out.println("Novo nome do Professor");
                            prof.setNome(read.readLine());
                            fpdao.facadeEditarProfessor(prof);

                            break;

                        case "2":
                            System.out.println("Novo Numero Telefonico");
                            prof.setTelefone(read.readLine());
                            fpdao.facadeEditarProfessor(prof);
                            break;

                        case "3":
                            System.out.println("Novo Endereço de Email");
                            prof.setEmail(read.readLine());
                            fpdao.facadeEditarProfessor(prof);
                            break;

                        case "4":
                            System.out.println("Nova Rua ");
                            prof.getEndereco().setRua(read.readLine());
                            fpdao.facadeEditarProfessor(prof);
                            break;

                        case "5":
                            System.out.println("Novo Bairro");
                            prof.getEndereco().setBairro(read.readLine());
                            fpdao.facadeEditarProfessor(prof);
                            break;

                        case "6":
                            System.out.println("Nova Numero da casa");
                            prof.getEndereco().setNumero(read.readLine());
                            fpdao.facadeEditarProfessor(prof);
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
                            prof.setEndereco(endereco);
                            fpdao.facadeEditarProfessor(prof);
                            break;

                        case "8":
                            System.out.println("Nova Salario do Professor");
                            prof.setSalario(conversor.StringParaDouble(read.readLine()));
                            fpdao.facadeEditarProfessor(prof);
                            break;

                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                } catch (Exception e) {
                    System.err.println("Falha ao realizar a operação");
                }
                break;

            case "3":
                try {
                    System.out.println("cpf do Professor");
                    fpdao.facadeRemoverProfessor(fpdao.facadeBuscarProfessor(read.readLine()));
                } catch (Exception e) {
                    System.err.println("Falha ao realizar a operação");
                }

                break;
            case "4":
                try {
                    professores = fpdao.facadeListarProfessor();
                    for (Professor perc : professores) {
                        System.out.println(perc);
                    }
                } catch (Exception e) {
                    System.err.println("Falha ao realizar a operação");
                }

                break;
            case "5":
                try {
                    System.out.println("cpf do Professor");
                    prof = fpdao.facadeBuscarProfessor(read.readLine());
                    
                    if(prof != null){
                    System.out.println(prof);
                    }else{
                        System.out.println("Não foi encontrado");
                    }
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

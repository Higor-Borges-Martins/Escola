/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.gemeos.biblioteca.facade.FacadeAluguel;
import br.com.gemeos.biblioteca.facade.FacadeAluno;
import br.com.gemeos.biblioteca.facade.FacadeLivro;
import br.com.gemeos.biblioteca.facade.FacadeProfessor;
import br.com.gemeos.biblioteca.modal.Aluguel;
import br.com.gemeos.biblioteca.modal.Aluno;
import br.com.gemeos.biblioteca.modal.Autor;
import br.com.gemeos.biblioteca.modal.Editora;
import br.com.gemeos.biblioteca.modal.Endereco;
import br.com.gemeos.biblioteca.modal.Livro;
import br.com.gemeos.biblioteca.modal.Pessoa;
import br.com.gemeos.biblioteca.modal.Professor;
import br.com.gemeos.biblioteca.util.Conversor;
import br.com.gemeos.biblioteca.util.MetodosDeAutorEditora;
import java.io.IOException;
import java.text.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pessoal
 */
public class TestesTDD {

    private Aluno aluno = new Aluno();
    private Professor prof = new Professor();
    private Aluguel alugar = new Aluguel();
    private Livro livro = new Livro();
    private Endereco endereco = new Endereco();
    private Autor autor = new Autor();
    private Editora editora = new Editora();
    private FacadeAluno fadao = new FacadeAluno();
    private FacadeProfessor fpdao = new FacadeProfessor();
    private FacadeLivro fldao = new FacadeLivro();
    private FacadeAluguel facadeAlugar = new FacadeAluguel();
    private Conversor conversor = new Conversor();
//    private CrudAluno cruda = new CrudAluno();
    private MetodosDeAutorEditora metodos = new MetodosDeAutorEditora();
    private String resposta;

    public TestesTDD() {
    }

    @Test
    public void testCadrastroAluno() throws ParseException, IOException, Exception {

        aluno.setMatricula(fadao.gerarMatricula());
        System.out.println("Nome do Aluno");
        aluno.setNome("testeComMatricula");

        System.out.println("cpf do Aluno");
        resposta = "123.456.789-10";
        for (Aluno perc : fadao.listarAlunos()) {
            if (resposta.equals(perc.getCpf())) {
                aluno.setCpf(resposta);
            } else {
                System.out.println("CPF Invalido");
                break;
            }
        }

        System.out.println("Data  de Nascimento");
        aluno.setDataDeNascimento(conversor.stringParaData("11/11/1111"));

        System.out.println("Número do telefone");
        aluno.setTelefone("911111111");

        System.out.println("Email do Aluno");
        aluno.setEmail("teste@gmail.com");

        System.out.println("Rua do Aluno");
        endereco.setRua("teste");

        System.out.println("Bairro do Aluno");
        endereco.setBairro("teste");

        System.out.println("Numero da casa");
        endereco.setNumero("teste");

        System.out.println("Cidade do Aluno");
        endereco.setCidade("teste");

        System.out.println("UF do Aluno");
        endereco.setUf("tt");

        System.out.println("Cep do Aluno");
        endereco.setCep("11111-111");
        aluno.setEndereco(endereco);

        fadao.cadastrarAluno(aluno);
    }
//      @Test
//    public void testListarDeAlunos() throws Exception {
//        for (Aluno perc : fadao.listarAlunos()) {
//            System.out.println(fadao.listarAlunos());
//
//        }
//    }
//    @Test
//    public void testBuscarAluno() throws Exception {
//        System.out.println("cpf do aluno");
//        aluno = fadao.buscarAluno("123.456.789-10");
//        if (aluno != null) {
//            System.out.println(aluno);
//        } else {
//            System.out.println("Não foi encontrado");
//        }
//    }
//    @Test
//    public void testEditarAluno() throws ParseException, Exception {
//
//        Aluno aluno;
//       aluno = fadao.buscarAluno("123.456.789-10");
//       
//        System.out.println("Nome do Aluno");
//        aluno.setNome("Hugo");
//
//        fadao.editarAluno(aluno);
//        fadao.listarAlunos();
//    }
//    @Test
//    public void testExpussarAluno() throws Exception {
//
//        fadao.removerAluno(fadao.buscarAluno("123.456.789-10"));
//        fadao.listarAlunos();
//    }

//     @Test
//    public void testCadastrarProfessor() throws ParseException {
//
//        System.out.println("Nome do Professor");
//        prof.setNome("teste");
//
//        System.out.println("cpf do Professor");
//        prof.setCpf("123.456.789-01");
//
//        System.out.println("Data  de Nascimento");
//        prof.setDataDeNascimento(conversor.stringParaData("11/11/1111"));
//
//        System.out.println("Número do telefone");
//        prof.setTelefone("911111111");
//
//        System.out.println("Email do Professor");
//        prof.setEmail("teste@gmail.com");
//        
//        System.out.println("Salario do Professor ");
//        System.out.print("R$ ");
//        prof.setSalario(conversor.StringParaDouble("150.00"));
//        
//        System.out.println("Rua do Aluno");
//        endereco.setRua("teste");
//
//        System.out.println("Bairro do Aluno");
//        endereco.setBairro("teste");
//
//        System.out.println("Numero da casa");
//        endereco.setNumero("teste");
//
//        System.out.println("Cidade do Aluno");
//        endereco.setCidade("teste");
//
//        System.out.println("UF do Aluno");
//        endereco.setUf("tt");
//
//        System.out.println("Cep do Aluno");
//        endereco.setCep("11111-111");
//
//        prof.setEndereco(endereco);
//        fpdao.facadeCadastrarProfessor(prof);
//    }
//     @Test
//    public void testListarProfessor() throws Exception{
//        for(Professor perc: fpdao.facadeListarProfessor()){
//            System.out.println(perc);
//        }
//    }
//    @Test
//    public void testBuscarProfessor() throws Exception {
//
//        prof = fpdao.facadeBuscarProfessor("123.456.789-01");
//        if (prof != null) {
//            System.out.println(prof);
//        } else {
//            System.out.println("Não foi encontrado");
//        }
//    }
//    
//    @Test
//    public void testEditarProfessor() throws Exception{
//       prof = fpdao.facadeBuscarProfessor("123.456.789-01");
//        prof.setNome("ProfessorTestado");
//        fpdao.facadeEditarProfessor(prof);
//    }
//    
//    @Test
//    public void removerProfessor() throws Exception{
//        prof = fpdao.facadeBuscarProfessor("123.456.789-01");
//        fpdao.facadeRemoverProfessor(prof);
//    }
//     @Test
//    public void testCadastrarAutor() throws ParseException{
//        System.out.println("Nome do Autor");
//        autor.setNomeAutor("Alexandre Dumas Pai");
//        System.out.println("Data de Nascimento");
//        autor.setDtNascimento(conversor.stringParaData("24/07/1802"));
//        System.out.println("Data de Falecimento");
//        autor.setDtMorte(conversor.stringParaData("05/12/1870"));
//        System.out.println("Nacionalidade");
//        autor.setNacionalidade("Frances");
//        System.out.println("Generos Literarios");
//        autor.setGeneroLiterari("Romance e drama");
//        fldao.facadeCadastrarAutor(autor);
//    }
//    @Test
//    public void testBucarAutor() throws Exception{
//        System.out.println("Nome do Autor");
//        System.out.println(fldao.facadeBuscarAutor("Alexandre Dumas Pai"));
//    } 
//     @Test
//    public void testCadastrarEditora() {
//        System.out.println("Nome da Editora");
//        editora.setNomeEditora("Teste3");
//
//        System.out.println("Rua do Aluno");
//        endereco.setRua("teste");
//
//        System.out.println("Bairro do Aluno");
//        endereco.setBairro("teste");
//
//        System.out.println("Numero da casa");
//        endereco.setNumero("teste");
//
//        System.out.println("Cidade do Aluno");
//        endereco.setCidade("teste");
//
//        System.out.println("UF do Aluno");
//        endereco.setUf("tt");
//
//        System.out.println("Cep do Aluno");
//        endereco.setCep("11111-111");
//        
//        editora.setEndereco(endereco);
//        fldao.facadeCadastrarEditora(editora);
//    }
//    @Test
//    public void testBuscarEditora() throws Exception{
//        System.out.println(fldao.facadeBuscarEditora("Teste3"));  
//    }
//     @Test
//    public void testCadastrarLivro() throws ParseException, Exception {
//
//        System.out.println("Titulo do Livro");
//        livro.setTitulo("Test7");
//        System.out.println("Nome do Autor");
//        autor = fldao.facadeBuscarAutor("Alexandre Dumas Pai");
//        if (autor != null) {
//            livro.setAutor(autor);
//            System.out.println("Ano de Publicação");
//            livro.setAnoDePublicacao(conversor.stringParaData("11/11/1111"));
//            System.out.println("Editora");
//            editora = fldao.facadeBuscarEditora("Teste3");
//            livro.setEditora(editora);
//            System.out.println("Edição");
//            livro.setNumeroDeEdicao("6 °");
//            System.out.println("Informe o número de copias");
//            livro.setCopias(5);
//            fldao.facadeCadastrarLivro(livro);
//        } else {
//            metodos.CadastrarAutor();
//        }
//    }
//    @Test
//    public void testListarLivros() throws Exception {
//        for (Livro perc : fldao.facadeListaLivro()) {
//            System.out.println(perc);
//        }
//    }
//    @Test
//    public void testAtualisarQuantidadeLivro() throws Exception{
//        livro = fldao.facadeBuscarLivro("Test7");
//        if(livro !=null){
//            livro.setCopias(livro.getCopias()+conversor.StringParaDouble("2"));
//        fldao.facadeAtualizarLivro(livro);
//        }else{
//            System.out.println("Livro não encontrado");
//        }
//    }
//    @Test
//    public void testBuscarLivro() throws Exception {
//        livro = fldao.facadeBuscarLivro("Test5");
//        if(livro != null){
//            System.out.println(livro);
//        }else{
//            System.out.println("Não foi encontrado");
//        }
//    }
//    @Test
//    public void testRemoverLivro() throws Exception{
//        
//        livro = fldao.facadeBuscarLivro("Test5");
//        fldao.facadeRemoverLivro(livro);
//    }
//     @Test
//    public void testAlugarLivro() throws Exception {
//        String resposta;
//       try {
//            System.out.println("Aluno: 1 \n Professor: 2");
//            resposta = "1";
//            if (resposta.equals("1")) {
//                System.out.println("Informe CPF");
//                aluno = fadao.buscarAluno("123.456.789-11");
//                System.out.println(aluno);
//                alugar.setIdPessoa(aluno);
//            } else {
//                System.out.println("Informe CPF");
//                prof = fpdao.facadeBuscarProfessor("123.456.789-02");
//                System.out.println(prof);
//                alugar.setIdPessoa(prof);
//            }
//            System.out.println("Titulo do Livro");
//            System.out.println(livro = fldao.facadeBuscarLivro("Test7"));
//            if (livro != null) {
//                alugar.setLivro(livro);
//            } else {
//                System.out.println("Livro não encontrado no sistema");
//            }
//            if (livro.getCopias() != 0) {
//                livro.setCopias(livro.getCopias() - 1);
//                fldao.facadeAtualizarLivro(livro);
//                System.out.println("Data em que o aluguel foi efetuado");
//                alugar.setDiaDoAluguel(conversor.stringParaData("28/04/2020"));
//                alugar.setStatus(true);
//                facadeAlugar.facadeAlugarLivro(alugar);
//            } else {
//                System.out.println("Livro Indisponivel no momento");
//            }
//        } catch (Exception e) {
//            System.err.println("Falha ao realizar a operação");
//        }
//    }
//    @Test
//    public void testAlugueisPendentes() throws Exception {
//        for (Aluguel perc : facadeAlugar.facadeListarAluguel()) {
//            System.out.println(perc);
//        }
//    }
//    @Test
//    public void testPesquisarAluguel() throws Exception {
//        System.out.println("Informe o registro do Aluguel");
//        System.out.println(facadeAlugar.facadePesquisarAluguel(conversor.StringParaLong("47")));
//    }
//    @Test
//    public void testDevolverLitro() throws Exception {
//        System.out.println("Informe o registro do aluguel");
//        System.out.println( alugar = facadeAlugar.facadePesquisarAluguel(conversor.StringParaLong("47")));
//        alugar.setStatus(false);
//        livro = alugar.getLivro();
//        livro.setCopias(livro.getCopias() + 1);
//        fldao.facadeAtualizarLivro(livro);
//        facadeAlugar.facadeDevolverLivro(alugar);
//    }
}

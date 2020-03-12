
import br.com.gemeos.escolacomtdd.dao.LivroDao;
import br.com.gemeos.escolacomtdd.dao.ProfessorDao;
import br.com.gemeos.escolacomtdd.facade.FacadeAluno;
import br.com.gemeos.escolacomtdd.facade.FacadeProfessor;
import br.com.gemeos.escolacomtdd.model.Aluno;
import br.com.gemeos.escolacomtdd.model.Endereco;
import br.com.gemeos.escolacomtdd.model.Livro;
import br.com.gemeos.escolacomtdd.model.Professor;
import br.com.gemeos.escolacomtdd.util.Conversor;
import br.com.gemeos.escolacomtdd.util.CrudAluno;
import java.io.IOException;
import java.text.ParseException;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Pessoal
 */
public class TesteTDD {

    private Aluno aluno = new Aluno();
    private Professor prof = new Professor();
    private Livro livro = new Livro();
    private Endereco endereco = new Endereco();
    private FacadeAluno fadao = new FacadeAluno();
    private FacadeProfessor fpdao = new FacadeProfessor();
    private LivroDao ldao = new LivroDao();
    private Conversor conversor = new Conversor();
    private CrudAluno cruda = new CrudAluno();

    public TesteTDD() {
    }

//    @Test
//    public void testCadrastroAluno() throws ParseException, IOException, Exception {
//
//        aluno.setMatricula(fadao.gerarMatricula());
//        System.out.println("Nome do Aluno");
//        aluno.setNome("testeComMatricula");
//
//        System.out.println("cpf do Aluno");
//        aluno.setCpf("123.456.789-10");
//
//        System.out.println("Data  de Nascimento");
//        aluno.setDataDeNascimento(conversor.stringParaData("11/11/1111"));
//
//        System.out.println("Número do telefone");
//        aluno.setTelefone("911111111");
//
//        System.out.println("Email do Aluno");
//        aluno.setEmail("teste@gmail.com");
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
//        aluno.setEndereco(endereco);
//
//        fadao.cadastrarAluno(aluno);
//    }

//    @Test
//    public void testListarDeAlunos() throws Exception {
//        for (Aluno perc : fadao.listarAlunos()) {
//            System.out.println(fadao.listarAlunos());
//
//        }
//    }
    
//    @Test
//    public void testBuscarAluno() throws Exception {
//        System.out.println("cpf do aluno");
//        System.out.println(fadao.buscarAluno("123.456.789-10"));
//    }
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
//
//    @Test
//    public void testExpussarAluno() throws Exception {
//
//        fadao.removerAluno(fadao.testBuscarAluno("123.456.789-10"));
//        fadao.listarAlunos();
//    }
//    @Test
//    public void testConverterUtil() throws ParseException {
//        String temporario;
//
//        System.out.println("Data de nascimento");
//        temporario = "11/11/1111";
//        aluno.setDataDeNascimento(conversor.stringParaData(temporario));
//    }
//    @Test
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
//
//    }
//    @Test
//    public void testListarProfessor() throws Exception{
//        for(Professor perc: fpdao.facadeListarProfessor()){
//            System.out.println(perc);
//        }
//    }
//    @Test
//    public void testBuscarProfessor() throws Exception{
//        System.out.println(fpdao.facadeBuscarProfessor("123.456.789-10"));
//    }
//    
//    @Test
//    public void testEditarProfessor() throws Exception{
//       prof = pdao.buscarProfessor("123.456.789-10");
//        prof.setNome("ProfessorTestado");
//        fpdao.facadeEditarProfessor(prof);
//    }
//    
//    @Test
//    public void removerProfessor() throws Exception{
//        prof = pdao.buscarProfessor("123.456.789-10");
//        fpdao.facadeRemoverProfessor(prof);
//    }
    
//    @Test
//    public void testCadastrarLivro() throws ParseException{
//        
//        System.out.println("Titulo do Livro");
//        livro.setTitulo("Teste");
//        System.out.println("Nome do Autor");
//        livro.setAutor("Testador");
//        System.out.println("Ano de Publicação");
//        livro.setAnoDePublicacao(conversor.stringParaData("11/11/1111"));
//        System.out.println("Editora");
//        livro.setEditora("Top crow");
//        System.out.println("Edição");
//        livro.setNumeroDeEdicao("6 °");
//        System.out.println("Informe o número de copias");
//        livro.setCopias(1);
//        ldao.salvarLivro(livro);
//    }
//    
//    @Test
//    public void testListarLivros() throws Exception{
//        for(Livro perc: ldao.listarLivro())
//            System.out.println(perc);
//    }
    @Test
    public void testBuscarLivro() throws Exception{
        System.out.println(ldao.buscarLivro("Teste"));
    }
    
    @Test
    public void testAtualisarQuantidadeLivro() throws Exception{
        livro = ldao.buscarLivro("Teste");
        livro.setCopias();
        ldao.atualisarQuantidadeLivro(ldao.buscarLivro("Teste"));
    }
}

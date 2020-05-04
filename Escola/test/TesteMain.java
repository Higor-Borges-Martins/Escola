
import br.com.gemeos.escolacomtdd.dao.LivroDao;
import br.com.gemeos.escolacomtdd.dao.ProfessorDao;
import br.com.gemeos.escolacomtdd.util.CrudAluguel;
import br.com.gemeos.escolacomtdd.util.CrudAluno;
import br.com.gemeos.escolacomtdd.util.CrudLivro;
import br.com.gemeos.escolacomtdd.util.CrudProfessor;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pessoal
 */
public class TesteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        CrudAluno aluno = new CrudAluno();
        CrudProfessor prof = new CrudProfessor();
        CrudLivro livro = new CrudLivro();
        CrudAluguel aluguel = new CrudAluguel();
        String resposta = new String();

        while (!resposta.equals("0")) {
            System.out.println("----- MENU -----");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Livro");
            System.out.println("4 - Aluguel");
            System.out.println("0 - Sair");
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
                  //  aluguel.AluguelEmExecução();
                    break;
                case "0":
                    System.out.println("Fechando o sistema");
                    break;
                    
                    default:
                        System.out.println("Opção Invalida");
                        break;
            }
        }
    }
}

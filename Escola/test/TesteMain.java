
import br.com.gemeos.escolacomtdd.dao.LivroDao;
import br.com.gemeos.escolacomtdd.dao.ProfessorDao;
import br.com.gemeos.escolacomtdd.model.Professor;
import br.com.gemeos.escolacomtdd.util.CrudLivro;

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

        ProfessorDao pdao = new ProfessorDao();
        LivroDao ldao = new LivroDao();
        CrudLivro livro = new CrudLivro();
        //        for (Professor perc : pdao.listarProfessor()) {
        //            System.out.println(perc);;
//               }
//        System.out.println(ldao.buscarLivro("Teste"));
        livro.livroEmExecução();
    }
}

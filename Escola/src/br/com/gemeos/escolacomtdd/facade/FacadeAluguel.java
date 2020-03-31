/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.facade;

import br.com.gemeos.escolacomtdd.dao.AluguelDao;
import br.com.gemeos.escolacomtdd.model.Aluguel;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class FacadeAluguel {
   
    AluguelDao alugarDao = new AluguelDao();
    
    public void facadeAlugarLivro(Aluguel alugar){
        alugarDao.alugarLivro(alugar);
    }
    
    public void facadeDevolverLivro(Aluguel alugar) throws Exception{
        alugarDao.DevolverLivro(alugar);
    }
    
    public Aluguel facadePesquisarAluguel(long registro) throws Exception{
        return alugarDao.pesquisarAluguel(registro);
    }
    
    public List<Aluguel>facadeListarAluguel() throws Exception{
       return alugarDao.listarAlugueis();
    }
    
}

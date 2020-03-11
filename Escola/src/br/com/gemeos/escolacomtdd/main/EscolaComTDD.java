/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.main;

import br.com.gemeos.escolacomtdd.dao.AlunoDao;
import br.com.gemeos.escolacomtdd.facade.FacadeAluno;
import br.com.gemeos.escolacomtdd.model.Aluno;
import br.com.gemeos.escolacomtdd.model.Endereco;
import br.com.gemeos.escolacomtdd.util.Conversor;
import br.com.gemeos.escolacomtdd.util.CrudAluno;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 *
 * @author Pessoal
 */
public class EscolaComTDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException, Exception {
        

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        CrudAluno cruda = new CrudAluno();
  
        
        System.out.println("1- Aluno");
        System.out.println("2-");
        System.out.println("3- ");
        System.out.println("4- ");
        cruda.alunoEmExecucao();
        
        
        
        
    }

}

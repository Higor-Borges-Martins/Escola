package br.com.gemeos.escolacomtdd.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pessoal
 */
public class Conversor {
    
    private SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Date stringParaData(String temporario) throws ParseException{
        
      return sdf.parse(temporario);
   
    }
    
    public long StringParaLong(String matricula){
        return  Long.parseLong(matricula);
    }
    
    public double StringParaDouble(String salario){
        
        return Double.parseDouble(salario);
    }
    
}

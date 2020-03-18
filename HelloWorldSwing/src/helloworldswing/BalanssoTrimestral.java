/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldswing;

/**
 *
 * @author Pessoal
 */
public class BalanssoTrimestral {
    
    public static void main(String[] args) {
        //        int janeiro = 15000;
        //        int fevereiro = 23000;
        //        int marco = 17000;
        //        
        //        int gastosTrimestral = janeiro + fevereiro + marco;
        //        double mediaMensal = gastosTrimestral/3;
        //        
        //        System.out.println(gastosTrimestral);
        //        System.out.println("Valor da media mensal = " + mediaMensal);
        //        
        //        int i =5;
        //        int x = i++;
        //        System.out.println(x);
        //        System.out.println(x);
        //        
        //        int y = ++i;
        //         System.out.println(y);

//        int mutiblicador = 3;
//        int resultado = 3;
//       
//        for(int i = 2; resultado < 100; i++){
//            
//            System.out.println(resultado);
//            resultado = mutiblicador * i;
//          
//        }
//        int x = 0;
//        int y = 1;
//      
//
//        while ( y < 100) {
//
//            
//            y = x + y;
//            x = y - x; 
//          
//            System.out.println("->" + y);
//        }
//        int x = 42;
//
//        while (x > 1) {
//            if (x % 2 != 0) {
//                x = 3 * x + 1;
//            } else {
//                x = x / 2;
//            }
//            System.out.print( " -> " + x );
//        }
//        for(int i = 1; i <= 10; i++){
//            
//            for(int y = 1; y <= i; y++){
//                
//                System.out.print( y * i + ", " );
//            }
//                System.out.println();
//        }
//        minhaConta = new Conta();
//
//        minhaConta.titula = "Duke";
//        minhaConta.saldo = 0;
//        minhaConta.limite = 100;
//
//        System.out.println(minhaConta.saldo);
//      if(minhaConta.saca(-1)){
//          System.out.println("Consegui sacar");
//      }else{
//          System.out.println("Não Consegui sacar");
//      }
//        System.out.println(minhaConta.saldo);
//
//        minhaConta.debosita(500);
//        System.out.println(minhaConta.saldo);
//        Conta c1;
//        c1 = new Conta();
//        c1.titula = "Duke";
//        c1.debosita(100);
//
//        Conta c2 = new Conta();
//        c2.titula = "Duke";
//        c2.debosita(100);
////        System.out.println("c1 = " + c1);
////        System.out.println("c2 = " + c2);
////
////        if (c1.titula == c2.titula) {
////            System.out.println("Contas Iguais");
////        }
//
//        c1.transferencia(c2, 50);
//        System.out.println(c1.saldo);
//        System.out.println(c2.saldo);
//        Cliente c = new Cliente();
//        Conta minhaConta = new Conta();
//        minhaConta.titula = c;
//        Cliente clienteMinhaConta = minhaConta.titula;
//        clienteMinhaConta.nome = "Judas";
//        
//        System.out.println(clienteMinhaConta.nome);
//        System.out.println(minhaConta.titula.nome);
//===============================+++++++++++=======================
////Exercicios da Questão 1 pag.61 ao 4. Pag.63. Feito por Hiury
//        ContaExecircio contaExecircio = new ContaExecircio();
//        Data data = new Data();
//
//        contaExecircio.agencia = "12345-6";
//        contaExecircio.titula = "testeCliente";
//        contaExecircio.numero = 1;
//        contaExecircio.saldo = 1000;
//       
//        data.dia = 01;
//        data.mes = 02;
//        data.ano = 2020;
//        
//        contaExecircio.dataDeAbertura = data;
//
//        System.out.println("Titular: " + contaExecircio.titula);
//        System.out.println("N° Agencia: " + contaExecircio.agencia);
//        System.out.println("N° da Conta: " + contaExecircio.numero);
//        System.out.println("Data de Abertura: " + contaExecircio.dataDeAbertura);
//       
//        contaExecircio.sacar(20);
//        System.out.println("Saldo disponivel: " + contaExecircio.saldo);
//
//        contaExecircio.depositar(200);
//        System.out.println("Saldo disponivel: " + contaExecircio.saldo);
//        System.out.println("Rendimento mensal: " + contaExecircio.calculaRendimento());
//        
//        System.out.println("------------------------------------------");
//        System.out.println(contaExecircio.recuperarDadosParaImpressao());
//        ContaExecircio ce1 = new ContaExecircio();
//        Data data1 = new Data();
//        ce1.agencia = "12345-6";
//        ce1.titula = "testeCliente";
//        ce1.numero = 1;
//        ce1.saldo = 1000;
//        data1.dia = 03;
//        data1.mes = 10;
//        data1.ano = 2019;
//        ce1.dataDeAbertura = data1;
//        
//        ContaExecircio ce2 = new ContaExecircio();
//        Data data2 = new Data();
//        ce2.agencia = "12345-6";
//        ce2.titula = "testeCliente";
//        ce2.numero = 1;
//        ce2.saldo = 1000;
//        data2.dia = 03;
//        data2.mes = 10;
//        data2.ano = 2019;
//        ce2.dataDeAbertura = data2;
//        
//        if(ce1 == ce2){
//            System.out.println("iguais");
//        }else{
//            System.out.println("diferentes");
//        }
//        
//        ce1 = ce2;
//        
//        if(ce1 == ce2){
//            System.out.println("iguais");
//        }else{
//            System.out.println("diferentes");
//        }
//        
//        Fibonacci fibonacci = new Fibonacci();
//        for(int i = 1; i <= 6; i++){
//            int resultado = fibonacci.calcularFibonacci(i);
//            System.out.println(resultado);
//        }
//===============================++++Higor+++++=======================
//        ExecicioOO c1 = new ExecicioOO();
////        ExecicioOO c2 = new ExecicioOO();
//        Data data = new Data();
//        c1.titular = "Hugo";
//        c1.numero = 123;
//        c1.agencia = "45678-9";
//        c1.saldo = 50.0;
//        c1.dataAbertura = "04/06/2015";
//
//        c1.deposito(100.0);
//        System.out.println("saldo atual: " + c1.saldo);
//        System.out.println("rendimento mensal: " + c1.calcularRendimento());
//        c1.saca(20.0);
//        System.out.println("salvo atual: " + c1.saldo);
//
//        System.out.println(c1.recuperaDadosParaImpressao());
//
//        c2.titular = "Hugo";
//        c2.numero = 123;
//        c2.agencia = "45678-9";
//        c2.saldo = 50.0;
//        c2.dataAbertura = "04/06/2015";
//
//        if(c1 == c2){
//            System.out.println("igual");
//        }else{
//            System.out.println("diferentes");
//    }
//        data.dia = 02;
//        data.mes = 07;
//        data.ano = 2007;
//
//        c1.titular = "Devidi";
//        c1.saldo = 5000.00;
//        c1.dataAbertura = data;
//        c2 = c1;
//        if(c1 == c2){
//            System.out.println("São iguais");
//        System.out.println(c1.recuperaDadosParaImpressao());
//        }else{
//            System.out.println("não são iguais");
//        }
//        ExecicioOO.saldo = 1234;
//        ExecicioOO.calcularRendimento();
//        System.out.println(c1.recuperaDadosParaImpressao());
//        FibonacciHg fibonacci = new FibonacciHg();
//        int valor = 0;
//
//   fibonacci.fibonacci(valor);
/////////////////////////////////////// EXECÍCIO DE FIXAÇÃO ///////////////////////////////////
//        Pessoa pessoa = new Pessoa();
//        
//        pessoa.nome= "Carlos";
//        pessoa.idade = 13;
//        pessoa.fazAniversario();
//        pessoa.fazAniversario();
//        pessoa.fazAniversario();
//        
//       Porta porta = new Porta();
//       porta.abrir();
//       porta.estaAberta();
//       porta.cor = "Vermelho";
//       porta.fechar();
//       porta.dimencaoX = 2;
//       porta.dimencaoY = 3;
//       porta.dimencaoZ = 1;
//        System.out.println(porta.valores());
//        CasaHy casa = new CasaHy();
//        casa.cor = "azul";
//        casa.porta1.abrir();
//        casa.porta2.abrir();
//        casa.porta3.abrir();
//        System.out.println(casa.statusDaCasa());
//        casa.porta3.fechar();
//        System.out.println(casa.statusDaCasa());
//        CasaHg casa = new CasaHg();
//        casa.pintarCasa("Verde");
//        casa.porta1.abrir();
//        casa.porta2.fechar();
//        casa.porta3.abrir();
//        System.out.println(casa.statusCasa());
//        System.out.println(casa.quantasPortasEstaoApertas());
        ContaExecircio novaConta = new ContaExecircio();
        novaConta.depositar(-100);
        System.out.println(novaConta.getSaldo());
        novaConta.sacar(110);
        System.out.println(novaConta.getSaldo());
    }
}

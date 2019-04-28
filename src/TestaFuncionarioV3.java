/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestaFuncionarioV3 {
    public static void main(String[] args){
    
    
    Data d1 = new Data();
    d1.ano = 2019;
    d1.mes = 04;
    d1.dia = 2;
    
    
    FuncionarioV3 f = new FuncionarioV3();
    
    f.ativo = true;
    f.dataEntrada = d1;
    f.nome = "warlew";
    f.rg = "595";
    f.salario = 4555;
   
    f.bonifica(10);
    f.demite();
    f.mostrar();
    
    
}
    
}

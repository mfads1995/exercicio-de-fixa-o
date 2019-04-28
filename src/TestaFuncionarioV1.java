/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestaFuncionarioV1 {
    
    public static void main(String[] args){
        
        
        FuncionarioV1 t1 = new FuncionarioV1();
        
        t1.nome = "david";
        t1.ativo = true;
        t1.dataEntrada = "25/03/2000";
        t1.departamento = "cobrança";
        t1.rg = "384894";
        t1.salario = 50000;
        
        
        t1.bonifica(15);
        
       System.out.println(t1.salario);
        
       t1.demite();
        System.out.println(t1.ativo);
        
        
                 
        
                
                
                
        
        
        
    }
    
}

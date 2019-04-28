/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestaFuncionarioV4 {
    
    public static void main (String[] args){
    
    
    FuncionarioV4 f = new FuncionarioV4();
    f.nome = "michael";
    f.rg = "030393";
        FuncionarioV4 f1 = new FuncionarioV4();
        f1.nome = "michael";
        f1.rg = "439830";
                
        
        f.equals(f1);
        
    
    
}
}
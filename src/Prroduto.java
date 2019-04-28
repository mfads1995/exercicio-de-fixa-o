/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Prroduto {
    
    double preço;
    String nome;
    
    void diminuiir10(){
        preço = preço * 0.5;
        System.out.println(preço);
        
    }
    void aumenta25(){
        preço = this.preço * 1.25;
         System.out.println(preço);
    }
}

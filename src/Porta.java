/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Porta {
    
    boolean aberta;
    String cor;
    String dimensaoX;
    String dimensaoY;
    String dimensaoZ;
    
    void abre(){
        aberta = true;
    }
    
    void fecha(){
        aberta = false;
        
    }
    void pinta(String ncor){
        
        cor = ncor;
        System.out.println(cor);
        
    }
        boolean estaAberta(){
            
            if(aberta == true){
                System.out.println("a orta esta aberta");}
       
           return false;
              
                
            
        
    
    
}
}
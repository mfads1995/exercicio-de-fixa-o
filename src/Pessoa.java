/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Pessoa {
    
    int idadeAtual;
    String nome;
    
    
    void fazAniversario(int aniversario){
        
        
       idadeAtual = idadeAtual + aniversario;
        System.out.println("O nome é : " + nome);
        System.out.println("e a sua idade atual é de :" + idadeAtual);
    }
    
    
}

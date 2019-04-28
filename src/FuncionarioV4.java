/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class FuncionarioV4 {
     String nome; 
   String departamento;
   double salario;
   Data dataEntrada;
   String rg;
   boolean ativo;
   
   void bonifica(double aumento){
       
       double res;
       res = (salario * aumento) /100 ;
       salario = salario + res;
   }  
       void demite(){
  
           ativo = false;
          
   }     
       boolean equals(FuncionarioV4 outro) {
           
       if(this.nome.equals(outro.nome) && (this.rg.equals(outro.rg))){
           
           return true;
       }
       else {
            return false;
       }
       }
         void mostrar(){
             
             System.out.println(dataEntrada.mes +
                     nome + departamento + salario + rg +
                     ativo + dataEntrada.ano + "/" +
                     dataEntrada.dia + "/" + dataEntrada.mes);
             
    
    
    
}
}

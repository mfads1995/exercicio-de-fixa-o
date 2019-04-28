/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class FuncionarioV3 {
    
       
   String nome; 
   String departamento;
   double salario;
   Data dataEntrada;
   String rg;
   boolean ativo = true;
   
   void bonifica(double aumento){
       
       double res;
       res = (salario * aumento) /100 ;
       salario = salario + res;
   }  
       void demite(){
           
           ativo = false;  
   }     
              
         void mostrar(){
             
             System.out.println(nome + "\n" +
                     departamento + "\n" + 
                     
                     salario + "\n" + 
                     rg + "\n" +
                     ativo + "\n" +
                     dataEntrada.dia + "\n" +
                     dataEntrada.mes + "\n" +
                     dataEntrada.ano + "\n"
                     );
             
             
         }
         }

    


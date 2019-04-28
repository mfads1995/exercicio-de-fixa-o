/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestaTemperatura {
    
    public static void main(String [] args){
    
    Temperatura t = new Temperatura();
    double resultado = 0;
    resultado = t.converterParaCelcios(8576);
    System.out.println(resultado);
    
    
    Temperatura i = new Temperatura();
    double resultad = 0;
    resultado = i.converterParaFarenaite(8576);
    System.out.println(resultad);
}
}
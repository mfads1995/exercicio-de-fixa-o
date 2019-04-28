/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Temperatura {
    
    
    double converterParaCelcios(double farenaite){
        
        double resultado;
        resultado = (farenaite - 32) * (5.0/9);
        return resultado;
        
    }
    double converterParaFarenaite(double celcios){
        double resultado;
        resultado = (celcios * 9/5) + 32;
        return resultado;
    }
    
    
}

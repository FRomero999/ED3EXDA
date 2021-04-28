/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesur.examenedmayo21;

/**
 *
 * @author paco
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Ecuacion e = new Ecuacion(2,0,-4);
         e.resolver();
         
         System.out.println(e);
        
    }
    
}

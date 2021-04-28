package com.cesur.examenedmayo21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class EcuacionTest {
    
    private Ecuacion e;
    
    public EcuacionTest() {
        
    }
        
    @Test
    @DisplayName("Evaluar la ecuación para un valor")
    public void testEvaluar() {
        System.out.println("evaluar");
        //Double expResult, result;
        //e = new Ecuacion(1,0,0);        
        // assertEquals(expResult, result, 0.005);
        fail("Test no implementado aun");
    }

    
    @Test
    @DisplayName("Solo el parametro A")   
    public void testResolver() {
        System.out.println("Solo hay A");

        e = new Ecuacion(1,0,0);        
        e.resolver();
                
        assertEquals(e.getSolucion1(),0,0.1);        
        assertEquals(e.getSolucion2(),0,0.1);        
        
    }

 
    
}

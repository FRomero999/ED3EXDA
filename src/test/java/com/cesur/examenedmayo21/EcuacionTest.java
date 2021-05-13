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
        /* Completar */
        fail("Test no implementado aun");
    }

    
    @Test
    @DisplayName("Resolver ecuación de segundo grado")   
    public void testResolver() {
        System.out.println("Resolver ecuación");

        e = new Ecuacion(1,0,0);        
        e.resolver();
        /* Completar */
        
        fail("Test no implementado aun");                
        
    }

 
    
}

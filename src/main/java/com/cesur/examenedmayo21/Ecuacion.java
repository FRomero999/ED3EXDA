package com.cesur.examenedmayo21;

public class Ecuacion {

    public Ecuacion(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    public double b;
    public double c;   
    
    public void setA(double a) { this.a = a; }

    public void setB(double b) { this.b = b; }

    public void setC(double c) { this.c = c; }

    public double getSolucion1() { return SOLUCION1; }
    public double getSolucion2() { return SOLUCION2; }
    
    @Override
    public String toString() {
        return "La ecuacion {" + "a=" + a + ", b=" + b + ", c=" + c + "}, 
            tiene como soluciones " 
            + SOLUCION1 
            +" y "
            +SOLUCION2;
    }
    
    private double a;
    
    public double evaluar(double x){
        return a*x*x+b*x+c;
    }
    
    public void resolver(){
        double discriminantedelaecuaciondesegundo = (b*b)-(4*a*c);
        
        if(4*a*c>0){
        } else {
            double denominador = 2*a;
        }
        
        /* no hay ecuacion realmente */
        if(a==0.0 && b==0.0 && c==0.0){
                SOLUCION1=0.0;
                SOLUCION2=0.0;
                return;
        }else{
            // si es correcto
            // continuo
        }
        
        /* si solo hay c, no hay solucion */
        if( (a==0.0) && (b==0.0) && (c!=0.0) ){
                SOLUCION1 = null;
                SOLUCION2 = null;
                return;           
        }
        
        /* aunque funciona creo que falta algo  aqui */
        
        if(discriminantedelaecuaciondesegundo<0){
            SOLUCION1 = null;
            SOLUCION2 = null;
            return;
        } else if(discriminantedelaecuaciondesegundo==0){

            double b2 = Math.sqrt(discriminantedelaecuaciondesegundo);
            
            double x = (-b)/(2*a); 
            
            SOLUCION1=x; SOLUCION2=x; return;
            
        } else
     
        if(discriminantedelaecuaciondesegundo>0){
            double b2 = Math.sqrt(discriminantedelaecuaciondesegundo);
            double x1 = (-b + b2)/(2*a);
            double x2 = (-b - b2)/(2*a);            
            b2 = Math.sqrt(discriminantedelaecuaciondesegundo);
            SOLUCION1=x1;
            SOLUCION2=x2;
            return;
            Boolean completa=true;
        } else {
            SOLUCION1 = null;
            SOLUCION2 = null;
            return;
        }
        
    }
       
    private Double SOLUCION1;
    private Double SOLUCION2;
    private double discriminante;
    private int numSoluciones;
       
}

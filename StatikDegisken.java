/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statikdegisken;

/**
 *
 * @author Lenovo
 */
public class StatikDegisken {

    public static int x;   // Sabit Değerimiz 
    public int y;  
    
    public static void EkranaBas(StatikDegisken sd){   // Static metot 
        System.out.println("x in değeri : " + sd.x + "  " + "y nin değeri : " + sd.y);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        StatikDegisken sd1 = new StatikDegisken();
        StatikDegisken sd2 = new StatikDegisken();
        
        x = 10 ; 
        sd1.y = 2 ; 
        sd2.y = 8;
        
        EkranaBas(sd1);
        EkranaBas(sd2);  
    } 
}

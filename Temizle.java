/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temizle;

/**
 *
 * @author Lenovo
 */

   class Elma{

    public int i ; 
    
    public Elma(int y) {
        this.i = y ; 
        System.out.println("Elma Sayısı : " + i + ". elma" );
    }
    
    public void finalize(){
      System.out.println(i + ". elma yok edildi");
            
    }

}


public class Temizle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<10 ; i++)
        {
            Elma obj = new Elma(i);
        }
        
        System.gc();
        
        for(int i=10; i<21 ; i++)
        {
            Elma obj = new Elma(i);
        }
    }
    
}

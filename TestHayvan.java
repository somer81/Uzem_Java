/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhayvan;

/**
 *
 * @author Lenovo
 */
public class TestHayvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hayvan[] hayvanlar = new Hayvan[3]; 
        
        hayvanlar[0]  = new Balik(0); 
         hayvanlar[1]  = new Kopek(4); 
          hayvanlar[2]  = new Kus(2); 
        
        
        for(int i = 0; i < hayvanlar.length; i++)
        {
            hayvanlar[i].HareketEt();
            hayvanlar[i].SesCikar();
            System.out.println("");
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altustsiniftest;

/**
 *
 * @author Lenovo
 */
public class AltUstSinifTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nokta n = new Nokta(2,8); 
        Daire d = new Daire(3, 4, 5); 
        Nokta noktaRef = d;
        
        //Daire dRef = (Daire)n;
        
        String cikti = ""; 
        
        cikti += " Nokta sınıfının çıkıtısı : " + n.toString();
        cikti += "\n Daire sınıfının çıktısı : " + d.toString(); 
        cikti += "\n Referans Nokta çıktısı : " + noktaRef.toString();
     //   cikti += "\n Referans Daire çıktısı : " + dRef.toString();
        
        
        System.out.println(cikti);
        
    }
    
}

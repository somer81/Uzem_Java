/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolum3;

import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class Ortalama {
    
    int not = 0 ; 
    int ort = 0 ; 
    int sayac = 0 ;
    int toplamNot = 0; 
    String kursAdi = ""; 
    
    public Ortalama(String ad)
    {
      this.kursAdi = ad; 
    }
    
    public int OrtalamaHesapla()
    {
        Scanner girdi = new Scanner(System.in);
        
        while(sayac < 5){
            System.out.println("Bir Not giriniz : ");
            not = girdi.nextInt();
            toplamNot += not; 
            sayac++;
        }
        
        ort = toplamNot / 5 ; 
        
        return ort; 
    }
    
}

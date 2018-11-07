/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisantest;

/**
 *
 * @author Lenovo
 */
public class Calisan {
    
    private String ad;
    private String soyad; 
    public static int calisanSayisi; 
    
    public Calisan(String ad, String soyad)
    {
        
       ++calisanSayisi;        
       this.ad = ad ;
       this.soyad = soyad;
       
         System.out.println("Ad " + this.ad + " Soyad : " + this.soyad + " Eklendi. Çalışan Sayısı : " + String.valueOf(calisanSayisi));
    }
    
    public void finalize()
    {
       --calisanSayisi;
       System.out.println("Ad " + this.ad + " Soyad : " + this.soyad + " Silindi. Çalışan Sayısı : " + String.valueOf(calisanSayisi));
    }
    
    public String Ad() 
            {
              return this.ad; 
            }
    public String Soyad() 
            {
              return this.soyad; 
            }
    public static int CalisanSayisi() 
            {
              return calisanSayisi; 
            }
    
    
    
}

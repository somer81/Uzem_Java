/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanabstracttest;

/**
 *
 * @author Lenovo
 */
public abstract class Calisan {
    
    private String ad;
    private String soyad;
    private String SGN;
    
    public Calisan(String ad,String soy, String sgk)
    {
      this.ad = ad ; 
      soyad = soy ; 
      SGN = sgk; 
    }
            
      public void setAd(String ad)
      { 
         this.ad = ad; 
      }
    
      public String getAd() {return ad;}
      
       public void setSoyad(String soy)
      { 
         this.soyad = soy; 
      }
    
      public String getSoyad() {return soyad;}
      
       public void setSGN(String sgk)
      { 
         this.SGN = sgk; 
      }
    
      public String getSGN() {return SGN;}
      
      public String toString()
      {
         return getAd() + " " + getSoyad() + "\n SGN : " + getSGN();
         
      }
      
      public abstract double maas();
}

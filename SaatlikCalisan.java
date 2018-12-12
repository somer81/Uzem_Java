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
public class SaatlikCalisan extends Calisan{
    
    private double saatlikUcret;
    private double saat;  // Haftada kaç saat 
    
    public SaatlikCalisan(String ad,String soy, String sgk, double sucrt, double cs)
    {
     super(ad, soy, sgk);
     setSaatlikUcret(sucrt);
     setSaat(cs);
     
    }
    public void setSaatlikUcret(double sucrt)
    {
      saatlikUcret = sucrt < 0.0 ? 0.0 : sucrt;
    }
    
      public double getSaatlikUcret()
    {
      return saatlikUcret;
    }
      
    public void setSaat(double calisilanSaat)
    {
       this.saat = (calisilanSaat >=0.0 && calisilanSaat <= 168.0)? calisilanSaat : 0.0;
    }
    
    public double getSaat()
    {
      return saat;
    }
    
     public double maas()
      {
       
          if(saat <= 40) return saatlikUcret * saat;
       else 
           return 40 * saatlikUcret + (saat - 40) * saatlikUcret * 1.5;
      }
     
     public String toString()
     {
        return "\n Saatlk Çalişan : " + super.toString() + " maaş : "  + maas();
     }
    
}

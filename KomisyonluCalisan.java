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
public class KomisyonluCalisan extends Calisan{
    
    private double toplamSatis; 
    private double komisyonOran;
    
    
    public KomisyonluCalisan(String a, String s, String sgk, double tsat, double ko)
    {
       super(a,s,sgk);
        setKomisyonOran(ko);
        setToplamSatis(tsat);
       
       
    }
    
    public void setToplamSatis(double ts)
    {
        toplamSatis =  ( ts < 0.0 ) ? 0.0 : ts; 
    }
    
    public double getToplamSatis()
    {
       return toplamSatis;
    }
    
    
     public void setKomisyonOran(double ko)
    {
        komisyonOran =  (ko >0 && ko <=1)? ko : 0.0 ; 
    }
    
    public double getKomisyonOran()
    {
       return komisyonOran;
    }
    
    public double maas()
    {
        return getKomisyonOran() * getToplamSatis();
    }
    
    public String toString()
    {
       return "\n Komisyonlu Çalışan : " + super.toString() + " maaş : "  + maas();  
    }
}

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
public class MaasliCalisan extends Calisan{
    
    private double haftalikUcret;
    
    public MaasliCalisan(String ad,String soy, String sgk, double ucret)
    {
        super(ad, soy, sgk);
        setHaftalikUcret(ucret);
    }
    
    public void setHaftalikUcret(double ucrt)
    {
      haftalikUcret = ucrt < 0.0 ? 0.0 : ucrt;
    }
    
      public double getHaftalikUcret()
    {
      return haftalikUcret;
    }
      
      public double maas()
      {
        return getHaftalikUcret() * 4 ;
      }
      
      public String toString()
      {
       return "\n Maaşlı Çalışan : " + super.toString() + " maaş : "  + maas();
      }
      
}

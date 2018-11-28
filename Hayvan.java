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
public class Hayvan {
    
    private int bacakSayisi;
    public static int hayvanSayisi;
    protected String hayvanTur;
    
    public Hayvan(){}
    
    public Hayvan(int bs)
    {
      bacakSayisi = bs; 
      hayvanTur = "Hayvan";
      hayvanSayisi++;
    }
    
    public void HareketEt()
    {
        System.out.println("Hareket Ediyorum");
    }
    
     public void SesCikar()
    {
        System.out.println("Hayvan Sesleri");
    }
    public String toString()
    {
        return "Bacak Sayısı  " + bacakSayisi + " Tür : " + hayvanTur;
    }
    
    
}

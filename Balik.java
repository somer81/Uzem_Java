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
public class Balik extends Hayvan{
    
    public Balik(int bs)
    {
       super(bs);
       hayvanTur = "Balik";
    }
    
    public String toString(){
       return super.toString();
    }
    
      public void SesCikar()
    {
        System.out.println("Glug glıg");
    }
    
    public void HareketEt()
    {
        System.out.println("Yüzüyorum !");
    }
    
}

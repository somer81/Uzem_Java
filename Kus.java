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
public class Kus extends Hayvan{
     public Kus(int bs)
    {
       super(bs);
       hayvanTur = "Kus";
    }
    
    public String toString(){
       return super.toString();
    }
    
     public void HareketEt()
    {
        System.out.println("Uçuyorum !");
    }
     
       public void SesCikar()
    {
        System.out.println("Cik Cik");
    }
}

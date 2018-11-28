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
public class Kopek extends Hayvan{
    public Kopek(int bs)
    {
       super(bs);
       hayvanTur = "Kopek";
    }
    
    public String toString(){
       return super.toString();
    }
    
     public void HareketEt()
    {
        System.out.println("Koşuyorum !");
    }
     
       public void SesCikar()
    {
        System.out.println("Hav Hav");
    }
}

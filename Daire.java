/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altustsinif;

/**
 *
 * @author Lenovo
 */
public class Daire extends Nokta{
    
    private double yc;
    
    public Daire(){}
    
    public Daire(int xDeger,int yDeger, double yaricap)
    {
       
        super(xDeger,yDeger);
        // x = xDeger;
       // y = yDeger; 
        setYC(yaricap);
        
    }
    
    public void setYC(double yc)
    {
       this.yc = (yc<0.0)? 0.0 : yc;
    }
    
    public double getYC()
    {
      return yc;
    }
    
    public double Cap()
    {
       return 2 * getYC();
    }
    
   public double Cevre()
   {
      return Math.PI * Cap(); 
   }
   
   public double Alan()
   {
       return Math.PI * yc * yc;
   }
   
   public String toString()
   {
      return super.toString() + " yarıçap : " + getYC();
   }
}

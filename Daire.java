/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altustsiniftest;

/**
 *
 * @author Lenovo
 */
public class Daire extends Nokta{
    
    private double r;
    
    public Daire(){}
    public Daire(int x, int y, double r)
    {
       super(x,y); 
       setR(r) ;  
   }
    
    public void setR(double d)
    {
       this.r = d;
    }
    
    public double getR()
    {
       return this.r;
    }
    
    public String toString()
    {
        return super.toString() + " r : " + getR();
    }
}

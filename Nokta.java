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
public class Nokta extends Object{
    private int x; 
    private int y; 
    
    Nokta(){}
    Nokta(int x, int y)
    {
       setX(x);
       setY(y);
    }
    
    public int getX()
    {
       return this.x;
    }
    public void setX(int x)
    {
       this.x = x; 
    }
     public int getY()
    {
       return this.y;
    }
    public void setY(int y)
    {
       this.y = y; 
    }
    
    public String toString()
    {
       return "[x: " + getX() + " y: " + getY() + "]" ; 
    }
    
    
}

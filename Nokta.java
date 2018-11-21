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
public class Nokta {
    
    private int x;
    private int y;
    
    public Nokta(){}
    public Nokta(int xDeger, int yDeger)
     {
        x = xDeger;
        y = yDeger;
     }
    
    public int getX()
      {
         return x;
      }
    public void setX(int xDeger)
      {
          x = xDeger;
      }
    public int getY()
      {
         return y;
      }
    public void setY(int yDeger)
      {
         y = yDeger;
      }
    
    public String toString()
    {
     return "x: " + getX() + ", y: " + getY() ;   
    }
    
    
}


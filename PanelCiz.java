/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolum4;

import sun.java2d.loops.DrawLine;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class PanelCiz extends JPanel{
    
     public void bilesenCiz(Graphics g)
    {
        
        super.paintComponent(g);
        
        int genislik = getWidth();
        int yukseklik = getHeight();
        
        g.drawLine(0, 0, genislik, yukseklik);
        g.drawLine(0, yukseklik, genislik, 0);
    }
    
}

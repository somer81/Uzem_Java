/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altustsinif;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AltUstSinif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Daire d1 = new Daire(10, 20, 3.0);
        JOptionPane.showMessageDialog(null, d1.toString());
    }
    
}

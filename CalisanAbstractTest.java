/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanabstracttest;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Lenovo
 */
public class CalisanAbstractTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat ikiHane = new DecimalFormat("0.00");
        Calisan calisanlar[] = new Calisan[3];
        
        calisanlar[0] = new MaasliCalisan("Ömer", "Sevinç", "68-465-464", 6000.00);
        calisanlar[1] = new KomisyonluCalisan("Doğukan", "Yalçınkaya", "848-43-54", 10000.00, 0.5);
        calisanlar[2] = new SaatlikCalisan("Ahmet","Eroğlu","3543-543-545", 55.00, 140);
        
        
        String cikti = "";
        
        for(int i =0; i<calisanlar.length; i++)
        {
          cikti += calisanlar[i].toString();
              
        }
        
        for(int j=0; j< calisanlar.length;j++)
        {
            cikti += "\n Çalışan " + j + " bir " + calisanlar[j].getClass().getName();
        }
        
        JOptionPane.showConfirmDialog(null, cikti);
        System.exit(0);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package bolum3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */





public class Bolum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        Ortalama o1 = new Ortalama("Matematik"); 
       // String sonuc = String.valueOf(o1.OrtalamaHesapla());
        System.out.printf("Bu dersin Sınıf Ortaması : %d", o1.OrtalamaHesapla());
        
        /*    String sonuc,sayi1,sayi2;
        
        sayi1 = JOptionPane.showInputDialog("İlk Sayıyı giriniz");
        sayi2 = JOptionPane.showInputDialog("İkinci Sayıyı giriniz");
        
        int s1,s2 ; 
        
        s1 = Integer.parseInt(sayi1);
        s2 = Integer.parseInt(sayi2);
        sonuc = "";
        if(s1 == s2)
        {
         sonuc += String.valueOf(s1) + " == " + String.valueOf(s2) + "\n";
        }
        if(s1 != s2)
        {
        sonuc += String.valueOf(s1) + " != " + String.valueOf(s2) + " \n";
        }
        if(s1 <= s2)
        {
        sonuc += String.valueOf(s1) + " <= " + String.valueOf(s2) + "  \n";
        }
        if(s1 >= s2)
        {
        sonuc += String.valueOf(s1) + " >= " + String.valueOf(s2) + " \n";
        }
        
        
        JOptionPane.showMessageDialog(null, sonuc);  */
        
        // TODO code application logic here
    }
    
}

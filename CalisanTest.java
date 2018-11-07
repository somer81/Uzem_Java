/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisantest;


import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class CalisanTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sonuc = ""; 
        
        sonuc += "\n Başlangıç eleman Sayısı " + Calisan.CalisanSayisi();
        
        Calisan c1 = new Calisan("Ömer","SEVİNÇ");
        
        sonuc += "\n Çalışsan Sayısı : " + c1.CalisanSayisi();
        
        Calisan c2 = new Calisan("Ahmet","Doğukan");
        
        
        sonuc += "\n Çalışsan Sayısı : " + c2.CalisanSayisi();
        
       
        c1 = null;
        c2 = null;
        
        System.gc();
        sonuc += "\n System GC den sonra Çalışsan Sayısı : " + Calisan.CalisanSayisi();
        
        System.gc();
        JOptionPane.showMessageDialog(null, sonuc);
        
    }
    
}

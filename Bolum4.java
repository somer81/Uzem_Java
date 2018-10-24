/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolum4;

/**
 *
 * @author Lenovo
*/

import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Graphics;

class Analiz{
 
    public void AnalizYap()
    {
       int basarili, basarisiz,toplam;
       
        System.out.println("basarili için 1 başarısız için 2 giriniz : ");
        Scanner notu = new Scanner(System.in);
        basarili  = 0; 
        basarisiz = 0 ; 
        toplam = 0 ;
        for(int i = 0 ; i< 10; i++)
       {
           
          int durum = notu.nextInt();
          if(durum == 1)
              basarili++;
          else if (durum == 2)
              basarisiz++;
          toplam++;
       }
       System.out.printf(" Toplam öğrenci Sayısı : %d , Başarılı : %d , Başarısız : %d" , toplam,basarili,basarisiz);
       
       if(basarili >= 8 )
            System.out.println("Sınıf Başarılı");
    }

}

public class Bolum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Analiz a = new Analiz();
      //  a.AnalizYap();
        Graphics g;
        PanelCiz pc = new PanelCiz();
      //  pc.bilesenCiz(g);
        JFrame jf = new JFrame();
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(pc);
        jf.setSize(250, 250);
        jf.setVisible(true);
        
    }
    
}

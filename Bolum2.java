import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bolum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  int a, b ; 
        
        Scanner deger = new Scanner(System.in);
        
        System.out.println("Birinci Sayıyı Girniz : ");
        a = deger.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        b = deger.nextInt();
        
        if(a == b )
            System.out.printf("%d sayısı  %d sayısına eşittir \n", a,b);
        if(a != b)
            System.out.printf("%d sayısı  %d sayısına eşit değildir \n", a,b);
        if(a <= b )
            System.out.printf("%d sayısı  %d sayısından küçük eşittir \n", a,b);
        if(a >= b)
            System.out.printf("%d sayısı  %d sayısından büyük eşittir \n", a,b);
        if(a < b )
            System.out.printf("%d sayısı  %d sayısından küçüktür \n", a,b);
        if(a > b)
            System.out.printf("%d sayısı  %d sayısından büyüktür \n", a,b);
        
        */ 
      
        String sayi1 = JOptionPane.showInputDialog("İlk değeri Giriniz : ");
        String sayi2  = JOptionPane.showInputDialog("İkinci Değeri Giriniz : "); 
        
        int sonuc = Integer.parseInt(sayi1) + Integer.parseInt(sayi2);
        
        JOptionPane.showMessageDialog(null, "Sonuç : " + sonuc);
                 
        
        
        
    }
    
}

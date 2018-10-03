/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolum1;

/**
 *
 * @author Lenovo
 */

class Ogrenci {
     public String ad; 
     public String no;
     public String bolum; 
     
     public Ogrenci(){  // Kurucu metod Constructor
        ad = "bos";
        no = "bos";
        bolum = "bos";
                
     }
     
     public Ogrenci(String a , String n, String b){  // Kurucu metod Constructor
        ad = a;
        no = n;
        bolum = b;
                
     }
     
     public void BilgiYaz(){
         System.out.println(this.ad + " " + this.no);  
     }
     
}

public class Bolum1 {  // Burası Java programımızın Sınıf tanımı yaptığımız yer  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ogrenci o1 = new Ogrenci();
        Ogrenci o2 = new Ogrenci();
        Ogrenci o3 = new Ogrenci("Hakan Can","232323232","bilgisayar");
                
        o1.ad = "Ufuk Gülçnio"; 
        o1.no = "554654654";
        o1.bolum = "İnternet ve Ağ Teknolojileri";
        
        
        int a,b;
        a = 10;
        b = 20; 
        
        
        
        System.out.println("a ve b  sayısının çarpımı : " + a * b );  // + işareti string birleştirmek için kullaılır 
        System.out.println("Uzem de bir java programlama ! ... "); // Ekrana çıktı oluşturur 
        System.out.println(o1.ad + " " + o1.no + " " + o1.bolum);
        o1.BilgiYaz();
        
        System.out.println(o2.ad + " " + o2.no + " " + o2.bolum);
        
        o3.BilgiYaz();
    }
    
}

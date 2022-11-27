/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package01;

/**
 *
 * @author ASUS Bakar
 */
public class Mobil {
    String pabrikan;
    String type;
    String warna;

  

    
    void maju(){
        System.out.println("Bergerak Maju");
    }
    void mundur(){
        System.out.println("Bergerak Mundur");
    }
    void parkir(){
        System.out.println("Bergerak parkir");
    }
     public static void main(String[] args) {
         
         //membuat objek dari sebuah kelas =instasiasi
         Mobil mobil =new Mobil();//contructor ,subuah function yang namansya sama dengan nama kelas
         mobil.warna="Biru";
         mobil.pabrikan="Avanza";
         mobil.type="TRD";
         
         System.out.println("TOYOTA " + mobil.pabrikan);
         mobil.maju();
         mobil.mundur();
         mobil.parkir();
         
         Mobil honda =new Mobil();
              
         honda.warna="Biru";
         honda.pabrikan="Avanza";
         honda.type="TRD";
         System.out.println("TOYOTA " + honda.pabrikan);
         honda.maju();
         honda.mundur();
         honda.parkir();
         
         
    }

}

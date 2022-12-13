package com.azharlasena.praktikumpbo.pertemuan4.tugas;

public class NPC {
    
    //Attribute (variabel)
    String nama;
    int umur;
    String Scolor;
    int tinggi;
    
    //Method 
    public void interaksi(){
        System.out.println("NPC " + nama + " Berinteraksi !");
    }
    
    //Method ini yang akan dijalankan jika method dengan parameter string tidak diisi
    public void jalan(){
        System.out.println("NPC " + nama + " Berjalan !");
    }
    
    //Ini adalah method overloading jika parameter string diisi
    //Program akan menjalankan yang ini
    public void jalan(String jln){
        System.out.println("NPC " + nama + " " + jln);
    }
    
    public void showInfo(){
        System.out.println("Nama     : " + nama);
        System.out.println("Umur     : " + umur);
        System.out.println("Skin     : " + Scolor);
        System.out.println("Tinggi   : " + tinggi + "cm");
        extraInfo();
    }
    
    //Method ini Polymorphism Overriding, 
    //Jika objek dari class ini dipanggil maka ini yang dimunculkan oleh program
    public void senjata(){
        System.out.println(nama + " tidak mempunyai senjata !");
    }
    
    //Ini termasuk override
    public void extraInfo(){
    
    }
}

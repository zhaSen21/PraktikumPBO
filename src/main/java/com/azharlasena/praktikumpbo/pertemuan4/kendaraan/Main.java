package com.azharlasena.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        
        //Pembuatan object
        Mobil bmw = new Mobil();
        Kendaraan rwd = new Kendaraan();
        Motor m1 = new Motor();
        
        //Menambahkan nilai attribute
        bmw.nama = "BMW M3 GTR";
        bmw.jmlRoda = 4;
        bmw.maxGear = 6;
        
        rwd.nama = "RX-7";
        rwd.jmlRoda = 4;
        
        m1.nama = "Kawasaki";
        m1.jmlRoda = 2;
        m1.paint = "Hijau";
        
        //Uji coba Method pemanggilan
        bmw.showInfo();
        System.out.println("");
        bmw.belok("kiri");
        bmw.belok();
        
        rwd.showInfo();
        
        System.out.println("-");
        m1.showInfo();
        m1.kenalpot("Racing");
        m1.modif("Swap Engine");
        
    }
}

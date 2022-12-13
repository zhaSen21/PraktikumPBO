package com.azharlasena.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
    
    //Attribute (variable)
    String nama;
    int jmlRoda;
    
    //Method
    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + " Telah dinyalakan!");
    }
    
    //Method pemanggilan
    public void showInfo(){
        System.out.println("Nama     : " + nama);
        System.out.println("Jml Roda : " + jmlRoda);
        extraInfo();
    }
    
    public void extraInfo(){}
}

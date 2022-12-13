package com.azharlasena.praktikumpbo.pertemuan4.tugas;

//Inheritance, Police adalah Child class dari Parent Class NPC
public class Police extends NPC {
    String rank;
    int YOService;
    
    public void senjata(){
        System.out.println("Polisi " + nama + " mengeluarkan pistol !");
    }
    
    public void bertugas(){
        System.out.println("Polisi " + nama + " sedang bertugas !");
    }
    
    public void tersedia(){
        System.out.println("Polisi " + nama + " siap menerima perintah !");
    }
    
    public void extraInfo(){
        System.out.println("Rank : " + rank);
        System.out.println("Year Of Service : " + YOService);
    }
    
}

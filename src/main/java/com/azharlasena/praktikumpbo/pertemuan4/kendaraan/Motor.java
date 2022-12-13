package com.azharlasena.praktikumpbo.pertemuan4.kendaraan;

public class Motor extends Kendaraan {
    
    String paint;
    
    public void kenalpot(String mber){
        System.out.println("Kenalpot Racing/Stock : " + mber);
    }
    
    public void modif(String mod){
        System.out.println("Modif : " + mod);
    }
    
    public void extraInfo(){
        System.out.println("Warna : " + paint);
    }
    
}

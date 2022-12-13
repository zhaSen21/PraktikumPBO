package com.azharlasena.praktikumpbo.pertemuan5;

public class Array1 {

    public static void main(String[] args) {
//        Pembuatan Array
        String[] nama = new String[3];

//        Cek Panjang Array
        System.out.println("Panjang array : " + nama.length);
        
        //Memasukkan nilai ke array
        nama[0] = "Zhar";
        nama[1] = "Gou";
        nama[2] = "Zini";
        
        //Menampilkan semua nilai array
        for (int i = 0; i < nama.length; i++) {
            System.out.println(i + " : " + nama[i]);
        }
        
    }
}

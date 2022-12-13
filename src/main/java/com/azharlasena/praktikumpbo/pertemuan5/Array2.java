package com.azharlasena.praktikumpbo.pertemuan5;

public class Array2 {

    public static void main(String[] args) {
//        Pembuatan Array
        String[] nama = {"Zhar" , "Gou" , "Zin"};

//        Cek Panjang Array
        System.out.println("Panjang array : " + nama.length);

        //Menampilkan semua nilai array
        for (int i = 0; i < nama.length; i++) {
            System.out.println(i + " : " + nama[i]);
        }

    }
}

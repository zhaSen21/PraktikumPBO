package com.azharlasena.praktikumpbo.pertemuan6;

public class Basic {

    int angka = 1;

    public static void main(String[] args) {

//        Membuat array berisi 3
        int[] myNumbers = {1, 2, 3,};
        try {
//        Uji coba print nilai array dari index ke-10
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Wrong Index Size");
        }

    }
}

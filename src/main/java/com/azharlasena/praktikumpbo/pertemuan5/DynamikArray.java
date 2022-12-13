package com.azharlasena.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DynamikArray {

    public static void main(String[] args) {
        //Deklarasi Scanner untun input user
        Scanner input = new Scanner(System.in);
        
        //Membuat agar panjang array ditentukan oleh input user
        System.out.println("== Program Input Nilai Array ==");
        System.out.print("Masukkan jumlah matkul : ");
        int jml = input.nextInt();
        System.out.println();
        
        //Membuat array baru dengan panjang sesuai input user
        int[] nilai = new int [jml];
        
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        
        System.out.println();
        
        //Menampilkan Nilai Array
        System.out.println("== Daftar Nilai ==");
        for (int i = 0; i < jml; i++) {
            System.out.println(i + " : " + nilai[i]);
        }
        
        //Proses Penghitungan Rata Rata Nilai
        double hasil = 0;
        
        for (int i = 0; i < jml; i++) {
            hasil = nilai[i]++;
        }
        
        hasil = hasil / jml;
        
        System.out.println("Rata rata nilai : " + hasil);
        
    }

}

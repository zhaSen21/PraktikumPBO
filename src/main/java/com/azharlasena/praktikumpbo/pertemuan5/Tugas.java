package com.azharlasena.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) {

        //Deklarasi Scanner untun input user
        Scanner input = new Scanner(System.in);

        //  User diminta untuk memasukkan jumlah hari yang akan dihitung rata ratanya
        System.out.println("Program Penghitung Rata rata Views berdasarkan jumlah video");
        System.out.print("Masukkan Jumlah Video : ");
        int jml = input.nextInt();

        System.out.println();

        //  Membuat array baru dengan panjang sesuai input user
        int[] hasil = new int[jml];

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan Views Video " + (i + 1) + " : ");
            hasil[i] = input.nextInt();
        }
        
        System.out.println();
        
        //Menampilkan Nilai Array
        System.out.println("Daftar Views Video beserta Rata-rata Views");
        for (int i = 0; i < jml; i++) {
            System.out.println(i + " : " + hasil[i]);
        }
        
        double rataviews = 0;
        
        for (int i = 0; i < jml; i++) {
            rataviews = hasil[i]++;
        }
        
        rataviews = rataviews / jml;
        
        System.out.println("Rata rata Views : " + rataviews);

    }
}

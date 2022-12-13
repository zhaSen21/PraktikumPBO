package com.azharlasena.praktikumpbo.pertemuan4.tugas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;
        char ulang = 'y';

        //Menambahkan object
        Police p1 = new Police();
        NPC c1 = new NPC();

        //Menambahkan nilai attribute
        p1.nama = "Adit";
        p1.umur = 27;
        p1.tinggi = 175;
        p1.Scolor = "White";
        p1.YOService = 5;
        p1.rank = "Officer";

        c1.nama = "Uzia";
        c1.umur = 19;
        c1.tinggi = 170;
        c1.Scolor = "Brown";

        //Membuat Menu yang berulang
        do {

            System.out.println("Selamat datang");
            System.out.println("1. Parent Class");
            System.out.println("2. Child Class");
            System.out.println("3. Inheritance");
            System.out.println("4. Polymorphism");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:

                    System.out.println("Ini adalah parent class beserta attribute dan nilainya");
                    c1.showInfo();
                    c1.interaksi();

                    break;

                case 2:

                    System.out.println("Ini adalah child class beserta attribute dan nilainya");
                    p1.showInfo();
                    p1.interaksi();
                    p1.bertugas();
                    System.out.println("///");
                    p1.tersedia();

                    break;

                case 3:

                    System.out.println("Attribute diturunkan dari Parent class : ");
                    System.out.println("Nama     : " + p1.nama);
                    System.out.println("Umur     : " + p1.umur);
                    System.out.println("Skin     : " + p1.Scolor);
                    System.out.println("Tinggi   : " + p1.tinggi + "cm");
                    System.out.println();
                    System.out.println("Attribute tambahan dari child class : ");
                    System.out.println("Rank : " + p1.rank);
                    System.out.println("Year Of Service : " + p1.YOService);

                    break;

                case 4:
                    
                    System.out.println("Polymorphism Overloading : ");
                    c1.jalan();
                    System.out.println();
                    System.out.println("Memakai parameter string : ");
                    c1.jalan("Ke Kota");
                    System.out.println();
                    
                    System.out.println("Polymorphism Overriding : ");
                    c1.senjata();
                    System.out.println();
                    System.out.println("Menulis kembali di child class Police");
                    p1.senjata();

                    break;

                default:

                    break;
            }

            System.out.print("Ingin memilih menu lain (y/t)? ");
            ulang = input.next().charAt(0);
            System.out.println();

        } while (ulang != 't');

        System.out.println("Thank you!");
    }
}

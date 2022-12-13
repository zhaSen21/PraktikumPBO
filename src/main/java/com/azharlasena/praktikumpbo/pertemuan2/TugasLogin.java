package com.azharlasena.praktikumpbo.pertemuan2;

import java.util.Scanner;

public class TugasLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username;
        String password;
        String username1 = null;
        String password1 = null;
        String username2 = "ittp";
        String password2 = "praktikum";
        int attempt = 3;
        do {

            System.out.println("Menu Utama Sistem Login");
            System.out.println("1. Login");
            System.out.println("2. Daftar");
            System.out.print("Silahkan Pilih : ");
            int pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    
                    System.out.println("Login");
                    System.out.println("Hint : User = ittp - Pass = praktikum");
                    input.nextLine();
                    System.out.print("Masukkan Username : ");
                    username = input.nextLine();
                    
                    System.out.print("Masukkan Password : ");
                    password = input.nextLine();
                    
                    if (username.equals(username1) && password.equals(password1) || username.equals(username2) && password.equals(password2)){
                       
                        System.out.println("Selamat Datang " + username + " !");
                        System.out.println("1. Play");
                        System.out.println("2. Settings");
                        attempt = 0;
                        
                    } else {
                        attempt--;
                        System.out.println("Password Salah! Sisa Percobaan " + attempt + "x");
                    }
                    break;
                
                case 2:
                    System.out.println("Menu Daftar");
                    input.nextLine();
                    System.out.print("Masukkan Username : ");
                    username1 = input.nextLine();
                    System.out.print("Masukkan Password : ");
                    password1 = input.nextLine();

                    break;

                default:

                    break;
            }
            
        } while (attempt != 0);
        
        System.out.println("Waktu percobaan habis !!!");
        System.out.println("Terima kasih !");
    }
}
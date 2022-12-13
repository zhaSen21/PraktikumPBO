package com.azharlasena.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            //User Diminta memasukkan bilangan
            System.out.println("Masukkan Bilangan : ");
            int bilangan = input.nextInt();

            System.out.println("Masukkan Pembagi : ");
            int pembagi = input.nextInt();

            //Proses pembagian
            int hasil = bilangan / pembagi;

            //Menampilkan output
            System.out.println(bilangan + " / " + pembagi + " = " + hasil + " (Dibulatkan)");

        } catch (ArithmeticException e) {
            System.out.println("Error : Tidak dapat memproses!");
        } catch (InputMismatchException e) {
            System.out.println("Error : Masukkan angka saja!");
        }
    }
}

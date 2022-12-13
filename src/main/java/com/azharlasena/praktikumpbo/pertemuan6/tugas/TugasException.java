package com.azharlasena.praktikumpbo.pertemuan6.tugas;

public class TugasException {

    public static void main(String[] args) {

        try {

            Object x[] = new String[3];
            x[0] = new Integer(0);

        } catch (ArrayStoreException e) {
            System.out.println("Pemberian Nilai Harus sesuai dengan tipe datanya !");
        }
    }
}

//        
//        } 
//             O
//
//            
//
//            
//            
//            

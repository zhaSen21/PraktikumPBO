package com.azharlasena.praktikumpbo.pertemuan3.Tugas;

public class Main {
    public static void main(String[] args) {
        //Membuat Object dari Class TechnicalTeam dan Studio
        TechnicalTeam prog1 = new TechnicalTeam ("Nanda",18,"2019",17000000);
        TechnicalTeam prog2 = new TechnicalTeam ("Darius",19,"2016",40000000);
        TechnicalTeam prog3 = new TechnicalTeam ("Uzia",20,"2017",32000000);
        
        Studio std1 = new Studio("Kubo Studios",2015,"Singapore");
        Studio std2 = new Studio("KingCube Studio",2012,"Europe");
        Studio std3 = new Studio("Origin Realms",2014,"Canada");
        
        //Pemanggilan rinci setiap objek dari kedua class
        prog1.ShowProfile();
        System.out.println("");
        prog2.ShowProfile();
        System.out.println("");
        prog3.ShowProfile();
        
        System.out.println("");
        
        std1.ShowProfile();
        System.out.println("");
        std2.ShowProfile();
        System.out.println("");
        std3.ShowProfile();
        
        System.out.println("");
        
        //Menggabungkan data data dari beberapa class
        System.out.println("Programmer : " + prog1.getNama());
        System.out.println("Usia : " + prog1.getUmur());
        System.out.println("Bekerja di : " + std1.getNama());
        System.out.println("Dari Tahun : " + prog2.getTahunBergabung());
        System.out.println("Gaji per project : " + prog1.getGaji());
        System.out.println("");
        
        //Mengganti data yang salah 
        System.out.println("Mengganti 'Dari Tahun' oleh programmer Nanda untuk memperbaiki data");
        prog2.setTahunBergabung("2019");
        System.out.println("'Dari Tahun' telah diganti sekarang menjadi : " + prog2.getTahunBergabung());
        
    }
}

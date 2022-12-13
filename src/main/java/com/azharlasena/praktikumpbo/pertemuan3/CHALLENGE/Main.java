package com.azharlasena.praktikumpbo.pertemuan3.CHALLENGE;

public class Main {
    
    public static void main(String[] args) {
        
        //Membuat object dari class Animal
        Library Perpus1 = new Library("Republic Indonesian Library",420,1778);
        Library Perpus2 = new Library("Soeman HS Library",352,2008);
        Library Perpus3 = new Library("Indonesia University Library",69,2011);
        Library Perpus4 = new Library("Grhtama Library",911,2016);
        
        //Memanggil Method
        Perpus1.showProfile();
        Perpus2.showProfile();
        Perpus3.showProfile();
        Perpus4.showProfile();
        
        System.out.println("");
        
        //Mengganti nama perpustakaan
        System.out.println("Nama Perpustakaan 1 sebelumnya: " + Perpus1.getName());
        Perpus1.setName("Freedom Institute Library");
        System.out.println("Nama Perpustakaan 1 setelah diganti (setName) : " + Perpus1.getName());
        Perpus1.showProfile();
        
        //Kita juga bisa mengganti semua nama, visitorsToday, yearBuilt 
        //selama kita memasukkan Getter dan Setter
        
    }
    
}

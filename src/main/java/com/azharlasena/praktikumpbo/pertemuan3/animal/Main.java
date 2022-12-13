package com.azharlasena.praktikumpbo.pertemuan3.animal;

public class Main {
    public static void main(String[] args) {
        
        //Membuat object dari class Animal
        Animal cat = new Animal("Miyo",3,"White");
        Animal dog = new Animal("Roger",69,"Blacky");
        Animal rabbit = new Animal("Bunbun",2,"Grey");
        Animal dragon = new Animal("Buff",50,"Red");
        
        //Memanggil Method
        cat.ShowProfile();
        dog.ShowProfile();
        rabbit.ShowProfile();
        dragon.ShowProfile();
        
        System.out.println("Dog's name (before setName) : " + dog.getNama());
        dog.setNama("Shepherd");
        System.out.println("Dog's name (after setName) : " + dog.getNama());
    }
}

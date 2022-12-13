package com.azharlasena.praktikumpbo.pertemuan3.animal;

public class Animal {
    //Atribut
    private String nama;
    private int age;
    private String color;

    public Animal() {
    }

    //Constructor
    public Animal(String nama, int age, String color) {
        this.nama = nama;
        this.age = age;
        this.color = color;
    }

    //Method mencetak semua attribute
    protected void ShowProfile() {
        System.out.println("Name : " + nama);
        System.out.println("Age : " + age);
        System.out.println("Color : " + color);
        System.out.println();

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}

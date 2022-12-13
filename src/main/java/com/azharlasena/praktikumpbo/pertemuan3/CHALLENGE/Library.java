package com.azharlasena.praktikumpbo.pertemuan3.CHALLENGE;

public class Library {

    //Ada variabel private dan public
    private String name;
    private int visitorsToday;
    int yearBuilt;

    public Library() {

    }

    //Constructor
    public Library(String name, int visitorsToday, int yearBuilt) {
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }

    //Method mencetak semua attribute
    public void showProfile() {
        System.out.println("Nama : " + name);
        System.out.println("Today Visitor : " + visitorsToday);
        System.out.println("Year Built : " + yearBuilt);
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

}

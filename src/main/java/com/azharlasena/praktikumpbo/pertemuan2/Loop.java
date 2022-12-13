package com.azharlasena.praktikumpbo.pertemuan2;

public class Loop {

    public static void main(String[] args) {
        
        for (int i = 1; i < 6; i++) {
            System.out.println("Looping... (" + i + "/5)");
            
        }
        System.out.println("For loop selesai! \n");
        
    
    int j = 0;
    while(j<5){
            System.out.println("Looping... (" + j + "/5)");
            j++;
    
            
}
    System.out.println("While Loop selesai! \n");
    
    int k=0;
    do{
            System.out.println("Looping... (" + k + "/5)");
            k++;            
    } while(k<5);
        System.out.println("Do-While loop selesai! \n");
    }
}

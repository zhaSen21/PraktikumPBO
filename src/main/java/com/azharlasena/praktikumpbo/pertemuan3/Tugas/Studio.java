package com.azharlasena.praktikumpbo.pertemuan3.Tugas;

public class Studio {

    private String nama;
    private int tahun;
    private String asal;

    public Studio(String nama, int tahun, String asal) {
        this.nama = nama;
        this.tahun = tahun;
        this.asal = asal;
    }

    protected void ShowProfile() {
        System.out.println("Nama : " + nama);
        System.out.println("Berdiri Tahun : " + tahun);
        System.out.println("Berasal : " + asal);

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
    
    

}

package com.azharlasena.praktikumpbo.pertemuan3.Tugas;

public class TechnicalTeam {
    //deklarasi variabel
    private String nama;
    private int umur;
    private String tahunBergabung;
    private int gaji;

    //Constructor
    public TechnicalTeam(String nama, int umur, String tahunBergabung, int gaji) {
        this.nama = nama;
        this.umur = umur;
        this.tahunBergabung = tahunBergabung;
        this.gaji = gaji;
    }
    
    //Untuk Pemanggilan data class Technical Team
    protected void ShowProfile(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Bergabung Tahun : " + tahunBergabung);
        System.out.println("Gaji : " + gaji);
    }

    //Getter and Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getTahunBergabung() {
        return tahunBergabung;
    }

    public void setTahunBergabung(String tahunBergabung) {
        this.tahunBergabung = tahunBergabung;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}

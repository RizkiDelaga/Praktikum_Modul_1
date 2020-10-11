package com.rizkidelagaprasetya.modul1.manusia;

public class manusia {
    private String nama;
    private int umur;

    // constructor pertama
    public manusia(){}

    // constructor kedua
    public manusia(String nama){
        this.nama = nama;
    }

    // constructor ketiga
    public manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }


    // get & setter
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
}

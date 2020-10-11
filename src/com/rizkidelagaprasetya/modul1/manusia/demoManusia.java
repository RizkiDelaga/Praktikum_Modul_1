package com.rizkidelagaprasetya.modul1.manusia;

// class main
public class demoManusia {
    public static void main(String[] args) {
        // array of iobject
        manusia arrayMahasiswa[] = new manusia[3];
        
        // const pertama
        manusia manusia1 = new manusia();
        manusia1.setNama("rizki");
        manusia1.setUmur(19);
        
        // const kedua
        manusia manusia2 = new manusia("poimon");
        
        // const ketiga
        manusia manusia3 = new manusia("jaka", 12);
        

        arrayMahasiswa[0] = manusia1;
        arrayMahasiswa[1] = manusia2;
        arrayMahasiswa[2] = manusia3;

        for (manusia x: arrayMahasiswa) {
            System.out.println("karakter :");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
            System.out.println();
        }
    }
}

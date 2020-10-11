package com.rizkidelagaprasetya.modul1;

// Sebagai main / Demo Kelas
public class object {
    public static void main(String[] args) {
        // Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        String nama;
        mahasiswaTanpa.setNama("rizki delaga");
        mahasiswaTanpa.setNim(19104074);

        System.out.println("mahasiswa 1");
        System.out.println("nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("nim\t\t: " + mahasiswaTanpa.getNim());

        // deklarasi mengggunakan parameter
        Mahasiswa mahasiswa = new Mahasiswa("diamond", 42651161);
        System.out.println("mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());
    }
}

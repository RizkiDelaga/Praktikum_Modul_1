package com.rizkidelagaprasetya.modul1.pass;

public class passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        testPass pass = new testPass(50, 100); // deklarasi object

        // Awal // passed by value
        nomer1 = 10;
        nomer2 = 20;
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomer 1 = " + nomer1);
        System.out.println("Nomer 2 = " + nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai sesudah passed by value: ");
        System.out.println("Nomer1 = " + nomer1);
        System.out.println("Nomer2 = " + nomer2);
        // Akhir // passed by value


        // passed by referance
        System.out.println("Nilai sebelum passed by reference: ");
        System.out.println("pass.Nomer1 = " + pass.nomer1);
        System.out.println("Pass.Nomer2 = " + pass.nomer2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference: ");
        System.out.println("pass.Nomer1 = " + pass.nomer1);
        System.out.println("Pass.Nomer2 = " + pass.nomer2);
    }
}

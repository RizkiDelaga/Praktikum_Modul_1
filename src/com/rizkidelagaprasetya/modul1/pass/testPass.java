package com.rizkidelagaprasetya.modul1.pass;

public class testPass {
    int nomer1;
    int nomer2;

    public testPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    // pass by value. parameter berupa tipe data primitif
    public void calculate(int m, int n){
        m = m * 10;
        n = n / 2;
    }

    // pass by referance. parameter berupa tipe data class
    public void calculate(testPass pass){
        pass.nomer1 = pass.nomer1 * 10;
        pass.nomer2 = pass.nomer2 / 2;
    }
}

package com.company;

class Mahasiswa{
    String nama;
    String nim;
    float ip;

    Mahasiswa(String nama, String nim, float ip){
        this.nama = nama;
        this.nim = nim;
        this.ip = ip;

    }

    void PrintData(){
        System.out.println("\n Nama : "+nama +"\n NIM :"+nim+"\n IP : "+ip);
    }
    void ubahnama(String Newnama){
        this.nama= Newnama;
    }
    String getnama(){
        return this.nama;
    }


}


public class Main {
    public static void main(String[] args) throws Exception {

        Mahasiswa mhs1 = new Mahasiswa("Sofwan", "118140052", 4);

        //System.out.println();
        mhs1.PrintData();

        mhs1.ubahnama("Budi");

        mhs1.PrintData();
        //mhs1.getnama();

    }
}
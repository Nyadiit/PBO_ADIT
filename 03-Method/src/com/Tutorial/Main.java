package com.Tutorial;

class Mahasiswa{
    //Data Member
    String nama;
    String nim;
    String prodi;

    //construktor dengan parameter
    Mahasiswa (String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;

    }
    //Method tanpa parameter dan tanpa return
    void show(){
        System.out.println("nama : " + this.nama);
        System.out.println("nim : " + this.nim);
        System.out.println("prodi : " + this.prodi);

    }
    //Method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }
    //Method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }
    //Method dengan return dan parameter
    String sayHi (String pesan){
        return pesan + " im comeback again " + this.nama;
    }
    
}

public class Main {
    public static void main(String[] args){
        //Instansiasi objek
        Mahasiswa mhs1 = new Mahasiswa("Aditya Priyanto Samrani I.P ", "22241022",   
        "Pendidikan Teknologi Informas");
        System.err.println("INFORMASI PRIBADI");

        mhs1.show();
        mhs1.setNama("Kim Jong Un");
        mhs1.show();
        System.out.println(mhs1.getNama());
        String pesan = mhs1.sayHi("Hello");
        System.out.println(pesan);

        System.out.println("mahasiswa paling sopan santun terhadap temen dan dosen");
        System.out.println("KUMAHAA BARUDAKKK WELLLL: )");
    

    }
        
}

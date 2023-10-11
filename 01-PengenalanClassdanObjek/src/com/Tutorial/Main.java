package com.Tutorial;


class Mahasiswa{
    String Nama;
    String NIM;
    String Prodi;

}

public class Main {
    public static void main(String[] args) {
        //instansi pembuatan objek
        Mahasiswa mhs1 = new Mahasiswa();
        // atribut objek
        mhs1.Nama = "Adit";
        mhs1.NIM = "22241022";
        mhs1.Prodi = "PENDIDIKAN TEKNOLOGI INFORMASI";

        System.out.println("Nama Mahasiswa : " + mhs1.Nama);
        System.out.println("NIM :" + mhs1.NIM );
        System.out.println("Program Studi : " + mhs1.Prodi);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.Nama = "Kibul";
        mhs2.NIM = "22241042";
        mhs2.Prodi = "PENDIDIKAN TEKNOLOGI INFORMASI";

        System.out.println("Nama Mahasiswa : " + mhs2.Nama);
        System.out.println("NIM : " + mhs2.NIM);
        System.out.println("Program Studi : "+ mhs2.Prodi);
        
    }
}

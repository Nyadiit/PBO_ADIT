package com.Tutorial;
// clas tanpa kostruktor
class polos {
    String dataString;
    int dataInteger;
}

//class konstruktor
class Mahasiswa{
    String nama;
    String nim;
    String prodi;

    //Membuat Kontruktor
    // Mahasiswa(){
    //     System.out.println("Ini adalah Konstruktor");
    // }

        Mahasiswa (String inputNama, String inputNim, String inputProdi){
            nama = inputNama;
            nim = inputNim;
            prodi = inputProdi;

            System.out.println("NAMA :"+nama);
            System.out.println("Nim :"+nim);
            System.out.println("Prodi :"+prodi);

        }



    
}
public class Main {
     public static void main(String[] args) {
        System.out.println("java project");
        new Mahasiswa("Adit", "22241022", "Pendidikan Teknologi Informasi");
        //Memanggil Konstruktor
        //mhs1.Mahasiswa 

        // polos pls = new polos();
        // pls.dataString = "POLOS";
        // pls.dataInteger = 1000;

        // System.out.println("Isi Data String "+ pls.dataString);
        // System.out.println("Isi Data Integer"+ pls.dataInteger);


    } 
}  
   
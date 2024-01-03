package com.Tutorial;

class BangunDatar {

    float hitungLuas() {
        return 0;
    }

    float hitungKeliling() {
        return 0;
    }

}

// Subclass Persegi
class Persegi extends BangunDatar {
    float sisi;
// Getter dan setter 
    float getSisi() {
        return sisi;
    }

    void setSisi(float sisi) {
        this.sisi = sisi;
    }

    //Overriding 
    float hitungLuas() {
        return sisi * sisi;
    }

    //Overriding 
    float hitungKeliling() {
        return 4 * sisi;
    }

    void display() {
        System.out.println("Persegi");
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
// Subclass Lingkaran
class Lingkaran extends BangunDatar {
    float jariJari;

    // Getter dan setter 
    float getJariJari() {
        return jariJari;
    }

    void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    //overriding 
    float hitungLuas(){
        return (float) (Math.PI * jariJari * jariJari);
    } 

    //overriding 
    float hitungKeliling(){
        return (float) (2 * Math.PI * jariJari);
    }

    public void display() {

        System.out.println("Lingkaran:");
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
//subclass PersegiPanjang
class PersegiPanjang extends BangunDatar{
    float Panjang;
    float lebar;

//Getter dan Setter 
    float getPanjang(){
        return Panjang;
    }
    void setPanjang(float Panjang){
        this.Panjang = Panjang;
    }

    float getlebar(){
        return lebar;
    }
    void setlebar(float lebar){
        this.lebar = lebar;
    }
    //overriding
    
    float hitungLuas(){
        return (float)   (Panjang * lebar);
    } 

    //overriding 
    float hitungKeliling(){
        return (float) (2* (Panjang + lebar));
    }
    public void display() {

        System.out.println("Persegi Panjang:");
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
// Subclass Segitiga
class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    // Getter dan setter 
    float getalas() {
        return alas;
    }

    void setalas(float alas) {
        this.alas = alas;
    }
    float getTinggi() {
        return tinggi;
    }

    void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    //Overriding
    float hitungLuas() {
    return (float) (1 / 2.0 * alas * tinggi); 
    }

    //Overriding
    float hitungKeliling(){
        float a = (float) Math.sqrt((alas*alas) + (tinggi*tinggi));
        return alas + tinggi + a;
    }

    public void display() {

        System.out.println("Segitiga:");
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
    
public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        persegi.display();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(10);
        lingkaran.display();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(8);
        persegiPanjang.setlebar(6);
        persegiPanjang.display();
  
        Segitiga segitiga = new Segitiga();
        segitiga.setTinggi(8);
        segitiga.setalas(5);
        segitiga.display();
        
    }
}



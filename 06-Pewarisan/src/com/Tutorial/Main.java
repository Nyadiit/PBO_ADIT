package com.Tutorial;

class Hero{
    //attack
    String nama;
    float exp;
    float health;

    void display(){
        System.out.println("Nama Hero :" + this.nama);
        System.out.println("Exp Hero :" + this.exp);
        System.out.println("Health Hero :" + this.health);

    }
    
    }


    //subclass
    class HeroTank extends Hero{

    }

public class Main {
    public static void main(String[] args) {
        // instansiasi objek
       Hero hero_1 = new Hero();
       hero_1.nama = "Balmont";
       hero_1.display();

       HeroTank hero_2 = new HeroTank();
       hero_2.nama = "leamort";
       hero_2.display();
        


    } 
}

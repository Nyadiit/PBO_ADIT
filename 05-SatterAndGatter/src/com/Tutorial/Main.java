package com.Tutorial;

class User{
    private String username;
    private String password;

    //membuat konstruktor
    User(String username, String password){
        this.username = username;
        this.password = password;

        



    }
    //method gatter
        public String getUsername() {
            return this.username;

        }
        public String getPassword(){
            return this.password;


        }
        public void setpassword(String password){
            this.password = password;
        }

}


public class Main {
    public static void main(String[] args) {
       //instansiasi objeck
       User person_1 = new User("Adit", "12121212");

       // panggil method gatter
       System.out.println(person_1.getUsername());
        System.out.println(person_1.getPassword());

        person_1.setpassword("cobalagi");
        System.out.println("New Password:" +person_1.getPassword());
    } 
}
 
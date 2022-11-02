package Java.lab3;

import Java.lab3.Impression;

public class Main {


    
    public static void main(String[] args) {
        

        // use hashcode to compating ...
        Main main = new Main();

        System.out.println(main.hashCode());
       
        new Impression().born(new Spectable()).toString();



    }
}

package academy.devdojo.maratonajava.introducao;

import java.util.Random;

public class Aula05EstruturasCondicionais {
    static Random rd = new Random();
    public static void main(String[] args) {
        exe4();
        
    }
    static void exe1(){
        Random rd = new Random();
        int a = rd.nextInt(1000); // Randomizing whether 'hi' will appear or not.

        if (a % 3 == 1) {
            System.out.println("hi:)");
        }
        System.out.println("outside the if");
    }
        static void exe2(){
            int age = rd.nextInt(15,25);
            System.out.println("Age: "+age);
            Boolean allowedToBuy = age >= 18;
            System.out.println(allowedToBuy ?"Allowed to buy alcoholic" : "Not allowed");

            
        }
        static void exe3(){
            int age = rd.nextInt(15,25);
            System.out.println("Age: "+age);
            if (age >= 18) {
                System.out.println("Allowed to buy alcoholic");
            }else{
                System.out.println("Not allowed");
            }
        }
        static void exe4(){
            int age = rd.nextInt(10,25);
            System.out.println("Age: "+age);
            Boolean child = age < 15;
            Boolean teen = age >= 15 && age < 18;
            Boolean adult = age >= 18;
            if (child) {
                System.out.println("child");
            }
            if (teen) {
                System.out.println("teen");
            }
            if (adult) {
                System.out.println("adult");
            }
        }

}

package Menu;

import java.util.Scanner;

public class Fizz_buzz {
    public Fizz_buzz(){
        FIzz_prob();
    }
    public static void FIzz_prob(){

        for (int n = 1; n <=100 ; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("Fizz Buzz");
            }
            if (n % 3 == 0) {
                System.out.println("Fizz");
            }
            if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }

//    public static void main(String[] args) {
//        for (int n = 1; n <=100 ; n++) {
//            if(n%3==0 && n%5==0){
//                System.out.println("Fizz Buzz");
//            }
//            if(n%3==0){
//                System.out.println("Fizz");
//            }
//            if(n%5==0){
//                System.out.println("Buzz");
//            }
//            else{
//                System.out.println(n);
//            }
//        }
    }


package Menu;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to check to arrays String are Anagram or not");
        System.out.println("Press 2 to Perform Arrays operation like insertion deletion traversing sorting and delete entire array");
        System.out.println("Press 3 to perform Fizz Buzz Problem");
        System.out.println("Press 4 to terminate");
        int n=sc.nextInt();
        switch (n){
            case 1: Check_ANagram obj=new Check_ANagram();
            break;
            case 2: test obj1=new test();
            break;
            case 3: Fizz_buzz obj2=new Fizz_buzz();
            break;
            case 4:
                System.out.println("Terminate");
                break;
            default:
                System.out.println("PLEASE ENTER A VALID NUMBER");
        }
    }

}

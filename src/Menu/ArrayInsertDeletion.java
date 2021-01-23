package Menu;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertDeletion {
    public ArrayInsertDeletion(){
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values of array");
        for (int i = 0; i <n-1 ; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter 1 for inserting value in array");
        System.out.println("Enter 2 for deleting any specific value from an array ");
        System.out.println("Enter 3 for traversing array");
        System.out.println("Enter 4 to perform sorting ");
        System.out.println("Enter 5 to delete entire array");
        System.out.println("Enter 6 to perform all operation");
        System.out.println("N");
        int N=sc.nextInt();
        switch (N){
            case 1:        insert(a,n);
                break;
            case 2:        deletion(a,n);
                break;
            case 3:        traversing(a,n);
                break;
            case 4:        sort(a,n);
                break;
            case 5:        delete_all_Element_array(a,n);
                break;
            case 6:    insert(a,n);
                        deletion(a,n);
                        traversing(a,n);
                        sort(a,n);
                        delete_all_Element_array(a,n);
                        break;
            default:
                System.out.println("PLEASE ENTER THE VALID INPUT");
                break;
        }
    }
    public static Scanner sc=new Scanner(System.in);
    public static void insert(int a[],int n) {
        System.out.println("Insertion Prog Start");
        System.out.println("Enter the values to be inserted");
        int k=sc.nextInt();
        System.out.println("Enter the index at which you have to insert the value");
        int index=sc.nextInt();
        try {
            if (a[index-1] == 0) {
                a[index-1] = k;
            }
            if (n < index-1) {
                System.out.println("Element not to be added size of array is < index");
            }
            if(index-1<n)
            for (int i = n-2; i >= 0; i--) {
                a[i + 1] = a[i];
                if (i == index-1) {
                    a[i] = k;
                    break;
                }
            }
            else
            a[n-1]=k;

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println("Insertion prog End......");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deletion(int a[],int n){
        System.out.println();
        System.out.println("Deletion prog started");
        try {
            System.out.println();
            System.out.println("Present array is ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
            System.out.println("Enter the element you want to delete");
            int k=sc.nextInt();
            int index = 0;
            int i = 0;
            boolean present=false;
            for (int j = 0; j < n; j++) {
                if (k == a[j]) {
                    index = j;
                    present=true;
                    break;
                }
            }
            if(present) {
                for (i = index; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }
                a[i] = k;
            }
            else System.out.println("Element is not present in array");
            for (int j = 0; j < n-1; j++) {
                System.out.print(a[j] + " ");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Deletion prog end...........");
        System.out.println();
    }
    public static void traversing(int a[],int n){
        System.out.println("Traversing begins......");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(00);
        System.out.println("Traversing End......");
    }
    public static void sort(int a[],int n){
        System.out.println();
        System.out.println("Sorting begins......");

        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Sorting end.........");
    }
    public static void delete_all_Element_array(int a[],int n){
        System.out.println();
        System.out.println("All Elements are deleted now");
        a=null;

        System.out.println("Thanks for running the program \uD83D\uDE0A...........");
    }

}

package College_lab.Assignment;

import java.util.Scanner;

public class Selection_sort {

    public static void sort(int a[],int n){


        for (int i = 0; i < n-1; i++) {
           int min=i;
            for (int j = i+1; j <n ; j++)
                if(a[j]<a[min])
                    min=j;


            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }

    }
    public static void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        sort(a,n);
        print(a);
    }
}

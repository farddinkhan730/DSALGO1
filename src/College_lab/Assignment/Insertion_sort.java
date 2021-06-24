package College_lab.Assignment;

import java.util.Scanner;

public class Insertion_sort {

    public static void insertionSort(int a[],int n){



        for (int i = 1; i <n ; i++) {
            int ele=a[i];
            int j=i-1;
            while (j>=0 && a[j]>ele){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=ele;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        insertionSort(a,n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

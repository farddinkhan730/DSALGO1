package College_lab.Assignment;

import java.util.Scanner;

public class Quick_sor {
    public static void quicksort(int a[],int start, int end){

        if(start<end){
            int pivot=partition(a,start,end);

            quicksort(a,start,pivot-1);
            quicksort(a,pivot+1,end);

        }
    }
    public static int partition(int a[],int start,int end){

       int pivot=end;
       int temp=start-1;

        for (int i = start; i <= end-1; i++) {

            if(a[i]<a[pivot]){
                temp++;
                int temp1=a[i];
                a[i]=a[temp];
                a[temp]=temp1;
            }
        }
        int tem=a[temp+1];
        a[temp+1]=a[pivot];
        a[pivot]=tem;

        return temp+1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        quicksort(a,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

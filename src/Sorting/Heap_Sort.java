package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Heap_Sort {
    public static void sort(int a[],int n){
        for (int i = n/2-1; i >=0 ; i--) {
            heapify(a,n,i);
        }

        for (int i = n-1; i >0 ; i--) {
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;

            heapify(a,i,0);
        }
    }
    public static void heapify(int arr[],int n,int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int a[]={1,23,4,10,2};
        sort(a,a.length);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
class mncv{
    public static void main(String[] args) {

        String s1="Adfs";
        HashSet<Character> h=new HashSet<>();
        for(char i:s1.toCharArray()){
            h.add(i);
        }
        Object[] a =h.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

class str{
    public static boolean sum(String s){
        char[] c=s.toCharArray();
        boolean b=false;
        if(s.length()%2!=0){
            int mid=s.length()/2;
            int lsum=0;
            for(int i=0;i<mid;i++){
                lsum+=c[i];
            }
            int rsum=0;
            for (int i = mid+1; i <c.length ; i++) {
                rsum+=c[i];
            }
            if(lsum==rsum){
                b=true;
            }

        }
        return b;
    }

    public static void main(String[] args) {
        String s="12345";
        boolean m=sum(s);
        if(m){
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
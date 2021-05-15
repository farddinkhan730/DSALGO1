package Sorting;

import java.util.*;
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
        if (l < n && arr[l] < arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] < arr[largest])
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
class Solution1
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        int ans=0;
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        hs.put(0,1);
        int sum=0;
        for(int v:arr){
            if(v == 0){
                sum+= -1;
                System.out.println(sum);

            }
            else{
                sum+= +1;
            }
            if(hs.containsKey(sum)){
                ans+=hs.get(sum);
                System.out.println(ans);
                hs.put(sum,hs.get(sum)+1);
            }
            else{
                hs.put(sum,1);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int a[]={0 ,0 ,1 ,0 ,1 ,0 ,1 ,1 ,0, 0 ,1 ,1 ,1};
        int an=countSubarrWithEqualZeroAndOne(a,a.length);
        System.out.println(an);
    }
}

class msn{
    public static void main(String[] args) {
        int sum= -1;
        System.out.println(sum);
    }
}
class
Sorting_Elements_of_an_Array_by_Frequency{
    public static void sort(int a[], int n){
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count=0;
            if(al.contains(a[i])) {
                int frq = Collections.frequency(al, a[i]);
//                al.add();
            }

        }

    }
}
class Node{
    int data;
    int freq;
    Node head;
    Node next;
    Node(int data,int freq){
        this.data=data;
        this.freq=freq;
        head=next=null;
    }
}
class sorting_element {
    Node head;
    public static void sort(int a[], int n){
        Node temp=getfrequency(a,n);
        int m=min(temp);
        System.out.println(" m " + m);

    }
    public  void add(int data,int freq){
        if(head==null){
            head=new Node(data,freq);
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data,freq);

    }
    public static void ptintlm(Node head){
        while (head!=null){
            System.out.println(head.data +" freq "+ head.freq);
            head= head.next;
        }
    }
    public static Node getfrequency(int a[],int n){
        HashMap<Integer,Integer> hs=new HashMap<>();
        HashSet<Integer> hset=new HashSet<>();
        for (int i = 0; i < n; i++) {
            hset.add(a[i]);
            if (hs.containsKey(a[i])) {
                hs.put(a[i],hs.get(a[i]) + 1);

            }
            else {
                hs.put(a[i],1);
            }
        }
        Object[] arr =hset.toArray();
        sorting_element ll = new sorting_element();
        for (int i = 0; i < hs.size(); i++) {
            ll.add(convrsion(arr[i]), hs.get(convrsion(arr[i])));
        }
        return ll.head;
    }
    public static int min(Node head){
        Node temp=head;
        int min=Integer.MAX_VALUE;
        while (temp!=null){
            if(min>temp.freq){
                min=temp.freq;
            }
            temp=temp.next;
        }
        int variable=0;
        Node temp1=head;
        while (temp1!=null){
            if(temp1.freq==min){
                 variable= temp1.data;
                 return variable;
            }
        }
        return min;
    }

    private static int convrsion(Object integer) {
        int mn=(int) integer;
        return mn;
    }

    public static void main(String[] args) {
       int N = 5;
        int A[] = {5,5,4,6,4};
        sort(A,N);
    }
}
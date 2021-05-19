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
class Pair<E,T>{
    E ele;
    T freq;
    Pair(E x,T y){
        this.ele=x;
        this.freq=y;
    }

}
class Sorting_Elements_of_an_Array_by_Frequency{

    public static  void sort(int a[], int n){
//        HashMap<Integer,Integer> hs=new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            if(hs.containsKey(a[i])){
//                hs.put(a[i],hs.get(a[i])+1);
//            }
//            else {
//                hs.put(a[i],1);
//            }
//        }
        ArrayList<Pair<Integer,Integer>> al=new ArrayList<Pair<Integer,Integer>>();
        boolean visited[]=new boolean[256];
        Arrays.fill(visited,false);
        for (int i = 0; i < n; i++) {
            if(!visited[a[i]]) {
                int m = check_element(a, n, a[i]);
                al.add(new Pair<>(a[i], m));
                visited[a[i]]=true;
            }
        }
        int ans[]=new int[n];
        for (int i = 0; i < al.size(); i++) {
            int temp[]=getElement(al);
            if(i<al.size())
            al.remove(i);
            for (int j = 0; j < temp[1]; j++) {
                ans[j]=temp[0];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] getElement(ArrayList<Pair<Integer,Integer>> al){
        int max=0;
        int index=0;
        int c=0;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i).freq>max){
                max=al.get(i).freq;
                index=i;
            }
        }
        for (int i = 0; i < al.size(); i++) {
            if(i==index) continue;
            if(max==al.get(i).freq){
                if(al.get(i).ele>al.get(index).ele){
                    max =al.get(index).ele;
                    c=al.get(i).freq;
                }
                if(al.get(i).ele<al.get(index).ele){
                    max= al.get(i).ele;
                    c=al.get(i).freq;
                }
            }
        }
        int a[]={max,c};

        return a;
    }
    public static int check_element(int a[],int n,int ale){
        int i=0,count=0;
        for ( i = 0; i < n; i++) {
            if(a[i]==ale ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=5;
        int a[]={5,5,4,6,4};
        sort(a,n);
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
class MAx_INdex{
    public static void max(int arr[],int n){

        int max=0,i=0,j=n-1;
       while(i<=j){
                if(arr[i]<=arr[j]){
                    if(max<(j-i)) {
                        max = (j - i);
                    }
                        j=n-1;
                        i++;
                    }
                else {
                    j--;

            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int a[]={65 ,6 ,74 ,94 ,56 ,89 ,9 ,63 ,75 ,25 ,34 ,68 ,93 ,48 ,16};
//                {1,10};
//                {34,8,10,3,2,80,30,33,1};
        max(a,a.length);
    }
}
class Row_with_max_1s{
    public static void rowWithMax1s(int arr[][], int n, int m) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0, count = 0;
        int i = 0, j = 0;
        while (i < n) {
            if (arr[i][j] == 1) {
                count++;
                j++;
            } else {
                j++;
            }
            if (j == m - 1) {
                hm.put(i, count);
                count = 0;
                j = 0;
                i++;
            }
        }
//        System.out.println(hm);
        int index=0;
        for (int k = 0; k < hm.size(); k++) {
            int mn=hm.get(k);
            max=Math.max(max,mn);
            if(hm.get(k)==max)
                index=k;
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
//                {{0, 1, 1, 1},
//                {0, 0, 1, 1},
//                {1, 1, 1, 1},
//                {0, 0, 0, 0}};
        rowWithMax1s(a,n,m);
    }
}
class find_triplet{
    public static void find(int a[],int n,int x){
        ArrayList<Integer> al=new ArrayList<>();
        int result[]=new int[3];
        for (int i = 1; i < n; i++) {
            if(x%i==0){
                al.add(i);
            }
        }
        int k=al.size()-1;
        for (int i = 0; i <al.size() ; i++) {
            int sum=al.get(i)+al.get(i+1)+al.get(k);
            if(sum==x){
                result[0]=al.get(i);
                result[1]=al.get(i+1);
                result[2]=al.get(k);
                break;
            }
            k--;
        }
       for(int i=0;i<n;i++){
           for (int j = 0; j <result.length; j++) {
               if(a[i]==result[j]){
                   System.out.println(result[j]);
               }
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        find(a,n,x);
    }
}
class subArray_with_given_sum{
    public static void sum(int arr[],int n,int su){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sub[]=null;
                sub=Arrays.copyOfRange(arr,i,j+1);
                boolean s=sum1(sub,su);
                if (s)
                    count++;
            }
        }
        System.out.println(count);
    }
    public static boolean sum1(int a[],int su){
        int s=0;
        int i=0;
        while(i<a.length){
            s+=a[i++];
        }
//        Arrays.stream(a).sum();
        if (s==su) return true;
        else return false;
    }

    public static void main(String[] args) {
       int N=5;
       int s=10;
       int arr[] = { 10, 2, -2, -20, 10 };
        sum(arr,N,s);
    }
}
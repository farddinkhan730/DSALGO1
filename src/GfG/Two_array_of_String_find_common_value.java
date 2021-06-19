package GfG;

import java.util.*;

public class Two_array_of_String_find_common_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String arr1[]=new String[n];
        String arr2[]=new String[m];
        arr1= new String[]{"Article", "for", "Geeks", "for", "Geeks"};
        arr2=new String[]{"Geeks","for","Geeks"};
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (String i : arr1) {
            set1.add(i);
        }
        for (String i : arr2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
    }
}

class Solution {
    public static long sum(long a[]){

        Arrays.sort(a);

        long su=a[0]+a[1];
        return su;
    }
    public static long pairWithMaxSum(long arr[], long n)
    {
        // Your code goes here

        int i=0,j=1;
        long summ=Integer.MIN_VALUE;
        while(i<n && j<n){
            long a[]=null;
            a=Arrays.copyOfRange(arr,i,j+1);

            long m=sum(a);
            if(summ<m){
                summ=m;
            }
        }
        return summ;
    }

    public static void main(String[] args) {
        long a[]={4,3,1,5,6};
        System.out.println(pairWithMaxSum(a,a.length));
    }
}
class  smallernumberleft{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==0){
                al.add(-1);
            }
            else {
                int min=-1;
                for (int j = 0; j < i; j++) {
                    if(a[j]<a[i]){
                        min=a[j];
                    }
                }
                al.add(min);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int a[]={1,5,0,3,4,5};
        List<Integer> al=leftSmaller(a.length,a);
        System.out.println(al);
    }
}

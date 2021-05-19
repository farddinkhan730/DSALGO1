package Hacker_Reank.Bits_mainuplation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Count_TOtal_set_bits {
    public static void main(String[] args) {
        int count=0;
        int a=3;
        for (int i = 1; i <= 5; i++) {
            System.out.println(Integer.bitCount(i));
            count+=Integer.bitCount(i);
        }
        int ans= (int) (count % (Math.pow(10,9)+7));
        System.out.println(ans);
    }
}
class ReverseBits{
    public static void main(String[] args) {
        long a=3;
        long arr[] =new long[32];
        int j=0;
        String s=  Long.toBinaryString(a);
        for(int i=arr.length-1;i>=0;i--){
            if(j==s.length()) break;
            arr[i]=s.charAt(j++);
        }
        int m=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[(arr.length-1)-i]!=0){
                long temp=arr[i];
                arr[i]=arr[(arr.length-1)-i];
                arr[(arr.length-1)-i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        Integer.
    }
}
class number_power_of_2{
    public static void main(String[] args) {
        int n=4;
        int bitwise=n-1;
        int sol=bitwise & n;
            if (sol==0){
                System.out.println("yes");
            }
        if (sol!=0) System.out.println("No");
    }
}
class the_most_significant_set_bit{
    public static void main(String[] args) {
        int n=10;
        int res=0;
        while ( (n>>=1)!=0){
            res++;
        }
        System.out.println((int)Math.pow(2,res));

    }
}
class Ex_or{
public static void main(String[]args){
        int n=7;
        int ex=0;
    for (int i = 1; i <=n ; i++) {
        ex^=i;
    }
    System.out.println(ex);
        }

}
class K_bit_is_st_or_not{
    public static void main(String[] args) {
        int n=4;
        int k=2;
        int mask=0;
//        for (int i = 1; i <= k; i++) {
            mask = 1 << k;
//        }
        System.out.println(mask);
        if((n & mask)>0){
            System.out.println("yes");
        }
        else System.out.println("NO");
        ArrayList al=new ArrayList();


//        System.out.println(result);
    }
}
package Code_Chef;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
class LAPIN{


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String s1=s.substring(0,s.length()/2);
            int n=s.length();
            String s2;
            if(s.length()%2==0){
                s2=s.substring(n/2,n);
            }
            else{
                s2=s.substring((n/2)+1,n);
            }
            char c1[]=s1.toCharArray();
            char c2[]=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            String str1=new String(c1);
            String str2=new String(c2);
            if(str1.equals(str2)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
class  FLOW009{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int quantity=sc.nextInt();
            int price=sc.nextInt();
            double resulprice=0;
            if(quantity>1000){
                resulprice=quantity*price;
                double discount=(resulprice*10)/100;
                resulprice=resulprice-discount;
                System.out.println(resulprice);
            }
            else {
                resulprice=quantity*price;
                System.out.println(resulprice);
            }
        }
    }
}
class GCD_and_LCM{
//    public static int Gcd(int a,int b){
//        while(a!=b){
//            if(a>b) {
//                a=a-b;
//            }
//            else if(b>a){
//                b=b-a;
//            }
//        }
//        return a;
//    }
//    public static int lcm(int a,int b){
//        int max= a > b ? a : b ;
//        while (true){
//            if(max%a==0 && max%b==0){
//                return max;
//            }
//            ++max;
//        }
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger gcd=a.gcd(b);
            BigInteger l=a.multiply(b).divide(gcd);
            System.out.println(gcd+" "+ l);
        }
        sc.close();
    }
}
class  Puppy_and_Sum{
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int d=sc.nextInt();
            int n=sc.nextInt();
            for (int i = 0; i < d; i++) {
                n=sum(n);
            }
            System.out.println(n);
        }
    }
}
class Id_and_Ship{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0){
           char c=sc.next().charAt(0);
           if(c=='B' || c=='b'){
               System.out.println("BattleShip");
           }
           else if(c=='C' || c=='c'){
               System.out.println("Cruiser");
           }
           else if(c=='D' || c=='d'){
               System.out.println("Destroyer");
           }
           else if (c=='F' || c=='f'){
               System.out.println("Frigate");
           }
        }
    }
}
class Sum_OR_Difference{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            int n1=sc.nextInt();
            if(n>n1){
                System.out.println((n-n1));
            }
            else {
                System.out.println((n+n1));
            }
        }

}
class Primality_Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            int b=0;
            for (int i = 1; i <=n; i++) {
                if (n % i == 0) {

                   b++;

                }
            }
            if (b==2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
class The_Block_Game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n1=sc.nextInt();
            String str=String.valueOf(n1);
            if(str.charAt(0)=='0'){
                System.out.println(n1);
            }
            int pallin=0,n=n1;
            while (n!=0){
                int temp=n%10;
                pallin=(pallin*10)+temp;
                n/=10;
            }
            if(pallin==n1){
                System.out.println("wins");
            }
            else {
                System.out.println("loses");
            }

        }
    }
}
class code_chef{
    public static void main(String[] args) {
     int a[]={1,2,5,10,50,100};
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int j=a.length-1;
         int ans=0;
         while(n!=0){
             if((n-a[j])>=0){
                 n-=a[j];
                 ans++;
             }
             else {
                 j--;
             }
         }
         System.out.println(ans);
     }
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
            if(a[i]%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
class add{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
//        String s=String.valueOf()
        System.out.println((32/10));
//        while(t-->=0){
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            System.out.println((a+b));
//        }
    }
}

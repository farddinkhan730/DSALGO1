package Competitive_programing;

import java.util.Scanner;

public class chef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            float k1=sc.nextFloat();
            float k2=sc.nextFloat();
            float k3=sc.nextFloat();
            float v=sc.nextFloat();
            float speed=k1*k2*k3*v;
            float time=100/speed;
            double time_round=Math.round(time * 100.0) / 100.0;
            if(time_round<9.58){
                System.out.println("Yes");
                System.out.println(time_round);
            }
            else {
                System.out.println("No");
            }
        }
    }
}
//Strong Language
class Strong_Language{
    public static void consecutive(int n,int k,String s){
        int count=0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='*'){
                count++;
                if(count==k){
                    System.out.println("Yes");
                    return;
                }
            }
            else {
                count=0;
            }
        }
        System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            consecutive(n,k,s);
        }
    }
}
//chef and dice
class chef_die{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if (n==1)
                System.out.println(20);
            else if (n==2)
                System.out.println(36);
            else if (n==3)
            System.out.println(51);
            else if(n==4)
                System.out.println(60);
        else {
                int rem = n % 4;
                int ans = ((n - rem) / 4) * 44;
                if (rem == 0) {
                    ans += 16;
                } else if (rem == 1)
                    ans += 32;
                else if (rem == 2)
                    ans += 44;
                else if (rem == 3)
                    ans += 55;
                System.out.println(ans);
            }

        }
    }
}
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=sc.nextDouble();
        double temp=x;
        System.out.println((x+y));
        System.out.println(temp);
        temp=temp+0.50;
        System.out.println(temp);
        if(x%5==0){
            if(x>y){
                System.out.println(y);
            }
            else{
                double result=((y-temp)*100.0)/100.0;
                System.out.println(result);
            }
        }
        else{
            System.out.println(y);
        }
    }
}
class Codechef1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            if(a>b && b>c){
                System.out.println(b);
            }
            else if(a>c && c>b){
                System.out.println(c);
            }
        }
        else if(b>a && b>c){
            if(b>a && a>c){
                System.out.println(a);
            }
            else if(b>c && c>a){
                System.out.println(c);
            }

        }
        else if(c>a && c>b){
            if(c>a && a>b){
                System.out.println(a);
            }
            if(c>b && b>a){
                System.out.println(b);
            }
        }
    }
}

package Code_Chef.May_Cook_off;

import java.util.Scanner;

class TANDJ1{
    //o(1)
    public void tandji(int a,int b,int c,int d,int k){
        if(Math.abs(c-a)+Math.abs(d-b)==k){
            System.out.println("YES");
        }
        else {
            int t=Math.abs(c-a)+Math.abs(d-b);if((k-t)%2==0 && k>t){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
//    o(n)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int k=sc.nextInt();
            while(k>0){
                if(a<c){
                    a++;
                    k--;
                }
                else if(a>c){
                    a--;
                    k--;
                }
//                else {
//                    k--;
//                }
                if(b<d){
                    b++;
                    k--;
                }
                else if(b>d){
                    b--;
                    k--;
                }
                else if(b==d && k!=0){
                    b++;
                    k--;
                }
            }
            if(a==c && b==d){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
class Hoops{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2!=0){
                int a=1,b=n;
                if(n==0){
                    System.out.println(n);
                    continue;
                }
                while (a<=b){

                    if(a==b){
                        System.out.println(a);
                        break;
                    }
                    a++;
                    b--;
                }
            }
        }
    }
}
public class MARARUN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int f=10;
        int s=21;
        int th=42;
        while (t-->0)
        {
            int D=sc.nextInt();
            int d=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            int max_dis=D*d;
            if(max_dis>=f && max_dis<s){
                System.out.println(A);
            }
            else if (max_dis>=s && max_dis<th){
                System.out.println(B);
            }
            else if (max_dis>=th){
                System.out.println(C);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
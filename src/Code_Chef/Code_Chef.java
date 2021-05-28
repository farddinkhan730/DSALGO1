
package Code_Chef;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class SUMTRIAN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
        }
    }
}
class  RECIPE{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();

        }
    }
}
class RECTANGL{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a == b && c == d || a == c && b == d || a == d && b == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
class TWOVSTEN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int count=0;
            if(x%5==0){
              while (x%10!=0){
                  x=x*2;
                  count++;
              }
                System.out.println(count);

            }
            else {
                System.out.println(-1);
            }

        }
    }
}
class GDOG{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
//            int temp=n/k;
//                int coin=n%k;
            int coin=0;
            for (int i = 1; i <=k ; i++) {
                coin=Math.max(coin,n%k);
            }
            System.out.println(coin);
        }
    }
}
class PERMUT2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        boolean check=false;
        for (int i = 0; i < n; i++) {
            check=false;
            for (int j = 0; j < n; j++) {
                if (a[j]==i+1) {
                    if(a[i]==j+1){
                        check=true;
                    }
                }
            }
            if(!check){
                break;
            }

        }
        if (check) {

            System.out.println("ambiguous");
        }
        else {
            System.out.println("not ambiguous");
        }
    }
}
class HEADBOB{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char c[]=s.toCharArray();
            ArrayList<Character> al=new ArrayList<>();
            for (int i = 0; i < c.length; i++) {
                al.add(c[i]);
            }
            if(al.contains('I')){
                System.out.println("INDIAN");
            }
            else if(al.contains('Y')){
                System.out.println("NOT INDIAN");
            }
            else {
                System.out.println("NOT SURE");
            }
        }
    }
}
class FLOW014{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int hardness=sc.nextInt();
            double carbon=sc.nextDouble();
            int tensile=sc.nextInt();
            boolean h=hardness>50 ;
            boolean c=carbon<0.7 ;
            boolean te=tensile>5600;
            if(hardness>50 && carbon<0.7 && tensile>5600){
                System.out.println(10);
            }
            else if(h && c){
                System.out.println(9);
            }
            else if(c && te){
                System.out.println(8);
            }
            else if(h && te){
                System.out.println(7);
            }
            else if(h || c || te){
                System.out.println(6);
            }
            else {
                System.out.println(5);
            }
        }
    }
}
class SMPAIR{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            if(n==1){
                System.out.println(a[0]);
                break;
            }
            System.out.println(a[0]+a[1]);
        }
    }
}
class  FLOW011{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t ; i++) {
            double salary = sc.nextInt();
            double HRA=0;
            double DA=0;
            if(salary<1500){
                HRA=(salary*10)/100;
                DA=(salary*90)/100;
            }
            else if(salary>=1500){
                HRA=500;
                DA=(salary*98)/100;
            }
            double gross_Salary=salary+HRA+DA;
            System.out.println(gross_Salary);
        }
    }
}
public class Code_Chef {
    public static void main(String[] args) {

    }
}

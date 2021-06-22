
package Code_Chef;

import javax.security.sasl.SaslClient;
import java.math.BigInteger;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
class COMM3{
    public static double distance(int x1,int x2,int y1,int y2){
        double dis=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));

        return dis;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r = sc.nextInt();
            int x1, x2, x3, y1, y2, y3;
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            x3 = sc.nextInt();
            y1 = sc.nextInt();
            y2 = sc.nextInt();
            y3 = sc.nextInt();
            double dis1 = distance(x1, x2, y1, y2);
            double dis2 = distance(x2, x3, y2, y3);
            double dis3 = distance(x1, x3, y1, y3);
            int k = 0;
            if (dis1 <= r) {
                k++;
            }
            if (dis2 <= r) {
                k++;
            }
            if (dis3 <= r) {
                k++;
            }
            if (k >= 2)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
class TWOSTR{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String x = sc.next();
//            System.out.println(x);
            String y = sc.next();
//            System.out.println(y);
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == y.charAt(i)) {
                    System.out.println(x + " And" + y);
                    continue;
                } else {
                    if (x.charAt(i) == '?' && y.charAt(i)!='?') {
                        System.out.println(x);
                       x= x.replace(x.charAt(i), y.charAt(i));
                        System.out.println("REpla "+ x);
                    } else if (y.charAt(i) == '?' && x.charAt(i)!='?') {
                        y=y.replace(y.charAt(i), x.charAt(i));
                    } else {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(x.equals(y)){
                System.out.println("YES");
            }
        }
    }
}
class CHN09{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int ca=0,cb=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='a')
                    ca++;
                if (s.charAt(i)=='b')
                    cb++;
            }
//            if (ca>cb && cb==0){
//                System.out.println(ca);
//            }
//            else if (cb>ca && ca==0){
//                System.out.println(cb);
//            }
            if(ca>cb ){
                System.out.println(cb);
            }
            else if (cb>ca ){
                System.out.println(ca);
            }
            else {
                System.out.println(ca);
            }
        }
    }
}
class TRICOIN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=0;
            for (int i = 1; i <=n; i++) {
                if(n>=i){
                    x++;
                    n-=i;
                }
            }
            System.out.println(x);
        }
    }
}
class TWTCLOSE{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        Arrays.fill(a,0);
        String s=" ";
        while (k-->0){
            s=sc.next();

            int x=0;
            if(s.equals("CLICK")){
                int t=sc.nextInt();
                a[t-1]=a[t-1]==0?1:0;
                for (int j = 0; j <n ; j++) {
                    if(a[j]==1){
                        x++;
                    }
                }
            }
            else {

                Arrays.fill(a,0);
                x=0;
            }
            System.out.println(x);
        }
    }
}
class AREAPERI{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area=l*b;
        int p=2*( l + b);

        if(area>p){
            System.out.println("Area");
            System.out.println(area);
        }
        else if(area<p){
            System.out.println("Peri");
            System.out.println(p);
        }
        else {
            System.out.println("Eq");
            System.out.println(area);
        }


    }
}
class SNCKYEAR{
    public static String switchs(int n){
        switch (n){
            case 2010: return "HOSTED";
            case 2015: return "HOSTED";
            case 2016: return "HOSTED";
            case 2017: return "HOSTED";
            case 2019: return "HOSTED";
        }
        return "NOT HOSTED";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int s=sc.nextInt();
            System.out.println(switchs(s));
        }
    }
}
class POTATOES{
    public static boolean prime(int n){
        int count=0;
        for (int i = 1; i <n ; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for (int i = 1; i <= x+y; i++) {
                int p=x+y+i;
                if(prime(p)){
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
class XYSTR{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s=sc.next();
            int ans=0;
            boolean vis[]=new boolean[s.length()];
            Arrays.fill(vis,false);
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i)!=s.charAt(i+1) && !vis[i] && !vis[i+1]){
                    vis[i]=true;
                    vis[i+1]=true;
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
 class Voweltb{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        char c=sc.nextLine().charAt(0);
//                s.charAt(0);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println("Vowle");
        }
        else{
            System.out.println("Consonant");
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
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=sc.nextDouble();
        double rem=0;
        if(x%5==0){
            if(x<y && (x+0.5)<=y){
                rem=y-x-0.5;
                System.out.println(rem);
            }
            else {
                System.out.println(y);
            }
        }
        else {
            System.out.println(y);
        }
    }
}
class VISA{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            int z1=sc.nextInt();
            int z2=sc.nextInt();

            if(x1<=x2 && y1<=y2 && z1>=z2){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }
}

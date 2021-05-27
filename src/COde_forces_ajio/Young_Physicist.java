package COde_forces_ajio;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n-->0) {
            int a[] = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i]=sc.nextInt();
            }
            sum+= Arrays.stream(a).sum();
        }
        if(sum==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

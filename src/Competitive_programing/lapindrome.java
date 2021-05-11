package Competitive_programing;

import java.util.Scanner;

public class lapindrome {

    // FIRST APPROCH NOT GIVEN EXACT ANSWER AT STRING abbaab
    public static boolean find_lapindrome(String p1,String p2){
        int a[]=new int[256];
        int b[]=new int[256];
        boolean check=true;
        for ( char c: p1.toCharArray()) {
            int temp=(int) c;
            a[temp++]=temp;
        }
        for ( char i: p2.toCharArray()) {
            int temp=(int)i;
            b[temp++]=temp;
        }
        for (int i = 0; i <256 ; i++) {
            if(a[i]!=b[i]){
                check=false;
                break;
            }
        }

        return check;
    }

    // 2nd approch pass all test cases but fail at hidden test case
    public static boolean find_lapindrome1(String p1,String p2){
        int a=p1.length();
        int b=p2.length();
        boolean check[]= new boolean[a];
        boolean islapindrome=false;
        if(a==b){
            for (int i = 0; i < a; i++) {
                char c=p1.charAt(i);
                islapindrome=false;
                for (int j = 0; j < b; j++) {
                    if(c==p2.charAt(j) &&  !check[j]){
                        islapindrome=true;
                        check[j]=true;
                        break;
                    }
                }
            }
        }
        boolean islapindrome1=false;
        boolean check1[]=new boolean[b];
        if(a==b){
            for (int i = 0; i < b; i++) {
                char c=p2.charAt(i);
                islapindrome1=false;
                for (int j = 0; j < a; j++) {
                    if(c==p1.charAt(j) &&  !check1[j]){
                        islapindrome1=true;
                        check1[j]=true;
                        break;
                    }
                }
            }
        }
        return (islapindrome && islapindrome1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for (int k = 0; k <n ; k++) {
            String s = sc.nextLine();
            int length = s.length();
            int mid = length / 2;
            String p1 = "";
            String p2 = "";
            for (int i = 0; i < length; i++) {
                if (length % 2 == 0) {
                    if (i < mid) {
                        p1 += s.charAt(i);
                    }
                    if (i >= mid) {
                        p2 += s.charAt(i);
                    }
                }
                if (length % 2 != 0) {
                    if (i < mid) {
                        p1 += s.charAt(i);
                    }
                    if (i > mid) {
                        p2 += s.charAt(i);
                    }
                }
            }
            boolean check = find_lapindrome1(p1, p2);
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}


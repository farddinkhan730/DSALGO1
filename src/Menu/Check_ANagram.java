package Menu;

import java.util.Scanner;

public class Check_ANagram {


    public boolean[] isAnagram(String []s1,String[] s2){
        boolean result[]=new boolean[s1.length];
        for (int i = 0; i < s1.length; i++) {
            result[i]=anagram(s1[i],s2[i]);
        }
        return result;
    }
    public  boolean anagram(String s,String s1){
        int []n=new int[256];
        int []m=new int[256];
        for (char c:s.toCharArray())
        {   int temp=(int)c;
            n[temp]++;
        }
        for (char c:s1.toCharArray()) {
            int temp=(int)c;
            m[temp]++;
        }
        for (int i = 0; i < 256; i++) {
            if(n[i]!=m[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        String s1[]=new String[size1];
        String s2[]=new String[size2];
        for (int i = 0; i <size1; i++) {
            s1[i]=sc.nextLine();
            sc.next();
        }
        for (int i = 0; i <size2 ; i++) {
            s2[i]=sc.nextLine();
            sc.next();
        }
        Check_ANagram obj=new Check_ANagram();
        boolean result[]=obj.isAnagram(s1,s2);
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }
    }
}

package GfG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class closing_bracket {
    public static void balanced(String s,int pos){
        Stack st=new Stack();
        char c[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(c[i]=='['){
                st.push(c[i]);
            }
            if(c[i]==']'){
                st.pop();
            }
        }
    }
    public static void main(String[] args) {
        String s="[ABC[23]][89]";

    }
}
class str{
    public static boolean sum(String s){
        char[] c=s.toCharArray();
        boolean b=false;
        if(s.length()%2!=0){
            int mid=s.length()/2;
            int lsum=0;
            for(int i=0;i<mid;i++){
                lsum+=c[i];
            }
            int rsum=0;
            for (int i = mid+1; i <c.length ; i++) {
                rsum+=c[i];
            }
            if(lsum==rsum){
                b=true;
            }

        }
        return b;
    }

    public static void main(String[] args) {
        String s="12345";
        boolean m=sum(s);
        if(m){
            System.out.println(1);
        }
        else System.out.println(0);
        int a[]={1,2,3,4,5};
        int b[]=new int[4];

    }
}

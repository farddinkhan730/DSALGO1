package GfG.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Topic_wise {

}
class Decode_the_String {
    public static void main(String[] args) {
        String s="3[b2[ca]]";
        String str="";
        Stack<String> stack=new Stack<>();
        int repeat=0;
        int k=0;
        if(s.charAt(0)>=48 && s.charAt(0)<=57){
                    repeat=Integer.parseInt(s.substring(0,1));
        }
        int i=s.length()-1;
        int j=i;
        while (i>0){
            if(s.charAt(i)==']') j=i;
            if(s.charAt(i)=='['){
                String temp=s.substring(i+1,j);
                stack.push(temp);
            }
            if(s.charAt(i)>=47 && s.charAt(i)<=57){
                if(i==0) break;
                j=i;
                int temp1=Integer.parseInt(s.substring(i,j+1));
                String temp2=stack.pop();
                while (temp1-->1){
                    temp2+=temp2;
                }
                stack.push(temp2);
            }
            i--;

        }
        while (!stack.isEmpty()){
            str+=stack.pop();
        }
        for (int l = 1; l <repeat-1; l++) {
            str+=str;
        }
        System.out.println(str);

    }
}

class Longest_valid_paranthises{
    public static void valid(String s){
        Stack<Character> stack=new Stack<>();
        int len=0;
        if(s.length()==1){
            System.out.println(0);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)==')' && !stack.isEmpty()){
                len+=2;
                stack.pop();
            }
        }
        System.out.println(len);
    }

    public static void main(String[] args) {
        String s=")";
        valid(s);
         String c="a";


    }
}
class Eay_String{
        public static String transform(String S)
        {
            ArrayList s=new ArrayList();
            int count=1;
            if(S.length()==1){
                s.add(count);
                if(S.charAt(0)>=65 && S.charAt(0)<=90){
                    char c=(char)((int)S.charAt(0)+32);
                    s.add(c);
                }

                else{
                    s.add(S.charAt(0));
                }

            }
            for(int i=1;i<S.length();i++){
                if(S.charAt(i-1)==S.charAt(i)){
                    count++;
                }
                else{
                    if(S.charAt(i-1)==(char)((int)S.charAt(i)+32) || S.charAt(i-1)==(char)((int)S.charAt(i)-32) )
                    {
                        count++;
                    }
                    else{
                        s.add(count);
                        if(S.charAt(i-1)>=65 && S.charAt(i-1)<=90){
                            char c=(char)((int)S.charAt(i-1)+32);
//                            System.out.println(c);
                            s.add(c);
                        }
                        else{
                            s.add(S.charAt(i-1));
                        }
                        count=1;

                    }
                }
                if(i==S.length()-1){
                    s.add(count);
                    if(S.charAt(i-1)>=65 && S.charAt(i-1)<=90){
                        char c=(char)((int)S.charAt(i-1)+32);
//                        System.out.println(c);
                        s.add(c);
                    }
                    else if(S.charAt(i)>=65 && S.charAt(i)<=90){
                        char c=(char)((int)S.charAt(i)+32);
//                        System.out.println(c);
                        s.add(c);
                    }
//                    if(S.charAt(i-1)==(char)((int)S.charAt(i)+32) || S.charAt(i-1)==(char)((int)S.charAt(i)-32)){
//
//                    }
                    else{
                        s.add(S.charAt(i));
                    }
                }
            }
            String str="";
            for (int i = 0; i <s.size(); i++) {
                str+=s.get(i);
            }

            return str;
        }
    static void printRLE(String s)
    {
        for (int i = 0; i < s.length(); i++) {

            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length()
                    && s.charAt(i)
                    == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i)
                    + "" + count + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {
        String s="A";
//        System.out.println(transform(s));
        printRLE(s);
    }
}
class Valid_Substring{
    public static int valid_sub(String s){
        Stack stack=new Stack();
        int max=0;
        int count=0;
        for (int i = 0; i <s.length()-1 ; i++) {

            if(s.charAt(i)=='('){
                int j=i+1;
                stack.push(s.charAt(i));
                while (j<s.length() && s.charAt(j)==')'){
                    if(!s.isEmpty()) {
                        count+=2;
                        stack.pop();
                    }
//                    if(s.charAt(j)!=')'){
//                        if(max<count){
//                            max=count;
//                        }
//                        count=0;
//  9                  }
                    j++;
                }
                if(s.charAt(i+1)!=')'){
                    if(max<count){
                        max=count;
                    }
                    count=0;
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        String s="()(())(";
        System.out.println(valid_sub(s));
    }
}
class remove_outermost_paranthesis{
    public static String remove(String s) {

        Stack stack = new Stack();
        String str="";
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == '(') {
                int j = i + 1;
                stack.push(s.charAt(i));
                if(j < s.length() && s.charAt(j) == ')') {
                    str+=s.charAt(i);
                    str+=s.charAt(j);
                    if (!s.isEmpty()) {
                        stack.pop();
                    }
                }

            }

        }
        return str;
    }

    public static void main(String[] args) {
        String s = "(()())()(";
        System.out.println(remove(s));
    }
}
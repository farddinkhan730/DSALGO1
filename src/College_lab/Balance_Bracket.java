package College_lab;

import java.util.Scanner;
import java.util.Stack;

public class Balance_Bracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character> s=new Stack<>();
        char[] c=str.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            switch (c[i]) {
                case '(':
                    s.push(c[i]);
                    break;
                case '{':
                    s.push(c[i]);
                    break;
                case '[':
                    s.push(c[i]);
                    break;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ')') {
                if ('(' == s.peek()) {
                    s.pop();
                }
            }
            if(c[i]==']')
                if('['==s.peek()) {
                    s.pop();
                }
            if(c[i]=='}')
            if('{'==s.peek()){
                s.pop();
            }
        }
        System.out.println(s.isEmpty());
    }

}

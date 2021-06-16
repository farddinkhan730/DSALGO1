package LeetCode.Stack.Stack;

import java.util.Locale;
import java.util.Stack;

public class valid_Parantheses {
    public static boolean valid(String s){
        Stack<Character> st=new Stack();
        for (int i = 0; i < s.length(); i++)
            switch (s.charAt(i)){
                case '(': st.push('(');
                break;
                case '{': st.push('{');
                break;
                case '[': st.push('[');
                break;
                case ')': if ( st.size()==0 ||'('!=st.peek() ) return false;
                            else st.pop();;
                            break;
                case '}':if (st.size()==0 || '{'!=st.peek()) return false;
                            else  st.pop();
                    break;
                case ']':if (st.size()==0 || '['!=st.peek()) return false;
                        else st.pop();
                    break;
        }
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)=='('){
//                st.push('(');
//            }
//            else if(s.charAt(i)=='{'){
//                st.push('{');
//            }
//            else if(s.charAt(i)=='[')
//                st.push('[');
//
//            if(s.charAt(i)==')' ) {
//                if(st.isEmpty())
//                    return false;
//                if(st.peek()=='(' ){
//                    st.pop();
//                }
//                else break;
//            }
//            if (s.charAt(i)=='}'){
//                if(st.isEmpty())
//                    return false;
//                if(st.peek()=='{' )
//                    st.pop();
//                else break;
//            }
//            if (s.charAt(i)==']' )
//                if(st.isEmpty())
//                    return false;
//
//            if (st.peek()== '[' )
//                st.pop();
//            else break;
//
//        }
        if (st.isEmpty()){
            return true;
        }
        else return false;

    }
    public static void main(String[] args) {
        String s="[]";
        System.out.println(valid(s));
    }
}

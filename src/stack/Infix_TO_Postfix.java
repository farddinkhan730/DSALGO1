package stack;
/* Java implementation to convert
infix expression to postfix*/
// Note that here we use Stack class for Stack operations

import java.util.*;

class Test
{

    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // The main method that converts
    // given infix expression
    // to postfix expression.
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                stack.push(c);

                // If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() &&
                        stack.peek() != '(' )
                    result += stack.pop();

                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c)
                        <= Prec(stack.peek())){

                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }
    public static void main(String[] args)
    {
        String exp = "34+1026+*8+[]";
        System.out.println(infixToPostfix(exp));
    }
}

class retain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1[]=new String[3];
        String s2[]=new String[3];
        for (int i = 0; i < 3; i++) {
            s1[i]=sc.nextLine();
            s2[i]=sc.nextLine();
        }
        HashSet<String> h=new HashSet<>();
        HashSet<String> h1=new HashSet<>();
        for (String c: s1) {
            h.add(c);
        }
        for (String c:s2) {
            h1.add(c);
        }
        System.out.println(h.retainAll(h1));
        System.out.println(h);

    }
}
class high{
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }
        int high=0,sec_high=0;
        for (int i = 0; i < 5; i++) {
            if (a[i] > high) {
                high = a[i];
            }
        }
        for (int i = 0; i < 5; i++){
            if (a[i]>sec_high && a[i]<high){
                sec_high=a[i];
            }
        }
        System.out.println(high +" "+ sec_high);
    }
}
class MainClass
{
    public static void doTowers(int topN, char from, char inter, char to)
    {
        if (topN == 1)
        {
            System.out.println("Disk 1 from " + from + " to " + to);
        }
        else
        {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
    public static void main(String[] args)
    {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }
}
class infix_to_postfix{
    public static int presedence(char c){
        switch (c){
            case  '^' : return 1;
            case '*':
            case '/': return 2;
            case '-':
            case '+': return 3;
        }
        return -1;
    }
//    public String infixtopost(String str){
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='('){
//
//            }
//        }
//    }

    public static void main(String[] args) {

    }
}
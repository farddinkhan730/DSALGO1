package Linked_list;//public class linklist_find_triple_sum_equal_to_given_sum {
//}
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }

}

class LinkedList{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            Node head=null;
            for(int i=0;i<n;i++)
            {int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                }
                else
                    insert(head,a);
            }

            Solve y = new Solve();
            System.out.println(y.countTriplets(head,x));
        }
    }
    public static Node insert(Node head,int a){
        if(head==null){
            return new Node(a);
        }
        head.next=insert(head.next,a);
        return head;
    }

}

// } Driver Code Ends


//User function Template for Java

class Solve
{
    static int countTriplets(Node head, int x)
    {
        Node ptr1, ptr2, ptr3;
        int count = 0;

        for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next)
            for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next)
                for (ptr3 = ptr2.next; ptr3 != null; ptr3 = ptr3.next)

                    if ((ptr1.data + ptr2.data + ptr3.data) == x)

                        count++;

        return count;

    }
}
class next_greter{
    static int[] next_greter_no(int a[],int n) {
        int re[] = new int[n];
        int j;
        int i,next;
        for ( i = 0; i < n; i++) {
            next=-1;
            for (j = i; j < n - 1; j++) {
                if (a[i] < a[j + 1]) {
                    next=a[j+1];
//                    re[i] = next;
                    break;
                }
            }
            re[i]=next;
//            if(a[i]>a[j]) re[i]=-1;
        }
        return re;
    }
    public static void main(String[] args) {
     int a[]={6,8,4,5,9};
     Stack<Long> s=new Stack<Long>();
     int n=a.length;
     int arr[]=next_greter_no(a,n);
        for (int an:arr) {
            System.out.print(an+" ");
        }
    }
        }
// A Stack based Java program to find next
// greater element for all array elements
// in same order as input.
class Next_greter_element {

    /* prints element and NGE pair for all
    elements of arr[] of size n */
    static void printNGE(int arr[], int n) {
        Stack<Integer> s = new Stack<Integer>();
        int arr1[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();
            if (s.empty())
                arr1[i] = -1;
            else
                arr1[i] = s.peek();

            s.push(arr[i]);

        }
        for (int j = 0; j < n; j++)
            System.out.println(arr[j] + " ---> " + arr1[j]);
    }

    /* Driver program to Menu.test above functions */
    public static void main(String[] args)
    {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
    }
}

class infix_to_postfix
{
    // A utility function to return precedence
    // of a given operator
    // Higher the returned value means
    // higher the precedence
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

    // The main method that converts given
    // infix expression to postfix expression.
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            // If the scanned character is an operand,
            // add it to output.
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
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression
                else
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);

            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

    // Driver method
    public static void main(String[] args)
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println(infixToPostfix(exp));
    }
}



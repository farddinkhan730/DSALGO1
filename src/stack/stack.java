package stack;

import java.util.Stack;

// implementaion of stack using arrya
public class stack {
    int max=1000;
    int top;
    int a[]=new int[max];
    public boolean isEmpity(){
        return (top<0);
    }
    public stack(){
        top=-1;
    }
    public void push(int n){
        if(top>=(max-1)){
            System.out.println("Stack overflow");
        }
        else {
            a[++top]=n;
        }
    }
    public int pop(){
        if(top<0) System.out.println("Stack under flow");
        else {
            int x=a[top--];
            return x;
        }
        return -1;
    }
    public int peek(){
        if(top<0) System.out.println("Stack underflow");
        else {int x=a[top];
        return x;}
        return 0;
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(450);
        s.push(9);
        s.push(789);
        s.push(123);
            System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpity());
        System.out.println(s.peek());
    }

}
//implentation of stack using inked list
class Stack1{
    Node head;
    class Node{
      Node next;
      int data;
      public Node(int d){
          data=d;
      }
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void push(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        }
        else {
            new_node.next=head;
            head=new_node;
        }
    }
    public int pop(){
        if(head==null)
            System.out.println("Stack is empty");
        else {
            int x= head.data;
            head=head.next;
            return x;
        }
        return 0;
    }
    public int peek(){
        if(head==null) System.out.println("stack is empty");
        else {
            int x = head.data;
            return x;
        }
        return 0;
    }

    public static void main(String[] args) {
        Stack1 s=new Stack1();
        s.push(450);
        s.push(9);
        s.push(789);
        s.push(123);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
    }
}

//queue using stack
class Queue{
    stack s1=new stack();
    stack s2=new stack();
    public void dequeue(int x){
        while(!s1.isEmpity()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpity()){
            s1.push(s2.pop());
        }
    }
    public int enqueue(){
        while(!s1.isEmpity()){
            return s1.pop();
        }
        return -1;
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.dequeue(45);
        q.dequeue(46);
        System.out.println(q.enqueue());
        System.out.println(q.enqueue());
    }
}
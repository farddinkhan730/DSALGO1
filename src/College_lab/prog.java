package College_lab;

import java.util.Scanner;

public class prog {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public void delete_Divisible_by3(Node head){
        Node h=head;
        while (h!=null){
            if(h.next.data%3==0){
                h.next=h.next.next;
            }
            h=h.next;
        }
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        prog ls=new prog();
        ls.head=new Node(23);
        ls.head.next=new Node(8);
        ls.head.next.next=new Node(3);
        ls.head.next.next.next=new Node(66);
        ls.head.next.next.next.next=new Node(45);
//        ls.head.next.next.next.next=new Node(79);
        ls.delete_Divisible_by3(ls.head);
    }
}
class String_NODE_LIST{
    Node head;
    static  class Node{
        Node next;
        char data;
        Node(char data){
            this.data=data;
        }
    }
    public void add(char x){
        Node new_node=new Node(x);
        if (head==null){
            head=new_node;
            return;
        }
        Node h=head;
        while (h.next!=null){
            h=h.next;
        }
        h.next=new_node;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String_NODE_LIST st=new String_NODE_LIST();
        for (int i = 0; i < str.length(); i++) {
            st.add(str.charAt(i));
        }
        Node h=st.head;
        while (h!=null){
            System.out.println(h.data);
            h=h.next;
        }
    }
}
class Stacks{
    char a[];
    int top;
    Stacks(int n){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        a=new char[n];
        top=-1;
    }
    public boolean isEmpty(){
        return (top<0);
    }
    public boolean isFull(){
        return (top==a.length);
    }
    public void push(char x){
        if (isFull()){
            System.out.println("Over Flow !");
            return;
        }
        else if (isEmpty()){
            a[++top]=x;
            return;
        }
        else {
            a[++top]=x;
        }
    }
    public char pop(){
        if (isEmpty()){
            System.out.println("under flow");
            return 0;
        }
            char x = a[top--];
            return x;
    }
    public int size(){
        return a.length;
    }
    public int peek(){
        return a[top];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stacks s=new Stacks(str.length());
//        s.push('f');
//        System.out.println(s.pop());
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(s.pop());
        }
    }
}
class queue{
    char a[];
    int top;
    int rear;
    queue(int n){
        a=new char[n];
        top=-1;
        rear=-1;
    }
    public boolean isEmpty(){
        if(top<0 && rear<0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(rear+1==a.length)
            return true;
        return false;
    }
    public  void enqueue(char c){
        if(isFull()){
            System.out.println("OVER FLOW");
            return;
        }
        else if(isEmpty()){
            a[++rear]=c;
            top++;
        }
        else {
            a[++rear]=c;
        }
    }
    public char dequeue(){
        if(isEmpty()){
            System.out.println("Queue Under flow");
            return 0;
        }
        else {
            char x=a[top++];
            return x;
        }
    }

    public static void main(String[] args) {
        queue q=new queue(3);
        q.enqueue('c');
        q.enqueue('r');
        q.enqueue('t');
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
class Stack_and_Queue{
    public static void main(String[] args) {
        String str="1 2 1";
        boolean flag=true;
        queue q=new queue(str.length());
        Stacks s=new Stacks(str.length());
        for (int i = 0; i < str.length(); i++) {
            q.enqueue(str.charAt(i));
            s.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if(s.pop()==q.dequeue()){
                continue;
            }
            else flag=false;
        }
        System.out.println(flag);
    }
}
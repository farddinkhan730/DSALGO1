package College_lab;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Recursion {
    public static int fact(int n){
        if(n>=1)
        return n*fact(n-1);
        return 1;
    }
    public static void head(int n){
        if(n<0) return;
        head(n-1);
        System.out.print(n+" ");
    }
    public static void tail(int n){
        if(n<0) return;
        System.out.print(n+" ");
        tail(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int d=fact(n);
        System.out.println("HEAD RECURSION");
        head(n);
        System.out.println();
        System.out.println("TAIL RECURSION");
        tail(n);
        System.out.println();
        System.out.println("FACTORIAL");
        System.out.println(d);
    }
}
class Node{
    int data;
    Node next;

}
class singlylinkedlist{
    Node head;
    singlylinkedlist(){
        head=null;
    }
    public void insert(Node new_node){
        new_node.next = null;
        if(head==null){
            head=new_node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
            head.next = new_node;

    }
    public void push(Node new_node){
        if(head==null)
        {
            head=new_node;
        }

        new_node.next=head;
        head=new_node;
    }

    public static void main(String[] args) {
        singlylinkedlist ls=new singlylinkedlist();
        Node n1=new Node();
        n1.data=10;
        n1.next=null;
        ls.insert(n1);
        n1.data=20;
        ls.push(n1);
        Node h=ls.head;
        while(h!=null){
            System.out.println(h.data);
            h=h.next;
        }
    }
}

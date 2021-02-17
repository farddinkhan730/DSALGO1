package Linked_list;

import java.util.HashSet;
import java.util.Scanner;

public class reverse_linked_list {
    Node head;
    static class Node{
        Node next;
        int data;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    public void reverse(){
        Node current=head,prev=null,temp=null;
        while (current!=null){
            temp=current.next;
            current.next=prev;
            prev=current;
           current=temp;
        }
        head=prev;
    }
    public void push(int x){
        Node new_node=new Node(x);
        new_node.next=head;
        head=new_node;
    }
    public Node insert_after(Node previous_node, int  new_data){
        if(previous_node==null){
            System.out.println("The given previous node cannot be null");
            return previous_node;
        }
        Node new_node=new Node(new_data);
        previous_node.next=new_node;
        return new_node;
    }
    public static void main(String[] args) {
        reverse_linked_list rsl = new reverse_linked_list();
        Node head= null;
        rsl.push(42);
//        rsl.push(32);
//        rsl.push(234);
//        System.out.println("linked list before reverse");
        Node nm=rsl.head;
//        while (nm != null) {
//            System.out.println(nm.data);
//            nm = nm.next;
//        }
//
        head=rsl.insert_after(rsl.head, 4);
        head=rsl.insert_after(head,5);
        head=rsl.insert_after(head,88);
        rsl.reverse();
        System.out.println();
        System.out.println("linked list after reverse");
        nm=rsl.head;
        while (nm != null) {
            System.out.println(nm.data);
            nm = nm.next;
        }
    }
}

class reverse_list_in_recursive{
    Node head;
    class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }
    public void reverse(Node n){
        if (n.next == null) {
            head=n;
            return ;
        }
        reverse(n.next);
            Node temp = n.next;
            temp.next=n;
            n.next =null;
    }
    public void push(int x){
        Node new_node=new Node(x);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public void insert(int n){
        Node new_node=new Node(n);
        if(head==null){
            head=new_node;
            return;
        }
        Node h=head;
        while(h.next!=null){
            h=h.next;
        }
        h.next=new_node;
    }

    public static void main(String[] args) {
        reverse_list_in_recursive ls=new reverse_list_in_recursive();
        ls.push(45);
        ls.insert(35);
        ls.insert(78);
        ls.insert(79);
        ls.reverse(ls.head);
        Node temp=ls.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
class loop_in_list{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }
    public void loop(Node head){
        Node temp=head;
        HashSet<Node> hs=new HashSet<>();
        while(temp!=null){
            if(hs.contains(temp)){
                System.out.println("Loop exist at "+temp.data);
                return;
            }
            hs.add(temp);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        loop_in_list ls=new loop_in_list();
        Node he=new Node(1);
        he.next=new Node(2);
        he.next.next=new Node(3);
        he.next.next.next=new Node(4);
        he.next.next.next.next=new Node(5);
        he.next.next.next.next.next=he.next;
        ls.loop(he);
    }
}
class intersection_linked_list{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }
    public static int count(Node h,Node h1){
        Node H=h, H1=h1;
        int count=0,count1=0;
        while (H!=null){
            count++;
            H=H.next;
        }
        while (H1!=null){
            count1++;
            H1=H1.next;
        }
        int d=Math.abs(count-count1);
        return d;
    }

    public static void intersection(Node head,Node head1) {
        int d=count(head,head1);
        for (int i = 0; i <d ; i++) {
            head=head.next;
        }
        while (head !=null && head1!=null){
            if(head==head1){
                System.out.println("Intersection point is "+head.data);
                return;
            }
            head=head.next;
            head1=head1.next;
        }
    }

    public static void main(String[] args) {
        intersection_linked_list ls=new intersection_linked_list();
        intersection_linked_list ls1=new intersection_linked_list();
        Node h=new Node(3);
        h.next=new Node(6);
        h.next.next=new Node(9);
        h.next.next.next=new Node(15);
        h.next.next.next.next=new Node(30);
        Node he=new Node(5);
        he.next=h.next.next.next;
        ls.intersection(h,he);
//        while (head!=null){
//            System.out.println(head.data);
//            head=head.next;
//        }
//        while (ls1.head!=null){
//            System.out.println(ls1.head.data);
//            ls1.head=ls1.head.next;
//        }
    }
}
class occurence_of_integer_in_linked_list{
    Node head;
    static class Node {
        Node Next;
        int data;

        Node(int d) {
            data = d;
        }
    }
        public int find_occurence(Node head,int x){
            int count=0;
            Node temp=head;
            while(temp!=null){
                if(temp.data==x){
                    count++;
                }
                temp=temp.Next;
            }
            return count;
        }

    public static void main(String[] args) {
        occurence_of_integer_in_linked_list ls=new occurence_of_integer_in_linked_list();
        Node h=new Node(45);
        h.Next=new Node(23);
        h.Next.Next=new Node(2330);
        h.Next.Next.Next=new Node(46);
        h.Next.Next.Next.Next=new Node(45);
        int s=ls.find_occurence(h,45);
        System.out.println(s);
    }
}

class swap_pair_wise{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }
    public void push(int x){
        Node new_node=new Node(x);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public void insert(int n){
        Node new_node=new Node(n);
        if(head==null){
            head=new_node;
            return;
        }
        Node s=head;
        while(s.next!=null){
            s=s.next;
        }
        s.next=new_node;
    }
//    public void swap(Node h,Node h2){
//        Node temp=h2;
//        h2.data=h.data;
//        h.data=temp.data;
//    }
    public Node pair_swap(Node head){
        Node temp=head;
        while(temp!=null ){
////           swap(n,n.next);
//            Node y=temp.next;
//            temp.next=temp.next.next;
//            temp.next.next=y;
//            temp=temp.next.next;
            Node n=temp.next;
            temp.next=n.next;
            n=temp;
            System.out.println(temp.data+" refrence "+temp.next);
            temp=temp.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        swap_pair_wise ls=new swap_pair_wise();
        ls.push(1);
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);
        ls.insert(5);
        ls.insert(6);
        Node h=ls.pair_swap(ls.head);
        while (h!=null){
            System.out.print(h.data+" ");
            h=h.next;
        }

    }
}
class add_two_number_in_linked_list{
    Node head;
    static class Node {
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }
    public void push(int x){
        Node new_node=new Node(x);
        if(head==null){
            head=new_node;
        }
        new_node.next=head;
        head=new_node;
    }
    public void inser(int x){
        Node nw_node=new Node(x);
        if(head==null){
            head=nw_node;
        }
        Node h=head;
        while(h.next!=null){
            h=h.next;
        }
        h.next=nw_node;
    }
    public int length(Node f){
        int count=0;
        while(f!=null){
            count++;
            f=f.next;
        }
        return count;
    }
    public void add(Node first,Node second){
        Node h=first;
        Node h1=second;
        int sum=0;
        int lenf=length(h);
        int lens=length(h1);
        if(lenf<lens){
            Node prev=null;
            while(h1!=null){
                Node temp=h1.next;
                h1.next=prev;
                prev=h1;
                h1=temp;
            }
            h1=prev;
            while(h!=null && h1!=null){
                sum=h1.data+h.data;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add_two_number_in_linked_list ls=new add_two_number_in_linked_list();
//        add_two_number_in_linked_list ls1=new add_two_number_in_linked_list();
//        Node h=new Node(1);
//        h.next=new Node(2);
//        Node n=new Node(3);
//        n.next=new Node(4);
//        n.next.next=new Node(9);
//        ls.add(h,n);
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();

        Node first = new Node(val);
        Node tail = first;
        for(int i=0; i<n-1; i++)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        int m = sc.nextInt();
        val = sc.nextInt();

        Node second = new Node(val);
        tail = second;
        for(int i=0; i<m-1; i++)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        ls.add(first,second);
    }
}
package Linked_list.doubly;

import java.util.Deque;
import java.util.LinkedList;

public class linked_list {
    Node head;
    class Node{
        Node head;
        Node prv;
        Node nxt;
        int data;
        public Node(int d){
            data=d;
        }
    }
    // to add element at front of head
    public void push(int x){
        Node new_node=new Node(x);
        new_node.nxt=head;
        new_node.prv=null;
        if(head!=null){
            head.prv=new_node;
        }
        head=new_node;
    }
    public void insert(Node temp,int x){
        Node new_node=new Node(x);
        if (temp ==null)
            System.out.println("the previous node can't be null");
        Node t=null;
        t=temp.nxt;
        temp.nxt=new_node;
        new_node.prv = temp;
        new_node.nxt = t;
        if(new_node.nxt!=null)
                new_node.nxt.prv=new_node;
    }
    public void append(int x){
        Node h=head;
        while (h.nxt!=null){
            h=h.nxt;
        }
        Node new_node=new Node(x);
        if (head == null) {
            new_node.prv = null;
            head = new_node;
            return;
        }
        new_node.prv=h;
        h.nxt=new_node;
        new_node.nxt=null;
    }
    public void insert_befor(Node next_node,int x){
        if(next_node==null) return;
        Node new_node=new Node(x);
        new_node.prv=next_node.prv;
        next_node.prv=new_node;
        new_node.nxt=next_node;
        if(next_node.prv!=null) {
            new_node.prv.nxt=new_node;
        }
        else {
            next_node=new_node;
        }


    }
    public static void main(String[] args) {
        linked_list ls=new linked_list();
        ls.push(40);
        ls.push(45);
        ls.push(78);
        ls.push(7);
        ls.insert(ls.head,45 );
        ls.append(423);
        ls.insert_befor(ls.head.nxt.nxt,7532);
        Node h=null;
        System.out.println("list");
        while (ls.head!=null){
            System.out.print(ls.head.data+" ");
            h= ls.head;
            ls.head= ls.head.nxt;
        }
        System.out.println();
        System.out.println("reverse list ");
        while (h!=null){
            System.out.print(h.data+" ");
            h=h.prv;
        }
    }
}
class Quick_sort_in_Linked_list{
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }
    public void push(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;
        }
        else {
            new_node.prev=null;
            new_node.next=head;
            if(head.prev==null){
                head.prev=new_node;
            }
            head=new_node;
        }

    }
    public Node parition(Node l,Node h){
        int pivot=h.data;
        Node i=l.prev;
        for(Node j=l;j!=h;j=j.next){
            if(j.data<=pivot){
                i=(i==null)? l : i.next;
                int temp=i.data;
                i.data=j.data;
                j.data=temp;
            }
        }
        i=(i==null)?l:i.next;
        int temp1=i.data;
        i.data=pivot;
        h.data=temp1;
        return i;
    }
    public void quicksort(Node l,Node h){
        if(h!=null && l!=h && l!=h.next) {
            Node part = parition(l,h);
            quicksort(l,part.prev);
            quicksort(part.next,h);
        }

    }
    public static void main(String[] args) {
        Quick_sort_in_Linked_list ls=new Quick_sort_in_Linked_list();
        ls.push(45);
        ls.push(76);
        ls.push(78);
        Node nn= ls.head;
        Node nm=ls.head;
        while (nm.next!=null){
            nm=nm.next;
        }
        ls.quicksort(ls.head,nm);
        while (ls.head!=null){
            System.out.print(ls.head.data+" ->");
            nn=ls.head;
            ls.head=ls.head.next;
        }
        System.out.println();
        System.out.println("Reverse of sorted linked list");
        while (nn!=null){
            System.out.print(nn.data+" ->");
            nn=nn.prev;
        }
    }
}
// in singlly linked list
class swap_kth_node_first_and_last{
    Node head;
    class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push(int x){
        Node new_node=new Node(x);
        new_node.next=head;
        head=new_node;
//        Node n=head;
//        if(head==null)
//        {
//            head=new_node;
//            return;
//        }
//        while (n.next!=null){
//            n=n.next;
//        }
//        n.next=new_node;
    }
    int countNodes()
    {
        int count = 0;
        Node s = head;
        while (s != null) {
            count++;
            s = s.next;
        }
        return count;
    }
    public void swap(int k){
//        Node h=head;
//        int count=1;
//        while(h.next!=null && count!=k-1) {
//            count++;
//            h = h.next;
//        }
//        Node hn=head;
//        int count1=1;
//        while (hn.next!=null){
//            count1++;
//            hn=hn.next;
//        }
//        System.out.println(count1+" c " +count);
//        int d=count1-(count+1);
//        System.out.println(d);
//        Node temp=head;
//        while(temp!=null && d!=(count1-(count+1))){
//            temp=temp.next;
//        }
//        Node temp1=h.next;
//        Node temp2=temp.next;
//        h.next=temp.next;
//        h.next.next=temp1.next;
//        temp.next=temp1;
//        temp1.next=temp2.next;
////        temp2.next=temp.next.next;
        int n = countNodes();

        if (n < k)
            return;

        if (2 * k - 1 == n)
            return;

        Node x = head;
        Node x_prev = null;
        for (int i = 1; i < k; i++) {
            x_prev = x;
            x = x.next;
        }

        Node y = head;
        Node y_prev = null;
        for (int i = 1; i < n - k + 1; i++) {
            y_prev = y;
            y = y.next;
        }

        if (x_prev != null)
            x_prev.next = y;

        if (y_prev != null)
            y_prev.next = x;

        Node temp = x.next;
        x.next = y.next;
        y.next = temp;

//        if (k == 1)
//            head = y;
//
//        if (k == n)
//            head = x;
    }
    public static void main(String[] args) {
        swap_kth_node_first_and_last ls=new swap_kth_node_first_and_last();
        ls.push(5);
        ls.push(4);
        ls.push(3);
        ls.push(2);
        ls.push(1);
        ls.swap(2);
        Node f=ls.head;
        while(f!=null){
            System.out.print(f.data+" ->");
            f=f.next;
        }
    }
}
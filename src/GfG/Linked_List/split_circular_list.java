package GfG.Linked_List;

import java.util.Scanner;

//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        next=null;
//    }
//}
//public class split_circular_list {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            next=null;
//        }
//    }
//    Node head;
//    public  void insert(int x){
//        Node new_node=new Node(x);
//        if(head==null){
//            head=new_node;
//            return;
//        }
//        Node temp=head;
//        while (temp.next!=null){
//            temp= temp.next;
//        }
//        temp.next=new_node;
//
//    }
//    public static void print(Node temp){
//        Node h=temp;
//        while (h.next!=temp){
//            System.out.print(h.data+" ");
//            h=h.next;
//        }
//        System.out.print(h.data+" ");
//        System.out.println();
//    }
//    public void split_into_circular(split_circular_list ls){
//
//        Node head1=ls.head;
//        Node fast=head1.next,slow=head1;
//
//        while (fast!=head1 && fast.next!=head1){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        Node head2=slow.next;
//        Node temp=head2;
//        while (temp.next!=head1){
//            temp=temp.next;
//        }
//        temp.next=head2;
//        slow.next=head1;
//        print(head1);
//        print(head2);
//
//
//
//
//    }
//    public static void main(String[] args) {
//        split_circular_list ls=new split_circular_list();
//        Scanner sc=new Scanner(System.in);
//        Node n=new Node(2);
//        ls.head=n;
//        n.next=new Node(15);
//        n.next.next=new Node(20);
//        n.next.next.next=new Node(13);
//        n.next.next.next.next=new Node(1);
//        n.next.next.next.next.next=n;
//        ls.split_into_circular(ls);
//
////        print(ls.head);
//
//    }
//}
class GfG {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    Node cur; // Dont change the variable name, its used in main function
    int carry; // Dont change the variable name, its used in main function

    //Function to add remaining carry.
//    Node reverse(Node h1){
//        if(h1.next==null || h1==null){
//            return h1;
//        }
//        Node curr=h1,prev=null,temp=null;
//        while(curr!=null){
//            temp=cur.next;
//            cur.next=prev;
//            prev=cur;
//            cur=temp;
//
//        }
//        h1=prev;
//
//        return h1;
//    }
    void addCarryToRemaining(Node head, GfG res)  {
        // Write code here

    }

    //Function which adds two linked lists of same size.
    void addSameSize(Node head1, Node head2, GfG res) {
        // Write code here
        Node curr=head2,prev=null,temp=null;
        while(curr!=null){
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;

        }
        Node h2=prev;
        curr=head1; prev=null;temp=null;

        while(curr!=null){
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        Node h1=prev;

        Node head12=res.cur;
        Node ll=head12;
        carry=-1;
        while(h1!=null || h2!=null) {

            if (h1 != null && h2 != null) {
                int data;
                if (carry > 0) {
                    data = h1.data + h2.data + carry;

                } else {
                    data = h1.data + h2.data;
                }
                carry = data / 10;
                data = data % 10;
                ll.data = data;
                ll = ll.next;

                h1 = h1.next;
                h2 = h2.next;
            }
            if (h1 != null) {
                ll.data = h1.data;
                ll = ll.next;

                h1 = h1.next;
            }
            if (h2 != null) {
                ll.data = h2.data;
                ll = ll.next;

                h2 = h2.next;
            }
        }
        print(res.cur);
    }
    public  void insert(int x){
        Node new_node=new Node(x);
        if(cur==null){
            cur=new_node;
            return;
        }
        Node temp=cur;
        while (temp.next!=null){
            temp= temp.next;
        }
        temp.next=new_node;

    }
    public static void print(Node temp){
        Node h=temp;
        while (h!=null){
            System.out.print(h.data+" ");
            h=h.next;
        }
//        System.out.print(h.data+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        GfG ls=new GfG();
        GfG ls1=new GfG();
        GfG ls2=new GfG();
        ls.insert(9);
        ls1.insert(8);
        ls1.insert(7);
        ls.addSameSize(ls.cur,ls1.cur,ls2);

    }
}

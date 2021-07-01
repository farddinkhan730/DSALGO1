package College_lab;

import java.util.HashSet;

public class Merge_two_list {
    static class Node{
       Node next;
        int data;
        Node(int data){
            this.data=data; }}
    Node head;
    public static Node merge(Node l1,Node l2){
        Node new_list=new Node(0);
        if(l1==null && l2==null){
            return null; }
        if(l1==null){
            return l2; }
        if(l2==null){
            return l1; }
        Node temp=l1;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=l2;
        return l1; }
    public void insert(int new_data){
       Node new_node=new Node(new_data);
        if(head==null){
            head=new Node(new_data);
            return;
        }
        new_node.next=null;
       Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=new_node;
        return;
    }
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Merge_two_list ls=new Merge_two_list();
        Merge_two_list ls1=new Merge_two_list();
        ls.insert(56);
        ls.insert(4);
        ls.insert(221);
        ls.insert(2);
        ls1.insert(3);
        ls1.insert(33);
        ls1.insert(23);
        ls1.insert(4);
        ls1.insert(6);
        ls1.insert(8);
        ls1.insert(9);
        Node root=merge(ls.head, ls1.head);
        print(root);
    }
}
class total_ocurence{
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }
        Node head;

    public void insert(int new_data){
      Node new_node=new Node(new_data);
        if(head==null){
            head=new Node(new_data);
            return;
        }
        new_node.next=null;
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=new_node;
        return;
    }
    public static void search_ocurence(Node head,int ele){
        Node temp=head;
        int count=0;
        while (temp!=null){
            if(temp.data==ele){
                count++;
            }
            temp=temp.next;
        }
        System.out.println(ele+" is occured "+count);
    }


    public static void main(String[] args){
        total_ocurence ls=new total_ocurence();
        ls.insert(34);
        ls.insert(2);
        ls.insert(67);
        ls.insert(12);
        ls.insert(2);
        ls.insert(67);
        ls.insert(2);
        search_ocurence(ls.head, 2);
    }
}
class mns{
    public static void main(String[] args) {

    }
}

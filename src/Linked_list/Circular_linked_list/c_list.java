package Linked_list.Circular_linked_list;

import java.util.Scanner;

// we stop traversal when we reach the first node again. Following is C code for linked list traversal.
public class c_list {
    Node head;
    static class Node{
        Node next;
        int data;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    static void printls(Node head){
        Node temp=head;
        if(head!=null){
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }
            while (temp!=head);
        }
    }
    static Node push(Node head_ref,
                     int data)
    {
        Node ptr1 = new Node(data);
        Node temp = head_ref;
        ptr1.next = head_ref;
        if (head_ref != null)
        {
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        }
        else
            ptr1.next = ptr1;

        head_ref = ptr1;

        return head_ref;
    }
    public static void main(String[] args) {
        Node head=null;
        head=push(head,12);
        head=push(head,56);
        head=push(head,2);
        head=push(head,11);
        printls(head);
    }
}


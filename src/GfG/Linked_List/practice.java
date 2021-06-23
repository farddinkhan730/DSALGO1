package GfG.Linked_List;

import LeetCode.Stack.Stack.Practice;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class practice {
    Node head;
    public  void insertion(int x){
        Node n=new Node(x);
        if(head==null){
            n.next=null;
            head=n;

            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        n.next=null;
        temp.next=n;

    }
    public static int nknode(Node head, int k)
    {
        // add your code here
        int count=0;
        Node temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int n=(int)Math.round(count/k);
        int i=1;

        if(n>count ){
            return -1;
        }
        while(head!=null && i!=n){
            head=head.next;
        }

        return head.data;
    }
    public static void print(Node head){

        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node addNode(Node new_list,Node node1){

        Node temp=node1;
        //temp.next=null;
        temp.next=new_list;
        new_list=temp;

        return new_list;

    }
    static Node mergeResult(Node node1, Node node2)
    {
        // Your code here
        Node new_list=null;
        while(node1!=null && node2!=null){

            if(node1.data<node2.data){
                new_list=addNode(new_list,node1);

            }
            else{
                new_list=addNode(new_list,node2);
            }
            node1=node1.next;
            node2=node2.next;

            int n= new_list.data;
            if(new_list.next!=null) {
                int n1 = new_list.next.data;
            }

        }
        while(node1!=null){
            new_list=addNode(new_list,node1);
            node1=node1.next;
        }
        while(node2!=null){
            new_list=addNode(new_list,node2);
            node2=node2.next;
        }
        return new_list;
    }
    public static void main(String[] args) {
        practice ls=new practice();
        practice ls1=new practice();
//        Node head=new Node(343);
        ls.insertion(5);
        ls.insertion(10);
        ls.insertion(15);
        ls.insertion(40);
        ls1.insertion(2);
        ls1.insertion(3);
        ls1.insertion(20);
//        nknode(ls.head, 2);
        Node h=mergeResult(ls.head,ls1.head);
        print(h);
        print(ls.head);
        print(ls1.head);
    }

}
/*Linked List Node*/
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d;
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }

}

class Solution
{
    LNode head;
    public  void insertion(int x){
        LNode n=new LNode(x);
        if(head==null){
            n.next=null;
            head=n;

            return;
        }
        LNode temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        n.next=null;
        temp.next=n;

    }
    public static TNode sortedListToBST(LNode head)
    {
        //code here
        if(head==null){
            return null;
        }
        int i=1;
        ArrayList<Integer> al=new ArrayList<>();
        LNode temp=head;
        while(temp!=null){
            al.add(temp.data);

            temp=temp.next;
        }
        TNode root=BST(al,0,al.size()-1);

        return root;

    }
    public static TNode BST(ArrayList<Integer> al, int s, int e){

        // TNode left=al.get(2*i);
        // TNode right=al.get(2*i+1);
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        TNode root=new TNode(al.get(mid));
        root.left=BST(al,s,mid-1);
        root.right=BST(al,mid+1,e);

        return root;

    }
    public static void preorde(TNode root){
        if(root==null){
            return;
        }

        System.out.println(root.data);
        preorde(root.left);
        preorde(root.right);
    }
    int compare(Node node1, Node node2)
    {
        //Your code here
        String s1="";
        String s2="";
        while(node1!=null){
            s1+=node1.data;
            node1=node1.next;
        }
        while (node2!=null){
            s2+=node2.data;
            node2=node2.next;
        }
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {
        Solution al=new Solution();
        al.insertion(1);
        al.insertion(2);
        al.insertion(3);
        al.insertion(4);
        al.insertion(5);
        al.insertion(6);
        al.insertion(7);
        TNode root=sortedListToBST(al.head);
        preorde(root);


    }
}

package Linked_list.doubly;

import java.util.*;

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
class mergesort{
    public void merge(int a[],int l[] ,int []r ){
        int n=l.length;
        int m=r.length;
        int i=0,j=0,k=0;
        while( i<n && j<m){
            if(l[i]<=r[j]){
                a[k++]=l[i++];
            }
            else {
                a[k++]=r[j++];
            }
        }
        while (i<n){
            a[k++]=l[i++];
        }
        while(j<m){
            a[k++]=r[j++];
        }
    }
    public void merge_sort(int a[]){
        int l=0;
        int r=a.length;

        if(r<l) return;
        if(a.length<2)  return;
        int n=a.length;
        if (l<r){
            int mid=l+(r-l)/2;
            int left[]=new int[mid];
            int rigth[]=new int[n-mid];
            for (int i = 0; i < mid; i++) {
                left[i]=a[i];
            }
            for (int j = mid; j <n ; j++) {
                rigth[j-mid]=a[j];
            }
            merge_sort(left);
            merge_sort(rigth);
            merge(a,left,rigth);
        }
    }

    public static void main(String[] args) {
        int a[]={1,54,78,32,0,2,3,4,89};
        mergesort obj=new mergesort();
        obj.merge_sort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
class doubly_linked_list_merge_sort{
    Node head;
    static class Node{
        Node next;
        Node prev;
        int data;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }
    Node mid_node(Node h){
        Node fast=h,slow=h;
        while(fast.next!=null && fast.next.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node temp=slow.next;
        slow.next=null;

        return temp;
    }
    Node sortDoubly(Node head)
    {
        // add your code here
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        Node mid=mid_node(temp);

        Node left=sortDoubly(head);
        Node right=sortDoubly(mid);

        Node result=merge(left,right);
        return result;
    }
    Node merge(Node l,Node r){
        if(l==null) return r;
        if(r==null) return l;

        if(l.data<r.data){
            l.next=merge(l.next,r);
            l.next.prev=l;
            l.prev=null;
            return l;
        }
        else{
            r.next=merge(l,r.next);
            r.next.prev=r;
            r.prev=null;
            return r;
        }
        // return l;
    }
    public void push(int x){
        Node new_node=new Node(x);
        if(head==null) head=new_node;
        new_node.next=head;
        head=new_node;
    }
    void print(Node node) {
        Node temp = node;
        System.out.println("Forward Traversal using next pointer");
        while (node != null) {
            System.out.print(node.data + " ");
            temp = node;
            node = node.next;
        }
        System.out.println("\nBackward Traversal using prev pointer");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        doubly_linked_list_merge_sort list = new doubly_linked_list_merge_sort();
        list.head = new Node(10);
        list.head.next = new Node(30);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(20);
        list.head.next.next.next.next.next = new Node(5);


        Node node = null;
        node = list.sortDoubly(list.head);
        System.out.println("Linked list after sorting :");
        list.print(node);

    }
}
class delete_Node_same_As_x{
    Node head;
    class Node{
        Node next;
        Node prev;
        int data;
        Node(int d){
        data=d;
        }
    }
    public Node delete_Node(Node x){
        if(head==null || x==null){
            return null;
        }
        if(head==x){
            head=x.next;
        }
        if(x.next!=null){
            x.next.prev=x.prev;
        }
        if(x.prev!=null){
            x.prev.next=x.next;
        }
        x=null;
        return head;
    }
    public void delete(Node head,int x){
        Node temp=head;
        Node current;
        if(head==null) return;
        while (temp!=null){
            if(temp.data==x) {
                current = temp.next;
                delete_Node(temp);
                temp = current;
            }
            else {
                temp=temp.next;
            }
        }
    }
    public void push(int x){
        Node new_node=new Node(x);
        if (head==null){
            head=new_node;
            return;
        }
        new_node.prev=null;
        new_node.next=head;
        if (head!=null) head.prev=new_node;
        head=new_node;
    }
    public static void main(String[] args) {
        delete_Node_same_As_x ls=new delete_Node_same_As_x();
        ls.push(45);
        ls.push(47);
        ls.push(77);
        ls.push(33);
        ls.push(85);
        ls.push(45);
        ls.delete(ls.head,45);
        Node h=ls.head;
        while(h!=null){
            System.out.println(h.data);
            h=h.next;
        }
    }
}
class sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={60,5,12,25,24,8,49,61,45,28,3,6,19,40,34,50,33,39,10,4,21,44,1,15,27,55,54,18,26,7,11,13,31,47,9,2,16};
        Arrays.sort(a);
        System.out.println("Cyber security class student's Roll Number's");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Roll no "+a[i]);
        }

    }
}
class remove_duplicate_element{
    Node head;
    class Node{
        Node next;
        Node prev;
        int data;
        Node(int d){
            data=d;
        }
    }
    public Node delete_Node(Node x){
        if(head==null || x==null){
            return null;
        }
        if(head==x){
            head=x.next;
        }
        if(x.next!=null){
            x.next.prev=x.prev;
        }
        if(x.prev!=null){
            x.prev.next=x.next;
        }
        x=null;
        return head;
    }
    public Node delete(Node head){
        Node temp=head;
        Node current;
        Node temp1=head;
        if(head==null) return null;
        while (temp!=null){
            temp1=temp.next;
            while(temp1!=null) {
                if (temp.data == temp1.data) {
//                    current = temp1.next;
                    head=delete_Node(temp1);
                    temp1 = temp1.next;
                } else {
                    temp1 = temp1.next;
                }
            }
            temp=temp.next;
        }
        return head;
    }
    public void push(int x){
        Node new_node=new Node(x);
        if (head==null){
            head=new_node;
            return;
        }
        new_node.prev=null;
        new_node.next=head;
        if (head!=null) head.prev=new_node;
        head=new_node;
    }
    public static void main(String[] args) {
        remove_duplicate_element ls=new remove_duplicate_element();
        ls.push(45);
        ls.push(47);
        ls.push(77);
        ls.push(33);
        ls.push(85);
        ls.push(77);
        ls.push(99);
        ls.push(85);
        ls.push(45);
        Node h=ls.delete(ls.head);
//        Node h=ls.head;
        while(h!=null){
            System.out.println(h.data);
            h=h.next;
        }
    }
}
class Sort_a_K_sorted{
    Node head;
    class Node {
        Node head;
        Node next;
        Node prev;
        int data;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }
    public void sort(Node head,int k){
        if(head==null) return;
        Node h=head;
//        Node tmep=head;
        int count=-1;
        while (h!=null){
            count++;
            if(count==k){
                Node h1=h.next;
                if(h.data<h1.data){
                    Node temp=h;
                    if(h.next!=null)
                    h.next.prev=h.prev;
                    if(h.prev!=null)
                        h.prev.next=h.next;
                }
            }
            h=h.next;
        }
    }
    public void push(int x){
        Node new_node=new Node(x);
        if(head==null) head=new_node;
        new_node.prev=null;
        new_node.next=head;
        if(head!=null){
            new_node.next=head;
            head=new_node;
        }
        head = new_node;
    }

    public static void main(String[] args) {
        Sort_a_K_sorted ls=new Sort_a_K_sorted();
        ls.push(3);
        ls.push(6);
        ls.push(2);
        ls.push(12);
        ls.push(56);
        ls.push(8);
//        ls.push(99);
//        ls.push(85);
//        ls.push(45);
       ls.sort(ls.head,2);
        Node h=ls.head;
        while(h!=null){
            System.out.println(h.data);
            h=h.next;
        }
    }
}

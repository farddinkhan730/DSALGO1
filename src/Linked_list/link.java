package Linked_list;

import java.util.HashSet;

public class link {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data =d;
            next=null;
        }
    }

    public static void main(String[] args) {
        link obj1 = new link();
        obj1.head = new Node(2);
        Node second = new Node(3);
        Node third=new Node(1);
        obj1.head.next=second;
        second.next=third;
        System.out.println(obj1.head.next.data);
    }
}
//In the previous program, we have created a simple linked list with three nodes.
// Let us traverse the created list and print the data of each node.
// For traversal, let us
// write a general-purpose function printList() that prints any given list.
 class link1 {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data =d;
            next=null;
        }
    }
    public void push(int x){
        Node new_node=new Node(x);
        new_node.next=head;
        head=new_node;
    }
    public void insert_after(Node previous_node,int  new_data){
        if(previous_node==null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node=new Node(new_data);
        new_node.next=previous_node.next;
        previous_node.next=new_node;
    }
    public void append(int new_data){
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

    public static void main(String[] args) {
        link1 obj1 = new link1();
        obj1.head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(1);
        obj1.head.next = second;
        second.next = third;
        Node n = obj1.head;
        while (n != null) {
            System.out.print(n.data+" -> ");
            n = n.next;
        }
        //add node at first
        obj1.push(56);
        Node v = obj1.head;
        System.out.println();
        while (v != null) {
            System.out.print(v.data+" -> ");
            v = v.next;
        }
        System.out.println("null");
        // add node after a given node
        obj1.insert_after(obj1.head.next.next,34);
        Node N=obj1.head;
        System.out.println();
        while(N!=null){
            System.out.print(N.data+" ->");
            N=N.next;
        }
        System.out.println("null");

        // add node at the end
        obj1.append(99);
        Node N1=obj1.head;
        System.out.println();
        while(N1!=null){
            System.out.print(N1.data+" ->");
            N1=N1.next;
        }
        System.out.println("null");

    }
}

// delete the node from a lonk list
class delete_node{
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data =d;
            next=null;
        }
    }
    public void push(int x){
        Node new_node=new Node(x);
        new_node.next=head;
        head=new_node;
    }
    public void insert_after(Node previous_node, int  new_data){
        if(previous_node==null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node=new Node(new_data);
        new_node.next=previous_node.next;
        previous_node.next=new_node;
    }
    public void append(int new_data){
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
    public void delete(int x){
        Node temp=head,prev=null;
//        if(temp!=null && temp.data==x){
//            head=temp.next;
//            return;
//        }
        for (int i=0;i<x+1;i++){
            if(temp!=null && i==x){
                prev=temp;
                temp=temp.next;
            }
        }
        while (temp!=null && temp.data!=x){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null) return;
        prev.next=temp.next;
    }

    public static void main(String[] args) {
        delete_node obj1 = new delete_node();
        obj1.head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(1);
        obj1.head.next = second;
        second.next = third;
        Node n = obj1.head;
        obj1.delete(3);obj1.append(23);
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
    }
}
class swap_node{
    Node head;
    static class Node {
        int data;
        Node next;
    public Node( int d) {
            next = null;
            data = d;
        }
    }
    static Node swap(Node head,Node x,Node y){
        Node temp=null,prev=head;
        while(head!=null){
            if(head.next==x || head.next==y){
                if(head.next==x) {
                    temp = head.next;
                    prev=y;
                    y.next=head.next.next;
                }
                if(head.next==y){
                    temp = head.next;
                    prev=x;
                    y.next=head.next.next;   temp = head.next;
                    prev=x;
                    x.next=head.next.next;
                }
            }
            head=head.next;
        }
        return head;
    }
    public static void main(String[] args) {
        swap_node ls=new swap_node();
        ls.head=new Node(1);
        Node s=new Node(23);
        Node sa=new Node(79);
        Node sb=new Node(46);
        Node cx=swap(ls.head, s,sb);
        while(cx!=null){
            System.out.println(cx.data);
            cx=cx.next;
        }
    }
}

class list{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void last_Node(){
        Node lst=head;
        Node sec_last=null;
        if(head==null || head.next==null)
            return;
        while( lst.next!=null){
            sec_last=lst;
            lst=lst.next;
        }
        sec_last.next=null;
        lst.next=head;
        head=lst;

    }
    public void push(int d){
        Node new_Node=new Node(d);
        new_Node.next=head;
        head=new_Node;
    }
    public static void main(String[] args) {
        list ls=new list();
        ls.push(3);
        ls.push(2);
        ls.push(1);
        ls.last_Node();
        Node ob=ls.head;
        while (ob!=null){
            System.out.println(ob.data);
            ob=ob.next;
        }
    }
}

class linked_LIst{
    Node head;
    static class Node{
        Node next;
        int data;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    public void insert(int datad){
        Node neww =new Node(datad);
        if(head==null){
            head=neww;
        }

        else {
            head.next=neww;

        }
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public static linked_LIst Intersection(Node h, Node h1){
        Node temp=h;
        Node curr=h1;
        linked_LIst newli=new linked_LIst();
        while(temp!=null){
            curr=h1;
            while (curr!=null){
                if(temp.data==curr.data){
                    newli.insert(temp.data);
                }
                curr= curr.next;
            }
            temp=temp.next;
        }
        return newli;
    }

    public static void main(String[] args) {
        linked_LIst ls=new linked_LIst();
        linked_LIst ls1=new linked_LIst();
        ls.push(5);
        ls.push(4);
        ls.push(3);
        ls.push(2);
        ls1.push(9);
        ls1.push(8);
        ls1.push(5);
        ls1.push(4);
        ls1.push(3);
        linked_LIst nls=Intersection(ls.head,ls1.head);
        Node obj=nls.head;
        while(obj!=null){
            System.out.println(obj.data);
            obj=obj.next;
        }

    }
}
class abc{
    Node head;
    static class Node{
        Node next;
        int data;
        public Node(int d){
            data=d;
        }
    }
    public int commonpoint(Node h, Node h1){
        HashSet<Node> hs=new HashSet<>();
        while (h!=null){
            hs.add(h);
            h=h.next;
        }
        while (h1!=null){
            if(hs.contains(h1)){
                return h1.data;
            }
            h1=h1.next;
        }
        return -1;

    }
    public void push(int n){
        Node newd=new Node(n);
        newd.next=head;
        head=newd;
    }
    public static void main(String[] args) {
        abc ls=new abc();
        abc ls1=new abc();
        ls.push(5);
        ls.push(4);
        ls.push(3);
        ls.push(2);
        ls1.push(9);
        ls1.push(8);
        ls1.push(5);
        ls1.push(44);
        ls1.push(31);
        int  nls=ls.commonpoint(ls.head,ls1.head);
        System.out.println(nls);

    }
}
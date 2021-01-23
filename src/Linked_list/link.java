package Linked_list;

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

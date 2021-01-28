package Linked_list;

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
//    public Node insert_after(Node previous_node, int  new_data){
//        if(previous_node==null){
//            System.out.println("The given previous node cannot be null");
//            return previous_node;
//        }
//        Node new_node=new Node(new_data);
//        new_node.next=previous_node.next;
//        previous_node.next=new_node;
//        return new_node;
//    }
    public static void main(String[] args) {
        reverse_linked_list rsl = new reverse_linked_list();
        Node head= null;
        rsl.push(42);
        rsl.push(32);
        rsl.push(234);
        System.out.println("linked list before reverse");
        Node nm=rsl.head;
        while (nm != null) {
            System.out.println(nm.data);
            nm = nm.next;
        }
//
//        head=rsl.insert_after(head,4);
//        head=rsl.insert_after(head,5);
//        head=rsl.insert_after(head,88);
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

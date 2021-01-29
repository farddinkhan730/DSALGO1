package Linked_list.doubly;

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

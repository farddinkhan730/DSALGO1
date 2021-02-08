package Linked_list.Circular_linked_list;

class Node {
    Node next;
    int data;
    Node(int d){
        data=d;
    }
}
public class cir {
    Node head;
    public void insert12(Node head,int da){
        Node h=head;
        Node new_node=new Node(da);
            if(head ==null){
                new_node.next=new_node;
                head=new_node;
            }
            else {
                while (h.next != head && h.next.data < new_node.data) {
                    h = h.next;
                }
                Node temp1=h.next;
                h.next=new_node;
                new_node.next=temp1;
            }

    }
    public void push(int x){
        Node new_node=new Node(x);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public void insert(int n){
        Node new_node=new Node(n);
        if(head==null){
            head=new_node;
            return;
        }
        Node s=head;
        while(s.next!=null){
            s=s.next;
        }
        s.next=new_node;
    }

    public static void main(String[] args) {
        cir ls=new cir();
        ls.head=new Node(1);
        ls.head.next=new Node(2);
        ls.head.next.next=new Node(3);
        ls.head.next.next.next=new Node(4);
        ls.head.next.next.next.next=ls.head;
        ls.insert12(ls.head,3);
        Node he=ls.head;
        while (he.next!=ls.head){
            System.out.print(he.data+" ");
            he=he.next;
        }
    }
}

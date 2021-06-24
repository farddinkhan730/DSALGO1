package College_lab.Assignment;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class SinglyLinkedList {
    Node head;
    public void insert(int x){
        Node new_node=new Node(x);
        if(head==null){
            head=new_node;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    public static void print(Node h){
        while (h!=null){
            System.out.print(h.data+" ");
        }
        System.out.println();
    }
    public int getNumber(SinglyLinkedList list){

        Node temp=list.head;
        int s=0;
        while (temp!=null){
            s=s*10+temp.data;
            temp=temp.next;
        }
        return s;

    }

    public static void main(String[] args) {
        SinglyLinkedList ls=new SinglyLinkedList();
        ls.insert(1);
        ls.insert(8);
        ls.insert(6);
        ls.insert(2);
        int n=ls.getNumber(ls);
        System.out.println(n);
    }

}

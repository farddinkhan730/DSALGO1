package College_lab.Assignment;

public class LinkedList_Linearsearch {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data =d;
            next=null;
        }
    }
    public boolean Linear_Search1(Node head,int x){

        boolean b=false;
        Node temp=head;
        while (temp!=null){
            if(temp.data==x){
                b=true;
            }
            temp=temp.next;
        }
        return b;

    }

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

    public static void main(String[] args) {
        LinkedList_Linearsearch ls=new LinkedList_Linearsearch();
        ls.insert(56);
        ls.insert(4);
        ls.insert(221);
        ls.insert(2);
        ls.insert(43);
        System.out.println(ls.Linear_Search1(ls.head,221));
        System.out.println(ls.Linear_Search1(ls.head,0));

    }


}

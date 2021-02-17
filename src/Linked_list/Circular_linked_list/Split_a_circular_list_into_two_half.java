package Linked_list.Circular_linked_list;

public class Split_a_circular_list_into_two_half
{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
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
//    public void split(Split_a_circular_list_into_two_half ls){
//        Node h= ls.head;
//        Node slow=head,fast=head;
//        while (slow.next!=h && fast.next!=h){
//               slow=slow.next;
//               fast=fast.next.next;                           //what is the problem in this method
//        }
//        Node h1=ls.head;
//        while (h1.next!=slow){
//            System.out.print(h1.data+" ");
//            h1=h1.next;
//        }
//        Node n=slow.next;
//        System.out.println();
//        while (n.next!=ls.head){
//            System.out.print(n.data+" ");
//            n=n.next;
//        }
//    }
    public void split_circular(Split_a_circular_list_into_two_half ls){
        int count=0;
        Node h=ls.head;
        Node h1=ls.head;
        while (h.next!=ls.head){
//            System.out.println(count);
            count++;
            h=h.next;
        }
//        System.out.println(count);
        int mid=count/2;
        int i=0;
        while (h1.next!=ls.head && i<=mid ){
//            System.out.println(i);
            i++;
            System.out.print(h1.data+" ");
            h1=h1.next;
        }
        Node h2=h1;
        System.out.println();
        while (h2!=ls.head){
            System.out.print(h2.data+" ");
            h2=h2.next;
        }
    }

    public static void main(String[] args) {
        Split_a_circular_list_into_two_half l = new Split_a_circular_list_into_two_half();

//        Node h=new Node(45);
//        h.next=new Node(36);                      why this commented line is not working
//        h.next.next=new Node(78);
//        h.next.next.next=new Node(21);
        l.head= new Node(2);
        l.head.next = new Node(15);
        l.head.next.next = new Node(20);
        l.head.next.next.next = new Node(13);
        l.head.next.next.next.next=new Node(1);
        l.head.next.next.next.next.next = l.head;
//        Node m=l.head;
//        while (m.next!=null){
//            m=m.next;
//        }
//        m.next=l.head;
//        l.split(l);
        l.split_circular(l);
    }
}
class detect_loop{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }
    public boolean detect(Node h){
        Node h1=h;
        Node slow=h,fast=h;
        int flag=0;
        while(slow!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        detect_loop ls=new detect_loop();
        Node head=new Node(45);
        head.next=new Node(23);
        head.next.next=new Node(75);
        head.next.next.next=new Node(98);
        head.next.next.next.next=new Node(55);
//        head.next.next.next.next.next=head;
        boolean b=ls.detect(head);
        System.out.println(b);
    }
}

class delete_middle_node{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
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
    public void delete(Node head){
        Node h1=head,m=head,n=head;
        int count=0;
        while(h1!=null){
            count++;
            h1=h1.next;
        }
        System.out.println(count);
        int mid=count/2;
        System.out.println(mid);
        if(count%2==0){
            int i=0;
            while (m!=null && i<mid+1){     // Exception m is null
                m=m.next;
            }
            m.next=m.next.next;
            System.out.println(m.data);
        }
        else {
            int i=0;
            while(n!=null && i<mid){         //Exception n is null
                n=n.next;
            }
            n.next=n.next.next;
        }
    }

    public static void main(String[] args) {
        delete_middle_node ls=new delete_middle_node();
        ls.push(23);
        ls.push(4);
        ls.push(77);
        ls.push(45);
        ls.push(78);
//        Node head=new Node(1);
//        head.next= new Node(2);
//        head.next.next=new Node(3);
//        head.next.next.next=new Node(4);
//        head.next.next.next.next=new Node(5);
//        head.next.next.next.next.next=new Node(6);
        ls.delete(ls.head);
        Node h=ls.head;
        while(h!=null){
            System.out.print(h.data+" ");
            h=h.next;
        }
    }
}
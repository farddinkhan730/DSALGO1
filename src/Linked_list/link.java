package Linked_list;

import java.io.IOException;
import java.util.*;

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
    public static Node reverseBetween(Node node, int m, int n)
    {
        Node temp=node;
        int i=1;
        for(i=1;i<m;i++){
            temp=temp.next;
        }
        Node cur=temp;
        Node prev=null,nex=null;
        while(cur!=null  && i!=(n+1)){
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
            i++;
        }
        cur=prev;
//        while (cur!=null){
//            System.out.println(cur.data);
//            cur=cur.next;
//        }
        Node tm=node;
        while(tm.next!=null){
            System.out.println(tm.data);
            tm=tm.next;
        }
            tm.next=cur;
    //        while(tm!=null){
    //            System.out.println(tm.data);
    //            tm=tm.next;
    //        }
//        t.next=nex;
        return node;
    }

    public static void main(String[] args) {
        link1 obj1 = new link1();
        obj1.append(1);
        obj1.append(2);
        obj1.append(3);
        obj1.append(4);
        obj1.append(5);
        obj1.append(6);
        obj1.append(7);
        obj1.append(8);
        obj1.append(9);
        obj1.append(10);

        Node m=reverseBetween(obj1.head, 2,4);
//        while (m!=null){
//            System.out.println(m.data);
//            m=m.next;
//        }
//        obj1.head = new Node(2);
//        Node second = new Node(3);
//        Node third = new Node(1);
//        obj1.head.next = second;
//        second.next = third;
//        Node n = obj1.head;
//        while (n != null) {
//            System.out.print(n.data+" -> ");
//            n = n.next;
//        }
//        //add node at first
//        obj1.push(56);
//        Node v = obj1.head;
//        System.out.println();
//        while (v != null) {
//            System.out.print(v.data+" -> ");
//            v = v.next;
//        }
//        System.out.println("null");
//        // add node after a given node
//        obj1.insert_after(obj1.head.next.next,34);
//        Node N=obj1.head;
//        System.out.println();
//        while(N!=null){
//            System.out.print(N.data+" ->");
//            N=N.next;
//        }
//        System.out.println("null");
//
//        // add node at the end
//        obj1.append(99);
//        Node N1=obj1.head;
//        System.out.println();
//        while(N1!=null){
//            System.out.print(N1.data+" ->");
//            N1=N1.next;
//        }
//        System.out.println("null");

    }
}

// delete the node from a link list
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

// Java program for Quick Sort on Singly Linled List

/*sort a linked list using quick sort*/
 class QuickSortLinkedList
{
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            this.data = d;
            this.next= null;
        }
    }

    Node head;

    void addNode(int data)
    {
        if(head == null)
        {
            head = new Node(data);
            return;
        }

        Node curr = head;
        while(curr.next != null)
            curr = curr.next;

        Node newNode = new Node(data);
        curr.next = newNode;
    }

    void printList(Node n)
    {
        while(n != null)
        {
            System.out.print(n.data);
            System.out.print(" ");
            n = n.next;
        }
    }

    // takes first and last node,
// but do not break any links in
// the whole linked list
    Node paritionLast(Node start, Node end)
    {
        if(start == end ||
                start == null || end == null)
            return start;

        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.data;

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while(start != end )
        {
            if(start.data < pivot)
            {
                // keep tracks of last modified item
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }

        // swap the position of curr i.e.
        // next suitable index and pivot
        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;

        // return one previous to current
        // because current is now pointing to pivot
        return pivot_prev;
    }

    void sort(Node start, Node end)
    {
        if(start == end )
            return;

        // split list and partion recurse
        Node pivot_prev = paritionLast(start, end);
        sort(start, pivot_prev);

        // if pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        if( pivot_prev != null &&
                pivot_prev == start )
            sort(pivot_prev.next, end);

            // if pivot is in between of the list,
            // start from next of pivot,
            // since we have pivot_prev, so we move two nodes
        else if(pivot_prev != null &&
                pivot_prev.next != null)
            sort(pivot_prev.next.next, end);
    }

    // Driver Code
    public static void main(String[] args)
    {
        QuickSortLinkedList list = new QuickSortLinkedList();
        list.addNode(30);
        list.addNode(3);
        list.addNode(4);
        list.addNode(20);
        list.addNode(5);

        Node n = list.head;
        while(n.next != null)
            n= n.next;

        System.out.println("Linked List before sorting");
        list.printList(list.head);

        list.sort(list.head , n);

        System.out.println("\nLinked List after sorting");
        list.printList(list.head);
    }
}

// pring linked list forward and reverse
class frwd_rvrs{
     Node head;
     class Node{
         Node next;
         int data;
         Node(int d){
             data=d;
             next=null;
         }
     }
     public static boolean search(Node head,int x){

         boolean check=false;
         Node temp=head;
         while(temp!=null){
             if(temp.data==x){
                 check=true;
                 return check;
             }
             temp=temp.next;
         }
         return check;
     }
     public void print(Node head){
         if(head!=null) {
             System.out.println(head.data);
             print(head.next);
         }
         }
     public Node insert(Node head,int d){
         Node temp= new Node(d);
         temp.next=null;
         if(head==null){
             head=temp;
         }
         else{
             Node temp1=head;
             while (temp1.next!=null) temp1=temp1.next;
             temp1.next=temp;
         }
         return head;
     }
    public void push(int n){
        Node newd=new Node(n);
        newd.next=head;
        head=newd;
    }

    void splitList(frwd_rvrs list)
    {
        Node head1=new Node(0);
        Node head2=head1;
        while (list.head.next!=list.head){
            head1.next= list.head;
            System.out.print(list.head.data+" ");
            head1=head1.next;
            list.head= list.head.next;
        }
        head1.next= list.head;
        head1.next.next=null;

        Node slow=head2 , fast=head2;

        while (fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        Node headn=slow.next;
        slow.next=head2;
        while (headn!=null){
            System.out.println(headn.data+" ");
            headn =headn.next;
        }


         }

        public static void main(String[] args) {
        frwd_rvrs ls=new frwd_rvrs();

//        head =ls.insert(head,456);
//        head=ls.insert(head,44);
//        head=ls.insert(head,78);
//        ls.print(ls.head);
        ls.push(42);
        ls.push(32);
        ls.push(234);
        ls.push(54);
        ls.push(55);
        ls.push(58);
            Node head= ls.head;
        while (head.next!=null){
            head=head.next;
        }
        head.next=head;
        ls.splitList(ls);



//        Node km=ls.head;
//        while(km!=null){
//            System.out.println(km.data);
//            km=km.next;
//        }
    }
}
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}
class GFG{
    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;
            HashMap<Node, Integer> mp = new HashMap<Node, Integer>();
            mp.put(head, head.data);
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
                mp.put(tail, tail.data);
            }

           Node failure = new Node(-1);

            Solution g = new Solution();
            head = g.pairwiseSwap(head);

           Node temp = head;
            int f = 0;
            while (temp != null)
            {
                if(mp.get(temp) != temp.data){
                    f = 1;
                }
                temp = temp.next;
            }

            if(f==1){
                printList(failure);
            }
            else{
                printList(head);
            }
            t--;
        }
    }
}


class Solution {
    public  void swap(Node head,Node h1, Node h2){
       Node temp=head; Node prev=null; Node t=null;
        while( temp!=null){
            if(temp.next==h1 || temp.next==h1){
                if(temp.next==h1){
                    t=temp.next;
                    prev=h2;
                    h2.next=temp.next.next;
                }
                if (temp.next==h2){
                    t=temp.next;
                    prev=h1;
                    h2.next=temp.next.next;
                    t=temp.next;
                    prev=h1;
                    h1.next=temp.next.next;
                }
                temp=temp.next;
            }
        }

    }
    public Node pairwiseSwap(Node head)
    {
        Node current = head;

        while (current != null && current.next != null) {
            int i=2;
            if(i==2) {
                Node prev = current;
                Node nextt = current.next;
                current.next = nextt.next;
                nextt.next = prev;
                current = current.next;
                i--;
            }
            else{
                swap(head,current,current.next);
            }

        }
        return head;
    }
}
//class Node {
//    int data;
//    Node next;
//
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}

class GfG{

    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();
            int val = sc.nextInt();

            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }

            int m = sc.nextInt();
            val = sc.nextInt();

            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }

            Solution4 g = new Solution4();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution4{
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node temp=null;
        String s="";
        String s1="";
        while(first!=null){
            s+=first.data;
        }
        while(second!=null){
            s1+=second.data;
        }
        int s2=(int)(Integer.parseInt(s)+Integer.parseInt(s1));
        String s3=    String.valueOf(s2);
        Node new_node=new Node(s3.charAt(0));
        if(temp==null)
            temp=new_node;
        for(int i=1;i<s3.length();i++){
            new_node.next=new Node(s3.charAt(i));
            new_node.next.next=null;
        }
        return temp;

    }
}
class arraylist{
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(22);
        al.add(45);
        al.add(23);
        System.out.println(al);
        al.add(1,2323);
        System.out.println(al);
        boolean b=true;
        int j=0;
        
        for (int i = 0; i <al.size() ; i++) {
            if(b){

            }
            else {
                al.add(i,al.get((al.size()-1)-j++));
//                System.out.println(i +"  "+ al.get((al.size()-1)-(i-1)));
            }
            b=!b;
//            System.out.println(b);
        }
        System.out.println(al);


    }
}
 class Solution545
{

    public static Node addOne(Node head)
    {
        //code here.
        Node temp1=head;
        Node ans=null;
        while(temp1.next!=null)
        {
            if(temp1.data!=9){
                ans=temp1;
            }
            temp1=temp1.next;

        }
        if(temp1.data!=9){
            ans=temp1;

        }

        if(ans ==null){
            Node temp=head;
            while(temp!=null){
                temp.data=0;
                temp=temp.next;

            }
            Node newnode=new Node(1);
            newnode.next=head;
            head=newnode;

        }
        else{
            ans.data++;
            ans=ans.next;

            while(ans!=null){
                ans.data=0;
                ans=ans.next;

            }
        }
        return head;

    }
}
class Solution4578
{


        public String FirstNonRepeating(String A) {
            // code here
            if (A.length() < 0) {
                return A;
            }

            HashMap<Character, Integer> hs = new HashMap<>();
            for (int i = 1; i < A.length(); i++) {
                if (hs.containsKey(A.charAt(i))) {
                    hs.put(A.charAt(i),hs.get(A.charAt(i))+1);
                }
                else {
                    hs.put(A.charAt(i),1);
                }
            }

            String  s="";
            int m=0;
            for (int i = 0; i <A.length() ; i++) {
                if(hs.get(A.charAt(i))==1) {
                    if (s.isEmpty()) {
                        s += A.charAt(i);
                        m=i;
                    }
                }
            }
            HashSet<Character> hs1=new HashSet<>();
            hs1.add(A.charAt(0));
            String str="";
            for (int i = 0; i < A.length(); i++) {
                if(i>=m){
                    str+=s;
                }
                else {
                    if(hs1.contains(A.charAt(i))){
                        str+='#';
                    }
                    else {
                        str += A.charAt(i);
                    }
                }
            }
            return str;

        }
}
class mnb{
    public static void main(String[] args) {
        System.out.println(19%10);

    }
}
package College_lab;

import java.util.Scanner;

class student1{
    int student_id;
    String stu_name;
    int sub1;
    int sub2;
    student1( int student_id,String stu_name,int sub1,int sub2){
        this.stu_name=stu_name;
        this.student_id=student_id;
        this.sub1=sub1;
        this.sub2=sub2;
    }
}
public class exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        student1[] s=new student1[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll_no name marks1 marks 2");
            s[i]=new student1(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());


//        for (int i = 0; i < n; i++) {
            if (s[i].sub2 < 40) {
                count++;
            }
            if (s[i].sub1<40){
                count++;
            }
            System.out.println(s[i].stu_name+" "+count);
        }
//        System.out.println(count);
    }
}
class Node1{
    Node1 next;
    Node1 prev;
    int data;
    Node1(int data){
        this.data=data;
//        next=null;
//        prev=null;

    }
}
class doubly{
    Node1 head;
    public boolean isEmpty(){
        return (head==null);
    }
    public void add(int x){
        Node1 new_node=new Node1(x);
        if(head==null){
            head=new_node;
//            head.prev=null;
            return;
        }
        new_node.next=head;
        head.prev=new_node;
        head=new_node;
    }
    public void inser(int x){
        Node1 new_node=new Node1(x);
        if(head==null){
            head=new_node;
        }
        Node1 n=head;
        while (n.next!=null){
            n=n.next;
        }
        n.next=new_node;
        new_node.prev=n;
//        new_node.next=null;
        new_node.next=null;
    }
    public void append(int a,int x){
        int i=1;
        Node1 new_node=new Node1(x);
        if(head==null){
            return;
        }
        int count=1;
        Node1 n=head;
        while (n!=null){
            count++;
            n=n.next;
        }
        if(a>count){
            System.out.println("index is greater than position");
        }
        else {
                Node1 n1=head;
                while (n1!=null && i<a){
                    i++;
                    n1=n1.next;
                }
            Node1 temp=n1.next;
                n1.next=new_node;
                new_node.prev=n1;
                new_node.next=temp;
                temp.prev=new_node;

        }
    }
    public void delete(int a){
        int i=1;
        if(head==null){
            return;
        }
        int count=1;
        Node1 n=head;
        while (n!=null){
            count++;
            n=n.next;
        }
        if(a>count){
            System.out.println("index is greater than position");
        }
        else {
            Node1 n1 = head;
            while (n1 != null && i < a) {
                i++;
                n1 = n1.next;
            }
            Node1 temp = n1.next.next;
            n1.next = temp;
            temp.prev = n1;
        }
    }
//    public int

    public static void main(String[] args) {
        doubly d=new doubly();
//        d.add(45);
//        d.add(75);
//        d.add(76);
        d.inser(7979);
        d.inser(258);
        d.inser(49);
        d.inser(741);
        d.inser(23);
        d.inser(7600);
        d.inser(1235);
        d.append(5,9999);
        d.delete(4);
        Node1 n=d.head;
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}
class cir{
    Node1 head;
    public void push(int x){
        Node1 new_node=new Node1(x);
        if(head==null){
            head=new_node;
            new_node.next=new_node;
            return;
        }
        Node1 temp=head;
        while (temp.next!=head) {
            temp = temp.next;
        }
        temp.next=new_node;
        new_node.next=head;
    }

    public static void main(String[] args) {
        cir c=new cir();
        c.push(46);
        c.push(79);
        c.push(55);
        Node1 n2=c.head;
        while (n2.next!=c.head){
            System.out.println(n2.data);
            n2=n2.next;
        }

    }
}
class doubly_circ{
    Node1 head;
    public void push(int x){
        Node1 new_node=new Node1(x);
        if(head==null){
            head=new_node;
            new_node.next=new_node;
            new_node.prev=new_node;
            return;
        }
        Node1 temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=new_node;
    }

    public static void main(String[] args) {
        doubly_circ dc=new doubly_circ();
        dc.push(4500);
        dc.push(798);
        dc.push(65);
        Node1 temp1=dc.head;
        while (temp1.next!= dc.head){
            System.out.println(temp1.data);
            temp1=temp1.next;
        }
    }
}
class stacksss{
    int []a;
    int top;
    stacksss(int size){
        a=new int[size];
        top=-1;
    }
    public boolean isEmpty(){
        return (top<0);
    }
    public void push(int x){
        if(top==a.length){
            System.out.println("Over Flow");
        }
        else {
            a[++top] = x;
        }
    }
    public int peek(){
       if(top<0){
           System.out.println("Stack Under flow");
           return 0;
       }
        return a[top];
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack under flow");
            return 0;
        }
        int x=a[top--];
        return x;
    }
    public void traverse(){
        for (int i=0;i< top;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        stacksss s=new stacksss(5);
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();

        for (int i=0;i<m;i++) {
            System.out.println("Enter the number want to insert in stack");
            int n=sc.nextInt();
            if (n % 2 == 0) {
                s.push(n);
            }
            else {
                System.out.println("Number cant be inserted it is not even numbe" );
            }
        }
       s.traverse();
    }
}
class que{
    int a[];
    int top=-1;
    int rear=-1;
    que(int size){
        a=new int[size];
    }
    public boolean isEmpty(){
        return (top<0 && rear<0);
    }
    public boolean isfull(){
        return (rear ==a.length);
    }
      public void enqueue(int x){
        if (isfull()){
            System.out.println("Queue over flow");
            return;
        }
        else if(isEmpty()){
            a[++top]=x;
            rear++;
        }
        else {
            if(rear+1==a.length){
                rear=0;
            }
            a[++rear]=x;
        }
      }
      public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue under flow");
            return 0;
        }
         return    a[top++];
      }
      public void traverse(){
        for (int i=top;i<=rear;i++){
            System.out.println(a[i]);
        }
      }

    public static void main(String[] args) {
        que q=new que(5);
        q.enqueue(45);
        q.enqueue(33);
        q.enqueue(76);
        q.enqueue(44);
        q.enqueue(33);
        q.dequeue();
        q.dequeue();
        q.traverse();
        q.enqueue(32);
        q.enqueue(25);
        q.traverse();
    }
}
class linkque{
    Node1 head;

    public void enqueue(int x){
        Node1 new_node=new Node1(x);
        if(head==null){
            head=new_node;
        }
        else {
            Node1 n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=new_node;
            new_node.next=null;
        }
    }
    public void dequeue(){
        head=head.next;
    }
    public void traverse(){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        linkque ql=new linkque();
        ql.enqueue(4600);
        ql.enqueue(12);
        ql.enqueue(74);
        ql.enqueue(64);
        ql.enqueue(9797);
        ql.dequeue();
        ql.dequeue();
        ql.traverse();
    }
}
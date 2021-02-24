package College_lab.Queue;

import java.util.Scanner;

public class queue {
        int a[];
        int front;
        int rear;
        int beg;
        queue(int size){
            a=new int[size];
            front=-1;
            rear=-1;
            beg=front;
        }
        public int size(){
            return a.length;
        }
        public boolean isEmpty(){
            return ((front==-1 && rear==-1) || (front==a.length)
//                    ||(front==rear)
            );
        }
        public boolean isFull(){
            if(front==a.length)
                return true;
            return false;
        }
        public void enqueue(int x){
            if(isFull()){
                System.out.println("Queue OverFlow !");
                return;
            }
            else if(isEmpty()) {
                a[++front] = x;
                rear++;
            }
            else

            {
                rear++;
                a[rear]=x;
            }
        }
        public int dequeue(){
            if(!isEmpty()) {
                int A=a[front];
                a[front]=0;
                front++;
                return A;
            }
            else{
                System.out.print("Queue UnderFlow !");
                return 0;
            }
        }
        public int peekInQueue(){
            if (isEmpty()){
                System.out.println("Queue underFlow!");
                return 0;
            }
            return a[front];
        }
        public void deleteQueue(){
            a=null;
        }
        public void traverse(){
            for (int i = front; i<=rear; i++) {
                System.out.println(a[i]);
            }
        }

    public static void main(String[] args) {
        queue q = new queue(5);
        System.out.println(q.isEmpty());
        q.enqueue(45);
//        q.enqueue(78);
        q.enqueue(78);
       // System.out.println(q.size());
        //System.out.println(q.isEmpty());
//        for (int i = 0; i < q.size(); i++) {
          //  System.out.println(q.dequeue());
        //System.out.println(q.dequeue());
        //System.out.println(q.peekInQueue());
        //System.out.println(q.size());
        //System.out.println(q.isFull());
//        q.traverse();
        //q.deleteQueue();
//        q.dequeue()
//        ;
        q.traverse();
        System.out.println(q.peekInQueue());
        q.dequeue();
        q.traverse();
//        q.dequeue()

//        }
    }
}
// Non primitve data type class use for non primitve queue
class Employee{
    String str;
    int sal;
    int id;
    Employee(String str ,int sal,int id){
        this.str=str;
        this.sal=sal;
        this.id=id;
    }
}
class Node{
    Node next;
    Employee data;
    Node(Employee data){
//        Scanner sc=new Scanner(System.in);
//        Employee e=new Employee(sc.next(),sc.nextInt(),sc.nextInt());
        this.data=data;
        next=null;
    }
}
class Queue_by_non_primitive_data_type_using_linked_list{
    Node head;
    Node tail;
    Queue_by_non_primitive_data_type_using_linked_list(){
        head=null;
        tail=null;
    }
    public void enqueue(Employee val){
        Node new_node=new Node(val);
        if(tail==null){
            tail=head=new_node;
        }
        else {
            tail.next=new_node;
        }
    }
    public void dequeue(){
        if(head==null){
            System.out.println("is Empty");
        }
        else {
            head=head.next;
        }
    }
}
class Queue_by_non_primitive_data_type_using_linked_list_Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Employee e=new Employee(sc.next(),sc.nextInt(),sc.nextInt());
//        or
        Employee e=new Employee("Atul bewakoof",450,1);
        Queue_by_non_primitive_data_type_using_linked_list q=new Queue_by_non_primitive_data_type_using_linked_list();
        q.enqueue(e);
        Node h=q.head;
        while (h!=null){
            System.out.println(h.data.str);
            h=h.next;
        }
    }
}

class queue_by_linked_list{
    Node head;
    class Node{
        Node next;
        int data;
        int front;
        Node(int d){
            data=d;
        }
    }
    queue_by_linked_list(){
        head=null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void enqueue(int x){
        Node new_node=new Node(x);
        if (isEmpty()){
            head=new_node;
        }
    }
}

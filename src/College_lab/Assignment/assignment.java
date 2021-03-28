package College_lab.Assignment;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Employee{
    int id;
    int salary;
    String Name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        Name = name;
    }
}
class Employe_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        assignment pq=new assignment();
        Employee[] a=new Employee[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=new Employee(sc.nextInt(),sc.nextInt(),sc.next());
        }
        Arrays.sort(a);
        for (int i = 10; i > 0; i++) {
            pq.push(a[i].salary,i);
        }
    }
}
//public class assignment {
////    Node head;
////    class Node {
////        int data;
////        Node next;
////        Node(int data){
////            this.data=data;
////        }
////    }
////    public void enqueue(int x){
////        Node n=new Node(x)
////
////    }
//public static void main(String[] args) {
//    PriorityQueue p=new PriorityQueue();
//}
//}

class assignment
{
    class Node {
        int data;
        int priority;
        Node next;

        public Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            this.next = next;
        }
    }
//    Node(int d, int p)
//    {
//        Node temp = new Node();
//        temp.data = d;
//        temp.priority = p;
//        temp.next = null;
//
//        return temp;
//    }
    Node head;
    public  int peek()
    {
        return (head).data;
    }


    public  Node pop()
    {
        Node temp = head;
        (head) = (head).next;
        return head;
    }

    public  Node push(int d, int p)
    {
        Node start = (head);

        Node temp = new Node(d, p);


        if ((head).priority > p) {

            temp.next = head;
            (head) = temp;
        }
        else {


            while (start.next != null &&
                    start.next.priority < p) {
                start = start.next;
            }


            temp.next = start.next;
            start.next = temp;
        }
        return head;
    }

    public  boolean isEmpty()
    {
        return (head == null);
    }

    public static void main(String[] args) {
        assignment a=new assignment();
        a.push(34,1);
        System.out.println(a.peek());
    }
}



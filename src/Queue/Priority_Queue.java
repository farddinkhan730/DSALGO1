package Queue;

class Node{
    int data;
    Node next;
    int priority;
    Node(int d,int p){
        data=d;
        priority=p;
        next =null;
    }
}
public class Priority_Queue {
    Node front,rear;

    Priority_Queue(){
        front=rear=null;
    }
    public void enqueue(int x, int p){
        Node new_node=new Node(x,p);
        if(front==null  || front.priority< new_node.priority){
            new_node.next=front;
            front=new_node;

        }
        else {
            rear=front;
            while (rear.next!=null && rear.next.priority<=new_node.next.priority){
                rear=rear.next;
            }
            new_node.next=rear.next;
            rear.next=new_node;
        }
    }
}

package College_lab.stack;

public class implementaion {
    int a[];
    int top;


    public implementaion(int size) {
        a=new int[size];
        top=-1;
    }

    public boolean isEmpty(){
//        if(top==-1){
//            return true;
//        }
//        return false;
        return (top<0);
    }
    public void push(int x){
        if(top>a.length) {
            System.out.println("stack Overflow");
        }
        else
        a[++top]=x;

    }
    public int peek(){
        int n=a[top];
        return n;
    }
    public boolean stack_is_full(){
        if(top==a.length-1)
            return true;
        return false;
    }
    public int pop() {
        if(isEmpty()){
            System.out.println("Stack Underflow !");
        }
            if (!isEmpty()) {
                return a[top--];
            }
        return -1;
    }
    public void delete_stack(){
        a=null;
    }
    public void display_stack(){
        for (int i = 0; i <=top; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        implementaion s=new implementaion(6);
        s.push(45);
        s.push(36);
        s.push(37);
//        System.out.println(s.isEmpty());
//        System.out.println(s.peek());
//        int v=s.pop();/
//        System.out.println("pop " + v);
//        System.out.println(s.pop());
        s.display_stack();

    }
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
    }
}
class implementalion_of_stack_using_linked_list{
    Node head;
    int size;
    implementalion_of_stack_using_linked_list(){
        head=null;
        int size=0;
    }
//    public int sze(){
//        return size;
//    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else {
            return false;
        }
//        return (size<=0);
    }
    public void push(int x){
        Node new_node=new Node(x);
        if(head==null){
            head=new_node;
            size=size+1;
        }
        else {
            new_node.next = head;
            head = new_node;
            size=size+1;
        }
    }
    public int pop(){
        if(size==0){
            System.out.println("Stack under flow");
            return 0;
        }
        int temp=head.data;
        head=head.next;
        size--;
        return temp;
    }
    public int peek(){
        if(size<0){
            System.out.println("Stack under flow");
            return 0;
        }
        return head.data;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete_Stack(){
        head=null;
        size=0;
    }
    public static void main(String[] args) {
        implementalion_of_stack_using_linked_list stack=new implementalion_of_stack_using_linked_list();
        System.out.println(stack.isEmpty());
        stack.push(46);
        stack.push(78);
//        stack.sze();
        stack.push(789);
        stack.display();
        System.out.println(stack.isEmpty());
//        stack.push(98);
//        stack.push(55);
//        stack.push(23);
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
//        stack.display();
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        stack.display();
        stack.delete_Stack();
        System.out.println(stack.isEmpty());
    }
}

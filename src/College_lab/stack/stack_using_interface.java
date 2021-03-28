package College_lab.stack;

interface myStack<T>{
    public void push(T d );
    public T pop();
    public T peek();
    public boolean isEmpty();
}
public class stack_using_interface<T> implements myStack<T>{

    Node<T> top;

    @Override
    public void push(T x) {
        Node n1=new Node(x);
        n1.next=top;
        top=n1;
//        if(top==null){
//            top=n1;
//        }
//        n1.next=top;
//        top=n1;
    }

    @Override
    public T pop() {
        T result =null;
        if(isEmpty()){
            return result;
        }
        else {
            result = top.data;
            top = top.next;
            return result;
        }
    }

    @Override
    public T peek() {
        T result=null;
        if(isEmpty()){
            return result;
        }
        else {
            result = top.data;
            return result;
        }
    }

    @Override
    public boolean isEmpty() {
        return (top==null);
    }

    public static void main(String[] args) {
        stack_using_interface<Integer> s = new stack_using_interface<>();
        s.push(45);
        System.out.println(s.peek());
    }
}

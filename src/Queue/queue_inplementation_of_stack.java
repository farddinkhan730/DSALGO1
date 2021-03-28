//package Queue;
//import College_lab.stack.implementaion;
//public class queue_inplementation_of_stack {
//    public implementaion s1=new implementaion(5);   //Stack class from stack package in College lab package
//    public implementaion s2=new implementaion(5);   //stack class from stack package in college lab package
//    public void enqueue(int x){
//        if(!s1.isEmpty()){
//            s2.push(s1.pop());
//        }
//        s1.push(x);
//        if(!s2.isEmpty()){
//            s1.push(s2.pop());
//        }
//    }
//    public int dequeue(){
//        if(s1.isEmpty()){
//            System.out.println("Under Flow");
//        }
//        int c=s1.pop();
////        s1.pop();
//        return c;
//    }
//
//    public static void main(String[] args) {
//        queue_inplementation_of_stack q=new queue_inplementation_of_stack();
//        q.enqueue(4);
//        q.enqueue(45);
//        q.enqueue(78);
//        q.enqueue(89);
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//
//    }
//}

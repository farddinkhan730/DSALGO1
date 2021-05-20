package GfG.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=right=null;
    }
}
public class Pre_order_without_recursion {
     Node root;
//    pc static   void insert(int data){
//        if(root==null){
//            root=new Node(data);
//            return;
//        }
//
//    }
    public static void In_order(Node root){
        Stack<Node> s=new Stack<>();
        Node current=root;
        while (current !=null || s.size()>0){

            while (current!=null){
                s.push(current);
                current=current.left;
            }

            current=s.pop();
            System.out.println(current.data);

            current=current.right;
        }
    }
    public static void Pre_order(Node root){
        ArrayList<Integer> al=new ArrayList<>();


        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        while (nodeStack.empty() == false) {

            Node mynode = nodeStack.peek();
            al.add(mynode.data);
            nodeStack.pop();

            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
        System.out.println(al);

    }
    public static void post_order12(Node root){
//        ArrayList<Integer> al=new ArrayList<>();
        Stack<Node> s=new Stack<Node>();
//        s.push(root);
//
//        while (!s.isEmpty()){
//            Node temp=s.peek();
//            al.add(temp.data);
//            s.pop();
//
//            if (temp.right!=null);
//            {
//                s.push(temp.right);
//            }
//            if(temp.left!=null){
//                s.push(temp.left);
//            }
//        }
////        if(s.isEmpty()){
////            al.remove(0);
////            al.add(root.data);
////        }
//        System.out.println(al);
        Node curr=root;
        while (curr != null || !s.isEmpty()){
            while (curr!= null){
//                System.out.print(curr.data + " ");
                if(curr!=root){
                    System.out.print(curr.data+" ");
                }
                if (curr.right != null)
                    s.push(curr.right);
                curr = curr.left;
            }
            if (!s.isEmpty()){
                curr = s.pop();
            }
//            if(s.isEmpty()){
//                System.out.println(root.data);
//            }
        }
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Pre_order_without_recursion tree=new Pre_order_without_recursion();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
//        root.left=new Node(6);
//        root.left=new Node(9);
//        root.left=new Node(8);
//        In_order(root);
//        Pre_order(tree.root);
        post_order12(tree.root);


    }
}

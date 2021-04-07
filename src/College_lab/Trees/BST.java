package College_lab.Trees;

import java.util.Scanner;
import java.util.concurrent.BlockingDeque;

class Bst_Node{
    int data;
    Bst_Node left;
    Bst_Node right;

//    public Bst_Node(int data) {
//        this.data = data;
//        left=right = null;
//    }
}

public class BST {
    public void sd(int data){
        Bst_Node n=new Bst_Node();
        n.data=data;
    }
    public static Bst_Node insert(Bst_Node root,Bst_Node new_Node){
        if(root==null){
            root=new_Node;
            return root;
        }
        if(root.data>new_Node.data){
            if(root.left==null){
                root.left=new_Node;
            }
            else {
                insert(root.left,new_Node);
            }
        }
        else if(root.data< new_Node.data){
            if(root.right==null){
                root.right=new_Node;
            }
            else {
                insert(root.right,new_Node);
            }
        }
        return root;
    }
    public static boolean search(Bst_Node root,int key){
        if(root==null){
            return false;
        }
        boolean result=false;
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);

        }
        return search(root.right,key);

    }

    public static void main(String[] args) {
//        Bst_Node root=new Bst_Node(5);
//        root.left=new Bst_Node(3);
//        root.left.left=new Bst_Node(2);
//        root.left.left.left=new Bst_Node(1);
//        root.left.right=new Bst_Node(4);
//        root.right=new Bst_Node(7);
//        root.right.right=new Bst_Node(8);
//        root.right.left=new Bst_Node(6);
//        System.out.println(search(root,4));
//        Bst_Node root1=insert(null,new Bst_Node(5));
//        Bst_Node r2=insert(root1,new Bst_Node(2));
//        Bst_Node r3=insert(r2,new Bst_Node(3));
//        Bst_Node r4=insert(r3,new Bst_Node(4));
//        Bst_Node r5=insert(r4,new Bst_Node(7));
//        Bst_Node r6=insert(r5,new Bst_Node(8));
//        Bst_Node r7=insert(r6,new Bst_Node(9));
//        System.out.println(search(root1,99));


    }
}

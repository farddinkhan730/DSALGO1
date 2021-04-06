package College_lab.Trees;

import java.util.Scanner;
import java.util.concurrent.BlockingDeque;

class Bst_Node{
    int data;
    Bst_Node left;
    Bst_Node right;

    public Bst_Node(int data) {
        this.data = data;
        left=right = null;
    }
}
public class BST {
    public boolean search(Bst_Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        return search(root.right,key);

    }

    public static void main(String[] args) {
        BST obj=new BST();
        Bst_Node root=new Bst_Node(5);
        root.left=new Bst_Node(4);
        root.left.left=new Bst_Node(2);
        root.left.left.left=new Bst_Node(1);
        root.left.right=new Bst_Node(3);    //they can't search this node data
        root.right=new Bst_Node(6);
        root.right.right=new Bst_Node(8);
        root.right.left=new Bst_Node(7);       // this one also they can't search
        System.out.println(obj.search(root,7));

    }
}

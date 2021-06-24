package College_lab.Trees;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.BlockingDeque;

//class Bst_Node{
//    int data;
//    Bst_Node left;
//    Bst_Node right;
//
//    public Bst_Node(int data) {
//        this.data = data;
//        left=right = null;
//    }
//}

public class BST {
    class Bst_Node{
        int data;
        Bst_Node left;
        Bst_Node right;

        public Bst_Node(int data) {
            this.data = data;
            left=right = null;
        }
    }
         Bst_Node root;
    public  Bst_Node insert(int x){
        Bst_Node new_Node=new Bst_Node(x);
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

    private void insert(Bst_Node right, Bst_Node new_node) {
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
    public static Bst_Node LCA(Bst_Node root,int x,int y){
        if (root==null || root.data==x || root.data==y){
            return root;
        }
        if(root.data>x && root.data>y){
            return LCA(root.left,x,y);
        }
        else if(root.data<x && root.data<y){
            return LCA(root.right,x,y);
        }
        else{
            Bst_Node left=LCA(root.left,x,y);
            Bst_Node right=LCA(root.right,x,y);
            if(left!=null && right!=null){
                return root;
            }
            if(left==null){
                return right;
            }
            if(right==null){
                return left;
            }
        }
        return root;
    }
    public static void preorder(Bst_Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);



    }
    public static void postorder(Bst_Node root){
        if(root==null){
            return;
        }

        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");


    }
    public static void Inorder(Bst_Node root){
        if(root==null){
            return;
        }

        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);



    }
    public static void main(String[] args) {
        BST tree=new BST();
        tree.insert(34);
        tree.insert(2);
        tree.insert(67);
        preorder(tree.root);
        postorder(tree.root);
        Inorder(tree.root);
    }
}
class lca{
    public static TreeNode LCA(TreeNode root,int x,int y){
        if (root==null || root.data==x || root.data==y){
            return root;
        }
        if(root.data>x && root.data>y){
            return LCA(root.left,x,y);
        }
        else if(root.data<x && root.data<y){
            return LCA(root.right,x,y);
        }
        else{
            TreeNode left=LCA(root.left,x,y);
            TreeNode right=LCA(root.right,x,y);
            if(left!=null && right!=null){
                return root;
            }
            if(left==null){
                return right;
            }
            if(right==null){
                return left;
            }
        }
        return root;
    }
    public static TreeNode insert(TreeNode root,TreeNode nnode){
        if(root==null){
            root=nnode;
            return root;
        }
        if(root.data>nnode.data){
            if(root.left==null){
                root.left=nnode;
            }
            else {
                insert(root.left,nnode);
            }
        }
        if(root.data<nnode.data){
            if (root.right==null){
                root.right=nnode;
            }
            else {
                insert(root.right,nnode);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode r=insert(null,root);
        TreeNode r1=insert(r,new TreeNode(6));
        TreeNode r2=insert(r1,new TreeNode(2));
        insert(r2,new TreeNode(1));
        System.out.println(LCA(r,1,6).data);
    }
}
class Array_TO_BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void Construct(int a[],int size){
        Node n=new Node(a[0]);
        Stack<Node> s=new Stack<>();
        s.push(n);
        for (int i = 0; i < size; i++) {
            Node temp=null;
            while (!s.isEmpty() && a[i]>s.peek().data){
                temp=s.pop();
            }
            if (temp!=null){
                temp.right=new Node(a[i]);
                s.add(temp.right);
            }
            else {
                temp=s.peek();
                temp.left=new Node(a[i]);
                s.push(temp.left);
            }
        }
        preorder(n);

    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int []a={10, 5, 1, 7, 40, 50};
        Construct(a,a.length);
//        preorder(temp);
    }
}

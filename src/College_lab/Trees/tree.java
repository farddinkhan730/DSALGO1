package College_lab.Trees;

import java.util.Scanner;

class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;

    public TreeNode(int data) {
        this.data=data;
    }
}
// traversing in tree
public class tree {
    TreeNode root;
    public void pre_order(TreeNode root){
        System.out.println("Pre order start");
        if(root==null){
            return ;
        }
        System.out.println(root.data);
        pre_order(root.left);
        pre_order(root.right);
    }
    public void post_order(TreeNode root){
        System.out.println("Post order start");
        if(root==null) return;
        post_order(root.left);
        post_order(root.right);
        System.out.println(root.data);
    }
    public void in_order(TreeNode root){
        System.out.println("in order start");
        if(root==null){
            return;
        }
        in_order(root.left);
        System.out.println(root.data);
        in_order(root.right);
    }
    public TreeNode value_in_tree(TreeNode root){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root node");
        root=new TreeNode(sc.nextInt());
        System.out.println("Enter the left child of root node");
            TreeNode left = new TreeNode(sc.nextInt());
        System.out.println("Enter the right child of root node");
            TreeNode right = new TreeNode(sc.nextInt());
            root.left = left;
            root.right = right;
            return root;
    }

    public static void main(String[] args) {
        tree obj=new tree();
        TreeNode n=obj.value_in_tree(obj.root);
        obj.pre_order(n);

    }
}

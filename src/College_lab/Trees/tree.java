package College_lab.Trees;

import java.util.*;

class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;

    public TreeNode(int data) {
        this.data=data;
        right=left=null;
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
    public void level_order(){
        System.out.println();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }
//    public TreeNode value_in_tree(TreeNode root){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the root node");
//        root=new TreeNode(sc.nextInt());
//        System.out.println("Enter the left child of root node");
//            TreeNode left = new TreeNode(sc.nextInt());
//        System.out.println("Enter the right child of root node");
//            TreeNode right = new TreeNode(sc.nextInt());
//            root.left = left;
//            root.right = right;
//            return root;
//    }
    public TreeNode mirror(TreeNode root){
        if(root==null)
            return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }
    public void NOT_Siblings(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left!=null && root.right!=null){
           NOT_Siblings(root.left);
           NOT_Siblings(root.right);
        }
        else if (root.right!=null){
            System.out.println(root.right.data);
            NOT_Siblings(root.right);
        }
        else if(root.left!=null){
            System.out.println(root.left.data);
            NOT_Siblings(root.left);

        }
//        else {
//            System.out.println("Nodes which do not have siblings "+root.data);
//        }
    }
    public void print_the_level_order_binary_tree(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode a=q.poll();
            System.out.println(a.data);
            if(a.left!=null){
                q.add(a.left);
//                print_the_level_order_binary_tree(a.left);
            }
            if(a.right!=null){
                q.add(a.right);
//                print_the_level_order_binary_tree(a.right);
            }
        }
    }
    public void insert(TreeNode root ,int key){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp.left==null){
                temp.left=new TreeNode(key);
                break;
            }
            else {
                q.add(temp.left);

            }
            if(temp.right==null){
                temp.right=new TreeNode(key);
            }
            else {
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        tree obj=new tree();
        obj.root=new TreeNode(1);
        obj.root.left=new TreeNode(2);
        obj.root.right=new TreeNode(3);
        obj.root.left.left=new TreeNode(4);
        obj.root.right.right=new TreeNode(5);
//        obj.pre_order(obj.root);
//        TreeNode n=obj.mirror(obj.root);
//        System.out.println("root " +n.data);
//        System.out.println("root left "+ n.left.data);
//        System.out.println("root right " + n.right.data);
//        System.out.println("root right left "+ n.right.left.data);
//        System.out.println("root right right "+ n.right.right.data);
//        obj.NOT_Siblings(obj.root);
//        obj.pre_order(obj.root);
//        obj.print_the_level_order_binary_tree(obj.root);
//        obj.post_order(obj.root);
        obj.level_order();
        obj.insert(obj.root, 46);
        obj.level_order();
    }
}

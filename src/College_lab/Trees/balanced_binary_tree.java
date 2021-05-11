package College_lab.Trees;
// complexity is o(n^2)
public class balanced_binary_tree {
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left= height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }
    public boolean isBal(TreeNode root){
        if(root==null){
            return true;
        }
        if(Math.abs(height(root.left)-height(root.right))<=1 && isBal(root.left) && isBal(root.right)){
            return true;
        }
        else
        return false;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        balanced_binary_tree obj=new balanced_binary_tree();
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
//        root.right.right=new TreeNode(6);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
//        root.left.left.left=new TreeNode(7);
//        root.left.left.right=new TreeNode(8);
        System.out.println(obj.height(root));
        System.out.println(obj.isBal(root));

    }
}

// more optimize than this code its complexity is o(n)
class check_isBal{
    int height;
    boolean is_bal;

    public check_isBal(int height, boolean is_bal) {
        this.height = height;
        this.is_bal = is_bal;
    }
}
class is_Balanced{
    public check_isBal is_balance_new(TreeNode root){
        if(root==null)
            return new check_isBal(0,true);
        check_isBal left=is_balance_new(root.left);
        check_isBal right=is_balance_new(root.right);
        int h=Math.max(left.height, right.height)+1;
        check_isBal ans=new check_isBal(h,true);
        if(Math.abs(left.height - right.height) >1)
            ans.is_bal= false;

        return ans;


    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        is_Balanced obj=new is_Balanced();
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
//        root.right.right=new TreeNode(6);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
//        root.left.left.left=new TreeNode(7);
//        root.left.left.right=new TreeNode(8);
        System.out.println(obj.is_balance_new(root).is_bal);

    }
}
class Height {
    int height = 0;
}

class Binary_Tree1 {
    public boolean is_Balance(TreeNode root, Height height)
    {
        /* If tree is empty then return true */
        if (root == null) {
            height.height = 0;
            return true;
        }

        /* Get heights of left and right sub trees */
        Height l_height = new Height(), r_height = new Height();
        boolean l = is_Balance(root.left,l_height);
        boolean r =  is_Balance(root.right,r_height);
        int lh = l_height.height, rh = r_height.height;

        /* Height of current node is max of heights of
           left and right subtrees plus 1*/
        height.height = (lh > rh ? lh : rh) + 1;

        /* If difference between heights of left and right
           subtrees is more than 2 then this node is not balanced
           so return 0 */
        if (Math.abs(lh - rh) >= 2)
            return false;

        /* If this node is balanced and left and right subtrees
           are balanced then return true */
        else
            return l && r;
    }

    public static void main(String args[])
    {
        Height height = new Height();

        /* Constructed binary tree is
                   1
                 /   \
                2      3
              /  \    /
            4     5  6
            /
           7         */
        Binary_Tree1 tree = new Binary_Tree1();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        if (tree.is_Balance(root,height))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}

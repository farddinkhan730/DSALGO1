package GfG.Linked_List;public class BinarryToDLL {
}
// Java program to flatten a given
// Binary Tree into linked list

// A binary tree node

class BinaryTree{

    Node root;
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int key)
        {
            data = key;
            left = right = null;
        }
    }


    // Function to convert binary tree into
// linked list by altering the right node
// and making left node NULL
    public void flatten(Node node)
    {

        // Base case - return if root is NULL
        if (node == null)
            return;

        // Or if it is a leaf node
        if (node.left == null &&
                node.right == null)
            return;

        // If root.left children exists then we have
        // to make it node.right (where node is root)
        if (node.left != null)
        {

            flatten(node.left);
            Node tempNode = node.right;
            // Store the node.right in
             node.right = node.left;
            node.left = null;

            // Find the position to insert
            // the stored value
            Node curr = node.right;
            while (curr.right != null)
            {
                curr = curr.right;
            }

            // Insert the stored value
            curr.right = tempNode;
        }

        // Now call the same function
        // for node.right
        flatten(node.right);

    }

    // Function for Inorder traversal
    public void inOrder(Node node)
    {

        // Base Condition
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Driver code

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

	/* 1
		/ \
	2	 5
	/ \	 \
	3 4	 6 */

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.right = new Node(6);

        System.out.println("The Inorder traversal after " +
                "flattening binary tree ");

        tree.flatten(tree.root);
        tree.inOrder(tree.root);
    }
}
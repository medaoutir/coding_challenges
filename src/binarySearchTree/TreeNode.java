package binarySearchTree;


import java.util.Objects;

// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(!(other instanceof TreeNode)) {
            // If other is null we will end up here
            return false;
        }

        TreeNode bst = (TreeNode) other;

        // Check equality of the left child
        if(left != null) {
            if(!left.equals(bst.left)) {
                // Left childs aren't equal
                return false;
            }
        } else if (bst.left != null) {
            // this.left is null but other.left isn't
            return false;
        }

        // Check equality of the right child
        if(right != null) {
            if(!right.equals(bst.right)) {
                // Right childs aren't equal
                return false;
            }
        } else if (bst.right != null) {
            // this.right is null but other.right isn't
            return false;
        }
        // Both left and right childs are equal
        return true;
    }

        @Override
        public int hashCode() {
            int h = Objects.hashCode(val);
            if (left != null) h = h* 31 + left.hashCode();
            if (right != null) h = h * 31 + right.hashCode();
            return h;

    }
}

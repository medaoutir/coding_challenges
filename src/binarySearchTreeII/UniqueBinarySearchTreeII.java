package binarySearchTreeII;

import java.util.*;
import java.util.stream.IntStream;

public class UniqueBinarySearchTreeII {
    private TreeNode parent;
    private Set<TreeNode> treeNodes = new HashSet<>();

    public UniqueBinarySearchTreeII(int root) {
        this.parent = new TreeNode(root);
    }

    public UniqueBinarySearchTreeII() {
    }

    public static void main(String[] args) {
        UniqueBinarySearchTreeII binarySearchTree = new UniqueBinarySearchTreeII();
        List<TreeNode> results = binarySearchTree.generateTrees(4);
        System.out.println(results.size());
    }

    public List<TreeNode> generateTrees(int n) {
        int[] tab = IntStream.range(1, n + 1).toArray();
        generateAllTableCombinations(tab.length, tab);
        return new ArrayList<>(this.treeNodes);
    }

    public TreeNode insertDataInTreeNode(int data) {
        TreeNode node = parent;
        while (true) {
            if (node != null) {
                if (data < node.val) {
                    if (node.left == null) {
                        node.left = new TreeNode(data);
                        break;
                    } else {
                        node = node.left;
                    }
                } else {
                    if (node.right == null) {
                        node.right = new TreeNode(data);
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }
        }
        return parent;
    }

    /**
     * permutation function
     *
     * @param elements table to calculate permutation for
     * @param n        table size
     */
    public void generateAllTableCombinations(
            int n, int[] elements) {

        if (n == 1) {
            UniqueBinarySearchTreeII binarySearchTree = new UniqueBinarySearchTreeII(elements[0]);
            Arrays.stream(elements).filter(el -> el != elements[0]).forEach(el -> binarySearchTree.insertDataInTreeNode(el));
            this.treeNodes.add(binarySearchTree.parent);
        } else {
            for (int i = 0; i < n - 1; i++) {
                generateAllTableCombinations(n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            generateAllTableCombinations(n - 1, elements);
        }
    }

    /**
     * Swap Characters at position
     *
     * @param elements table value
     * @param i        position 1
     * @param j        position 2
     * @return swapped string
     */
    public void swap(int[] elements, int i, int j) {
        int temp;
        temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }


}

package exercisesRegardingTofBST.UnSortedArrayToBST;


import exercisesRegardingTofBST.sortedArrayToBST.TreeNode;

import java.util.Arrays;

public class UnSortedSolution {

    //approach1--by first sorting the given array
    // complexity......o(nlogn)

    public Node arrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        Arrays.sort(num);
        return helperArray(num, 0, num.length - 1);
    }


    public Node helperArray(int[] num, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node root = new Node(num[mid]);
        root.left = helperArray(num, start, mid - 1);
        root.right = helperArray(num, mid + 1, end);

        return root;
    }

    void inOrderPrinting(Node root) {
        if (root == null) {
            return;
        }
        inOrderPrinting(root.left);
        System.out.print(root.data + " ");

        inOrderPrinting(root.right);
    }

    public static void main (String[] args) {

        int[] keys = { 15,10, 20, 8, 12, 16, 25,18 };
        UnSortedSolution sol= new UnSortedSolution();

        Node root=sol.arrayToBST(keys);

        sol.inOrderPrinting(root);

    }
}

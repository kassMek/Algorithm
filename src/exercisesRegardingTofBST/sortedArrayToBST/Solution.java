package exercisesRegardingTofBST.sortedArrayToBST;

public class Solution {

/*Given an array where elements are sorted in ascending order,
convert it to a height balanced BST.For this problem,
a height-balanced binary tree is defined as a binary tree in which the depth of the
 two subtrees of every node never differ by more than 1.
  */
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;

        return sortedArrayToBST(num, 0, num.length - 1);
    }


    public TreeNode sortedArrayToBST(int[] num, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBST(num, start, mid - 1);
        root.right = sortedArrayToBST(num, mid + 1, end);

        return root;
    }

    void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");

        inOrder(node.right);
    }

    public static void main (String[] args) {

        Solution tree = new Solution();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        TreeNode root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Inorder traversal of constructed BST");
        tree.inOrder(root);
    }

}

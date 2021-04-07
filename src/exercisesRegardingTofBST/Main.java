package exercisesRegardingTofBST;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Recursive function to insert a key into a BST
    public static Node insert(Node root, int key)
    {
        // if the root is null, create a new node and return it
        if (root == null) {
            root= new Node(key);
            return root;
        }

        // if the given key is less than the root node,
        // recur for the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        // otherwise, recur for the right subtree
        else {
            // key >= root.data
            root.right = insert(root.right, key);
        }

        return root;
    }


    // finding specific value
    public static boolean isContained(Node node ,int value) {
        if (value == node.data) {
            return true;
        } else if (value < node.data) {
            if (node.left == null) {
                return false;
            } else {
                return isContained(node.left,value);
            }
        } else {
            if (node.right == null) {
                return false;
            } else {
                return isContained(node.right,value);
            }

        }

    }


    //calculating the maximum height of BST

    //height of BST=1+Number of edges on the longest path from root to leaf

    public static int getMaxHeight( Node root){

        int h=0;

        if(root==null){
            return 0;
        }

        int leftHeight=getMaxHeight(root.left);

        int rightHeight=getMaxHeight(root.right);

        if( leftHeight>rightHeight){
            h=leftHeight+1;

        }
        else{
            h=rightHeight+1;
        }
        return h;
    }

 //Find the closest element to a target value in a binary search tree


    public int closestValue=0;
    int maxDiff=Integer.MAX_VALUE;

    public  int findClosetNodeToTarget(Node node, int target){
        helperClosest(node,target);
        return closestValue;

    }
    public  void helperClosest(Node node, int target) {
        if (node == null) {
            return;
        }
        if (node.data - target == 0) {
            closestValue = node.data;
            return;
        }
        if (Math.abs(node.data - target) < maxDiff){
            maxDiff=node.data - target;
            closestValue = node.data;
        }
        if (node.data<target ) {
            helperClosest(node.right, target);
        } else {
            helperClosest(node.left, target);
        }

    }


    // Iterative function to perform preorder traversal on the tree
    public static void preorderIterative(Node root)
    {
        // return if the tree is empty
        if (root == null) {
            return;
        }

        // create an empty stack and push the root node
        Stack<Node> stack = new Stack();
        stack.push(root);

        // loop till stack is empty
        while (!stack.empty())
        {
            // pop a node from the stack and print it
            Node curr = stack.pop();

            System.out.print(curr.data + " ");

            // push the right child of the popped node into the stack
            if (curr.right != null) {
                stack.push(curr.right);
            }

            // push the left child of the popped node into the stack
            if (curr.left != null) {
                stack.push(curr.left);
            }

            // the right child must be pushed first so that the left child
            // is processed first (FIFO order)
        }
    }


    //adding elements of BST

    public static int sumElements( Node root){
        if(root==null){
            return 0;
        }
        return root.data+sumElements(root.left)+sumElements(root.right);
    }

    /*
    Print ancestors of a node in Binary tree
    If target is present in tree, then prints the ancestors
       and returns true, otherwise returns false.
      */

   static  boolean printAncestors(Node node, int target)
    {
        /* base cases */
        if (node == null)
            return false;

        if (node.data == target)
            return true;

        /* If target is present in either left or right subtree
           of this node, then print this node */
        if (printAncestors(node.left, target) || printAncestors(node.right, target))
        {
            System.out.print(node.data + " ");
            return true;
        }

        /* Else return false */
        return false;
    }




/*  Cousins in Binary Tree..check if two nodes are cousins or not
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
    Two nodes of a binary tree are cousins if they have the same depth, but have different parents

 */



    public  static boolean isCousins(Node root, int x, int y) {
        int level = 1;
        HashMap<Integer, NodeInfo> levels = new HashMap<Integer, NodeInfo>();
        getLevels(root, level, levels);
        NodeInfo forX = levels.get(x);
        NodeInfo forY = levels.get(y);

        if (forX == null || forY == null) {
            return false;
        }

        return (forX.level == forY.level && forX.parent != forY.parent);

    }

    //helper method
    public  static void getLevels(Node root,int level, Map<Integer,NodeInfo> levels){
         if(root==null){
             return ;
         }
         if(root.left!=null){
             NodeInfo n=new NodeInfo();
                 n.parent=root;
                 n.level=level+1;
                 levels.put(root.left.data,n);
         }

        if(root.right!=null){
            NodeInfo n=new NodeInfo();
                n.parent=root;
                n.level=level+1;
                levels.put(root.right.data,n);
        }

        getLevels(root.left, level+1, levels);
        getLevels(root.right,level+1,levels);
    }


    public static void main(String[] args) {
          /*
                   15
                 /     \
               10       20
             /   \      /   \
           8      12   16    25
                         \    \
                         18    40
                               /
                               33
    */


     Node  root =null;
        int[] keys = { 15,10, 20, 8, 12, 16, 25,18,40,33 };

        for (int key: keys) {
            root = insert(root, key);
        }
       inorder(root);

       System.out.println("********************");
//        System.out.println(isContained(root,135));
        //System.out.println("The maximum height is :"+getMaxHeight(root));
//
       Main mm= new Main();
       int value=mm.findClosetNodeToTarget(root,27);
//
//
        System.out.println("The closet value near to target is :" +value);
//
//        preorderIterative(root);
//        System.out.println();
//        System.out.println("Adding  elements of nodes:"+sumElements(root));

        printAncestors(root,40);
        //System.out.println("are they cousin?:"+isCousins(root,8,12));


    }

}

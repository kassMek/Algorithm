package exercisesRegardingTofBST.V2BstExercise;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
   Node root;
   int h=0;
  // int nodeValue=0;
    int closetValue=0;
    int goal=0;
    int maxDiff=Integer.MAX_VALUE;

   /*
   get the maximum height
   height of BST=1+Number of edges on the longest path from root to leaf
    */
   public  int getMaximumHeight(Node root){
      if(root==null){
          return 0;
         }
       int leftHeight=getMaximumHeight(root.left);

       int rightHeight=getMaximumHeight(root.right);

       if( leftHeight>rightHeight){
           h=leftHeight+1;

       }
       else{
           h=rightHeight+1;
       }
       return h;
   }

   /*get the maximum element of BinaryTree
    iterative approach
      */
    public static int getMaximumNodeElement(Node root){
        Queue<Node> queue=new LinkedList<>();
         queue.add(root);
         int maxValue=Integer.MIN_VALUE;
          while(!queue.isEmpty()){
              Node temp=queue.poll();
              if(temp.data>maxValue){
                  maxValue=temp.data;
              }
              if(temp.left!=null){
                  queue.add(temp.left);
              }
              if(temp.right!=null){
                  queue.add(temp.right);
              }
          }

          return maxValue;
    }

    //maximum element using recursive approach

    public static int getMaximumValueRecursively (Node root) {
        if (root == null) {
            return 0;
        }
        int nodeValue = root.data;
        int lefMaximum = getMaximumValueRecursively(root.left);
        int rightMaximum = getMaximumValueRecursively(root.right);
        if (lefMaximum > nodeValue) {
            nodeValue = lefMaximum;
        }
        if (rightMaximum > nodeValue) {
            nodeValue = rightMaximum;
        }
        return nodeValue;
    }
     /*
     ....closet value using iterative approach
     Given a non-empty binary search tree and a target value,
     find the value in the BST that is closest to the target.
      */
     //iterative approach
    public static int getClosetIteratively(Node root, int target){
        int minDiff=Integer.MAX_VALUE;
        int result=0;
        while(root!=null){
             if(target==root.data){
                 result=root.data;
                 return result;
             }
             else if( target>root.data){
                 if(Math.abs(root.data-target)<minDiff){
                     minDiff=Math.abs(root.data-target);
                     result=root.data;
                 }
                 root=root.right;
             }

             else if (target<root.data){
                 if(Math.abs(root.data-target)<minDiff){
                     minDiff=Math.abs(root.data-target);
                     result=root.data;
                 }
                 root=root.left;
             }
        }
        return result;
    }


    // Recursive Solution
    // print leaf nodes
    public static void printLeafNodes(Node root) {

        if(root==null)
            return;

        if(root.left == null && root.right == null) {
            System.out.print(" "+root.data);
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }
    public static void main (String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(9);
        tree.root.left = new Node(7);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(8);
        tree.root.left.left.left = new Node(1);
        tree.root.left.left.right = new Node(5);
        tree.root.right.right = new Node(29);
        tree.root.right.right.left = new Node(23);
        System.out.println("MaxiMum height is :"+tree.getMaximumHeight(tree.root));
        System.out.println("Maximum value using iterative approach is : "+getMaximumNodeElement(tree.root));
        System.out.println("Maximum value using recursion is :"+getMaximumValueRecursively(tree.root));
        System.out.println("Closest value to the target is :"+tree.getClosetIteratively(tree.root,3));
        printLeafNodes(tree.root);
    }
}

package exercisesRegardingTofBST.addingOnlyLeftLeafNodes;

import exercisesRegardingTofBST.V2BstExercise.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    Node root;
   /*
    ...Sum of Left Leaves of Binary Tree
    iterative approach
     time complexity...o(n)
     space....complexity o(n)
    */

    public static int getSumOfLeafLeaves(Node root){
        if(root==null){
            return 0;
        }
        int sum=0;
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            if(temp.left!=null){
                if(isLeafNode(temp.left)){
                    sum+=temp.left.data;
                }
                else{
                    queue.add(temp.left);
                }
            }
            if(temp.right!=null){
                queue.add(temp.right);
                }
         }

        return sum;
    }

    //Using recursion
    public static int  getSumOfLeaveNodesUsingRecursion(Node root){

          if(root==null){
              return 0;
          }
          int sum=0;
          if(root.left!=null){
              if(isLeafNode(root.left)){
                  sum+= root.left.data;
              }
             sum+= getSumOfLeaveNodesUsingRecursion(root.left);
          }
          sum+= getSumOfLeaveNodesUsingRecursion(root.right);

        return sum;
    }
    public static boolean isLeafNode( Node node){
        return node.left==null && node.right==null;
    }
    public static void main (String[] args) {

        Solution tree = new Solution();
        tree.root = new Node(9);
        tree.root.left = new Node(7);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(8);
        tree.root.left.left.left = new Node(1);
        tree.root.left.left.right = new Node(5);
        tree.root.right.right = new Node(29);
        tree.root.right.right.left = new Node(23);
        System.out.println("sum of left leaves is :"+getSumOfLeaveNodesUsingRecursion(tree.root));
    }
}

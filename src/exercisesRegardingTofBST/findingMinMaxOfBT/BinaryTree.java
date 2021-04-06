package exercisesRegardingTofBST.findingMinMaxOfBT;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
     Node root;
    //static int maxValue=0;

    //using recursive approach
    public static  int getMaximumValue( Node node){

        if( node==null){
            return 0;
        }
        int nodeValue=node.data;
        int leftMaximum=getMaximumValue(node.left);
        int rightMaximum=getMaximumValue(node.right);
        if(leftMaximum>nodeValue){
            nodeValue=leftMaximum;
        }
        if(rightMaximum>nodeValue){
            nodeValue=rightMaximum;
        }
        return nodeValue;

    }


    // Iterative Solution
    /* To get max node in a binary tree*/
    public static int getMaximumItr(Node startNode) {

        Queue<Node> queue=new LinkedList<>();
        queue.add(startNode);
        int max=Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
            Node tempNode=queue.poll();
            if(max < tempNode.data)
                max=tempNode.data;
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)

                queue.add(tempNode.right);
        }
        return max;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(29);
        tree.root.right.right.left = new Node(4);

        // Function call
        System.out.println("Maximum element is :" + getMaximumValue(tree.root));
    }



}

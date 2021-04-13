package bstThings;

public class Node {

    Node left, right;
    int data;

    Node (int data) {
        this.data = data;
    }

    //inserting elements

    public void insert(int value){
        if(value<data){
            if(left==null){
                left= new Node(value);
            }
            else{
                left.insert(value);
            }
        }
        else{

            if(right==null){
                right= new Node(value);
            }
            else{
                right.insert(value);
            }
        }
    }

    // finding specific value
  public boolean isContained(int value) {
      if (value == data) {
          return true;
      } else if (value < data) {
          if (left == null) {
              return false;
          } else {
              return left.isContained(value);
          }
      } else {
          if (right == null) {
              return false;
          } else {
              return right.isContained(value);
          }

      }

  }

  //printing inorder traversal

    public void printInOrder(Node node){
        if(node==null){
            return ;
        }
        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
    }


    //adding elements of BST

    public static int sumElements( Node root){
        if(root==null){
            return 0;
        }
         return root.data+sumElements(root.left)+sumElements(root.right);
    }
      public static void main (String[]args){

          Node root = new Node(10);
          root.insert(7);
          root.insert(8);
          root.insert(5);
          root.insert(13);
          root.insert(21);
          root.printInOrder(root);

          System.out.println(root.isContained(93));
          System.out.println("Adding  elements of nodes:"+sumElements(root));


      }
}

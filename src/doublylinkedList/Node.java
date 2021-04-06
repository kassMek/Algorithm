package doublylinkedList;

public class Node {
	
	 public int data ;
	 public Node previous;
	 public Node next;
	 public Integer val;
	   public Node( int data) {
		     this.data=data;
		     this.previous=null;
		     this.next=null;
	       }
 public Node(Node previous, int data, Node next) {
	 this.previous=previous;
	 this.data=data;
	 this.next=next;
	 
     }
  public int getData() {
	    return data;
    }
}

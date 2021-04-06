package singlyLinkedList.reverseLinkedList;

import singlyLinkedList.Node;

public class Test {
   //Node head;

    public Node reverseNode(Node head){
        Node previous=null;
        Node current=null;
        while(head!=null){
            current=head.next;
            head.next=previous;
            previous=head;
            head=current;
        }
        return previous;
    }

    public void print(Node head){
         while(head!=null){
             System.out.print(" "+head.data);
             head=head.next;
         }
    }

    public static void main (String[] args) {
        Test tt = new Test();
        Node head = new Node(85);
        Node second = new Node(15);
        Node third = new Node(4);
        Node fourth = new Node(20);
        head.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("Printing before reversing");
        tt. print(head);
        System.out.println();
        System.out.println("Printing after reversing");
        Node head2=tt.reverseNode(head);
        tt. print(head2);

    }
}

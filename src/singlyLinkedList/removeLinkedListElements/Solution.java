package singlyLinkedList.removeLinkedListElements;

public class Solution {
    /*
    Given the head of a linked list and an integer val,
    remove all the nodes of the linked list that has Node.val == val, and return the new head.
Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
     */

    //approach 1..time complexity o(N), Space complexity:O(1);
    public static Node removeElements(Node head, int val) {
         if(head==null){
             return null;
         }
        while( head!=null && head.val==val){
            head=head.next;
        }

        Node current=head;
        while(current!=null && current.next!=null){

            if (current.next.val==val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }

        }

        return head;
    }

    //approach 2
    public static Node removeElementsUsingNewNode(Node head, int val) {
      if(head==null){
          return null;
      }
        Node current = new Node(Integer.MIN_VALUE);//crating new node with arbitrary value
        current.next=head;
        head=current;
        while(current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
              }
              else  current = current.next;

        }
        return head.next;

    }

    public static void print(Node head){
        while(head!=null){
            System.out.print(" "+head.val);
            head=head.next;
        }
    }

    public static void main (String[] args) {
        Node head = new Node(7);
        Node second = new Node(7);
        Node third = new Node(12);
        Node fourth = new Node(20);
        head.next=second;
        second.next=third;
        third.next=fourth;
       Node newHead= removeElementsUsingNewNode(head,7);
        print(newHead);
    }
}

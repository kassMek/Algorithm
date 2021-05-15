package singlyLinkedList.mergingTwoSoretedLinkedListLeetCode21;


/*
Merge two sorted linked lists and return it as a sorted list.
The list should be made by splicing together the nodes of the first two lists.

Example 1:
Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]

Time complexity O(m+n)
 */
public class Solution {

    public  static Node mergeTwoLists(Node l1, Node l2) {

        Node current= new Node(-1);//creating dummy node
        Node head=current;
        while(l1!=null|| l2!=null){
             if(l1==null){
                 current.next=l2;
                 l2=l2.next;
             }
            else if(l2==null){
                current.next=l1;
                l1=l1.next;
            }
            else if (l1.data<l2.data){
                current.next=l1;
                l1=l1.next;
             }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
    return head.next;
    }

    public static void print(Node head){
        while(head!=null){
            System.out.print(" "+head.data);
            head=head.next;
        }
    }
    public static void main (String[] args) {
          Node head1 = new Node(7);
          Node second = new Node(8);
          Node third= new Node(9);
          Node fourth = new Node(10);
          head1.next=second;
          second.next=third;
          third.next=fourth;

        Node head2 = new Node(5);
        Node fifth = new Node(7);
        Node sixth= new Node(12);
        Node seventh = new Node(27);
        head2.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        Node result=mergeTwoLists(head1,head2);
        print(result);
    }
}

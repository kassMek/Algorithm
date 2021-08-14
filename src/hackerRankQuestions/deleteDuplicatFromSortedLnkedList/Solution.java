package hackerRankQuestions.deleteDuplicatFromSortedLnkedList;


/*
You are given the pointer to the head node of a sorted linked list,
where the data in the nodes is in ascending order. Delete nodes and return a sorted list with each distinct value in the original list.
The given head pointer may be null indicating that the list is empty.
Example:
 refers to the first node in the list 1->2->2->3->3->3->Null

Remove 1 of the 2 data values and return head pointing to the revised list"
1->2->-3->Null

 */
public class Solution {
    static Node removeDuplicates(Node head) {

        if(head==null){
            return null;
        }

        Node current= head;

        while(current.next!=null){
            if (current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }

        return head;
    }

    public static void print(Node head){
        while(head!=null){
            System.out.print(" "+head.data);
            head=head.next;
        }
    }


    public static void main (String[] args) {

        Node head1 = new Node(1);
        Node second = new Node(2);
        Node third= new Node(2);
        Node fourth = new Node(3);
        Node fifth = new Node(3);
        Node sixth = new Node(5);

        head1.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        Node newHead=removeDuplicates(head1);
        print(newHead);

    }
}

package mergeKSortedLinkedListsLettcode23;

import singlyLinkedList.mergingTwoSoretedLinkedListLeetCode21.Node;

import java.util.PriorityQueue;

/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.
Example 1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]

run time:o(n*mlog(n*m)
space complexity:o(n*m)
where n=max number of list and m=max number of nodes in a list .
 */


//run time
public class  Solution {

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();

         for(ListNode head:lists){
             while(head!=null){
                 minHeap.add(head.val);
                 head=head.next;
             }
         }
        ListNode dummy= new ListNode(-1);//creating dummy node
        ListNode current=dummy;
        while(!minHeap.isEmpty()){
               current.next= new ListNode(minHeap.remove());
               current=current.next;
        }
      return dummy.next;
    }


    public static  void print(ListNode root){
         while(root!=null){
             System.out.println(root.val);
             root=root.next;
         }
    }
    public static void main (String[] args) {
        ListNode[] arr = new ListNode[3];

        arr[0] = new ListNode(1);
        arr[0].next = new ListNode(3);
        arr[0].next.next = new ListNode(5);
        arr[0].next.next.next = new ListNode(7);

        arr[1] = new ListNode(2);
        arr[1].next = new ListNode(4);
        arr[1].next.next = new ListNode(6);
        arr[1].next.next.next = new ListNode(8);

        arr[2] = new ListNode(0);
        arr[2].next = new ListNode(9);
        arr[2].next.next = new ListNode(10);
        arr[2].next.next.next = new ListNode(11);

        ListNode nn=mergeKLists(arr);

        print(nn);

    }

}

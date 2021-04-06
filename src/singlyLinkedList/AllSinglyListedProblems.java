package singlyLinkedList;

public class AllSinglyListedProblems {

    private Node head;

    //add first

    public void addFirst( int item){
        Node newNode=new Node(item);

        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    //add last
    public void addLast (int item) {

        if (head == null) {
            addFirst(item);
        }

        Node newNode = new Node(item);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    //delete first
    public void deleteFirst () {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    //delete last

    public void deleteLast () {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }


    //add @specified location
    public void addAtSpecifiedLocation(int index, int item){

         if(index==0){
             addFirst(item);
             return;
         }
         Node newNode= new Node(item);
         Node current= head;

         for(int  start=0;start<index-1;start++){
             current=current.next;
         }
         newNode.next=current.next;
         current.next=newNode;
    }

    //delete @specified position

    public void deleteAtSpecifiedPosition (int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        //current.next=current.next.next;

        //or the below also works fine
        Node temp = null;
        temp = current.next;
        current.next = temp.next;
        temp = null;
    }
    //print elements
    public void print () {
        Node current = head;
        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
    }



    public static void main (String[] args) {

        AllSinglyListedProblems sis = new AllSinglyListedProblems();
        sis.addFirst(5);
        sis.addFirst(15);
        sis.addFirst(25);
        sis.addLast(67);
        sis.addLast(89);
        //sis.deleteFirst();
        sis.deleteLast();
        sis.addAtSpecifiedLocation(2, 12);
        sis.addAtSpecifiedLocation(4, 92);
        sis.deleteAtSpecifiedPosition(3);
        System.out.println("Printing before reversing");
        sis.print();

    }
}

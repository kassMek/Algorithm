package singlyLinkedList;

public class ImplementingStackUsingSinglyLinkedList {

    private Node top;
    private int size;

    ImplementingStackUsingSinglyLinkedList () {
        top = null;
        size = 0;
    }

    public void push( int data){
        Node newNode= new Node(data);
        newNode.next=top;
        top=newNode;
        size++;
     }

    public int pop () {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        int poppedValue = top.data;
        top = top.next;
        size--;
        return poppedValue;
    }

     public boolean isEmpty(){
        if(size==0){
            return true;
             }
          return false;
        }

    public void print () {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }
    public static void main (String[] args) {

        ImplementingStackUsingSinglyLinkedList stk= new ImplementingStackUsingSinglyLinkedList();
        stk.push(4);
        stk.push(7);
        stk.push(16);
        stk.push(21);
        stk.push(27);
        stk.pop();
        System.out.println("Printing before reversing");

    }
}

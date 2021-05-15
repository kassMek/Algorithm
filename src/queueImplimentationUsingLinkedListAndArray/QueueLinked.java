package queueImplimentationUsingLinkedListAndArray;

import java.util.EmptyStackException;

public class QueueLinked {
    Node front;
    Node rear;
    int size;

    //inserting data
    public void enqueue(int value){
        if(rear==null){
            front=rear=new Node(value);
            size++;
        }
        else{
            rear.next= new Node(value);
            rear= rear.next;
            size++;
        }
    }

    //queue is empty
    public boolean isEmpty(){
        return size==0;
    }

    //removing element
    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("The queue is empty");
        }
        size--;
        int toBeRemoved=front.data;
        front=front.next;
        if(front==null){
            rear=null;
          }
       return toBeRemoved;
    }

//printing elements of  the queue
    public void print(){
        Node current=front;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main (String[] args) {
        QueueLinked a = new QueueLinked();
        a.enqueue(12);
        a.enqueue(2);
        a.enqueue(7);
        a.enqueue(27);
        a.enqueue(18);
        a.enqueue(80);
        //System.out.println(a.dequeue());
        a.print();

    }
}

package queueImplimentationUsingLinkedListAndArray;

public class QueueUsingArray {

    private int queueArray[];
    private int maxSize;
    private int front;
    private int rear;
    private int currentSize;

    public QueueUsingArray(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = -1;
        this.currentSize =0;
        this.queueArray = new int[maxSize];
    }
    //adding elements
    public void enqueue( int data){
        if(isQueueFull()) {
            throw new RuntimeException("Queue is Full!!");
        }
        //We have to wrap the queue in case maxSize has reached
        if(rear==maxSize-1){
            rear=-1;
        }
        queueArray[++rear]=data;
        System.out.println(data+" is added in Queue");
        currentSize++;
    }
    //removing elements
    public int dequeue(){
        if(isQueueEmpty()){
            throw new RuntimeException("Queue is empty!!");
        }
        int result = queueArray[front++];
        //We have to wrap the queue in case maxSize has reached
        if(front==maxSize){
            front =0;
        }
        currentSize--;
        return result;
    }

    private boolean isQueueFull () {
        return currentSize==maxSize;
    }
    private boolean isQueueEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }

    public static void main (String[] args) {
        QueueUsingArray queue =  new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("current queue size is :"+queue.size());
    }
}

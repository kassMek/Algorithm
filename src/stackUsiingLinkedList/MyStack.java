package stackUsiingLinkedList;

import java.util.EmptyStackException;

public class MyStack {

    private   Node top;
    private int size;

    public MyStack(){
        this.top=null;
        this.size=0;
    }


    //pushing elements in to the stack
    public   void push(int data){
         Node newNode=new Node(data);
         newNode.next=top;
         top=newNode;
         size++;
    }

    //removing elements from the stack
    public int pop() throws EmptyStackException {

        if(!isEmpty()){
            int temp=top.data;
            top=top.next;
            size--;
            return temp;

        }
        throw new EmptyStackException();
    }

    //peeking elements
    public int peek(){
        if(top==null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    //size
     public int size(){
        return size;
    }

    private boolean isEmpty() {
        return top==null;
    }

    public static void main(String[] args) {
        MyStack stack= new MyStack();
        stack.push(12);
        stack.push(7);
        stack.push(21);
        stack.push(3);
        stack.push(44);
        stack.pop();
      int picked=   stack.pop();
        System.out.println("the elements popped out is :"+picked);
        while(stack.top!=null){
            System.out.println(stack.top.data);
            stack.top=stack.top.next;
        }
        System.out.println("the size od the stack is :"+stack.size());


    }
}

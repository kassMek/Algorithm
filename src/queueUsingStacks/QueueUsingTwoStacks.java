package queueUsingStacks;

import java.util.Stack;

public class  QueueUsingTwoStacks  {

     private Stack<Integer> input= new Stack<Integer>();
     private Stack<Integer> output= new Stack<Integer>();

     public void enqueue( int val){
        input.push(val);
     }

     public int dequeue()  {

           if(output.isEmpty()) {
               if (input.isEmpty()) {
                   System.out.println("Input stack is empty");
               } else {
                   while (!input.isEmpty()) {
                       output.push(input.pop());
                   }
               }
           }

       return  output.pop();
     }

     public int peek(){
         if(output.isEmpty()) {
             if (input.isEmpty()) {
                 System.out.println("Input stack is empty");
             } else {
                 while (!input.isEmpty()) {
                     output.push(input.pop());
                 }
             }
         }

         return  output.peek();
     }

    public boolean empty() {
        if(input.isEmpty() && output.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main (String[] args) {

        QueueUsingTwoStacks qq= new QueueUsingTwoStacks();
        qq.enqueue(7);
        qq.enqueue(19);
        qq.enqueue(12);
        qq.enqueue(16);
        qq.enqueue(21);
        System.out.println("the dequeued element is:"+qq.dequeue());
        qq.enqueue(32);
        System.out.println("the dequeued element is:"+qq.dequeue());


    }
}

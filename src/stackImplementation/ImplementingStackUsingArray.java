package stackImplementation;

public class ImplementingStackUsingArray {


    private int arr[];
    private int top;
    private int capacity;


    ImplementingStackUsingArray( int size){
          this.arr= new int [size];
          this. capacity=size;
          this.top=-1;
    }


    public void  push( int item){
        if(isFull()){
         expand();
        }
        arr[++top]=item;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("The stack is empty");
        }
       return  arr[top--];
    }

  public boolean isEmpty(){
        return top==-1;
  }

  public boolean isFull(){
        return top==capacity-1;
  }

    // Utility function to return the size of the stack
    public int size()
    {
        return top + 1;
    }

    // Utility function to return the top element of the stack
    public int peek()
    {
        if (!isEmpty())
            return arr[top];
        else
            System.exit(1);

        return -1;
    }

    private void expand(){

        int length=size();
        int [] increasedArray= new int [capacity*2];
        System.arraycopy(arr,0,increasedArray,0,length);
        arr=increasedArray;
        capacity=capacity*2;
    }

    public void show(){
          for( int element:arr){
              System.out.print(element+" ");
          }
    }
    public static void main(String[] args) {

        ImplementingStackUsingArray stack = new ImplementingStackUsingArray(3);

        stack.push(1);      // inserting 1 in the stack
        stack.push(2);      // inserting 2 in the stack
        stack.push(8);
        stack.push(9);
        stack.show();
        System.out.println(" the size of the stuck is .."+stack.size());
//        stack.pop();        // removing the top element (2)
//        stack.pop();        // removing the top element (1)
//
//        stack.push(3);      // inserting 3 in the stack
//
//        System.out.println("The top element is " + stack.peek());
//        System.out.println("The stack size is " + stack.size());

    }

}

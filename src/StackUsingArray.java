public class StackUsingArray {

    private int []arr;
    private int top;
    private int capacity;

    StackUsingArray( int size){
        arr= new int[size];
        top=-1;
        capacity=size;
    }

    public void push( int  data){
          if(isFull()){
              throw new RuntimeException(" stack is full");
          }
         arr[++top]=data;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException(" stack is empty");
        }
      return arr[top--];
    }

     public int peek(){
        return arr[top];
     }

     boolean isFull(){
         return top==capacity-1;
     }

//     public void expand(){
//        int length=
//     }

     public boolean isEmpty(){
         return top==-1;
     }
    public static void main (String[] args) {

        StackUsingArray stk= new StackUsingArray(3);
        stk.push(2);
        stk.push(4);
        stk.push(47);
        //System.out.println(stk.size());
        //stk.push(19);
        System.out.println(stk.pop());

    }
}

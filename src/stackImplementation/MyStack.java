package stackImplementation;

public class MyStack {

    private int []arr;
    private int top;
    private int capacity;

    public MyStack (int size) {
        this.arr = new int[size];
        this.top = -1;
        this.capacity = size;
    }


    public void push(int data){
         if(isFull()){
            expand();
            }
        arr[++top]=data;

    }

    public int pop () {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int removedElement = arr[top--];
        return removedElement;

    }

    public boolean isFull () {
        return top == capacity - 1;
    }

    public void expand () {
        int length = size();
        int[] increasedArray = new int[capacity * 2];
        System.arraycopy(arr, 0, increasedArray, 0, length);
        arr = increasedArray;
        capacity = capacity * 2;
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int peek () {
        if (isEmpty()) {
            System.exit(1);
        }
        return arr[top];
    }

    public void printElements () {
        for (int rr : arr) {
            System.out.println("" + rr);
        }
    }
    public static void main (String[] args) {

        MyStack stk= new MyStack(3);
        stk.push(2);
        stk.push(4);
        stk.push(47);
        //System.out.println(stk.size());
         stk.push(19);
        //System.out.println(stk.size());
        System.out.println("removed:" +stk.pop());
        System.out.println(stk.size());
        System.out.println(" the top element is:"+stk.peek());
//        stk.push(65);
    }
}

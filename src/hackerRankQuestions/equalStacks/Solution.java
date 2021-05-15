package hackerRankQuestions.equalStacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;


/*
You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height.
You can change the height of a stack by removing and discarding its topmost cylinder any number of times.
Find the maximum possible height of the stacks such that all of the stacks are exactly the same height.
This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they are all the same height, then return the height.

5 3 4       h1[] size n1 = 5, h2[] size n2 = 3, h3[] size n3 = 4
3 2 1 1 1   h1 = [3, 2, 1, 1, 1]
4 3 2       h2 = [4, 3, 2]
1 1 4 1     h3 = [1, 1, 4, 1]
Function Description

Complete the equalStacks function in the editor below.

equalStacks has the following parameters:

int h1[n1]: the first array of heights
int h2[n2]: the second array of heights
int h3[n3]: the third array of heights

Sample Output:
5
 */

public class Solution {


    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here

        Stack<Integer> stck1= new Stack<>();
        Stack<Integer> stck2= new Stack<>();
        Stack<Integer> stck3= new Stack<>();
        int stk1_height=0;
        int stk2_height=0;
        int stk3_height=0;
        for(int i=h1.size()-1;i>=0;i--){
            stk1_height+=h1.get(i);
            stck1.push(stk1_height);
        }
        for(int i=h2.size()-1;i>=0;i--){
            stk2_height+=h2.get(i);
            stck2.push(stk2_height);
        }
        for(int i=h3.size()-1;i>=0;i--){
            stk3_height+=h3.get(i);
            stck3.push(stk3_height);
        }
        while(true){

            if(stck1.isEmpty() ||stck2.isEmpty()||stck3.isEmpty()){
                return 0;
            }
            stk1_height=stck1.peek();
            stk2_height=stck2.peek();
            stk3_height=stck3.peek();

            if(stk1_height==stk2_height && stk2_height==stk3_height){
                return stk1_height;
            }
            if(stk1_height>=stk2_height && stk1_height>=stk3_height){
                stck1.pop();
            }
            else if (stk2_height>=stk1_height && stk2_height>=stk3_height){
                stck2.pop();
            }
            else if(stk3_height>=stk1_height && stk3_height>=stk2_height){
                stck3.pop();
            }
        }
    }

    public static void main (String[] args) {
        Integer [] input1=new Integer []{3, 2, 1, 1, 1};

        List<Integer> list1= Arrays.asList(input1);
        Integer [] input2=new Integer []{4, 3, 2};
        List<Integer> list2= Arrays.asList(input1);

        Integer [] input3=new Integer []{1, 1, 4, 1};
        List<Integer> list3= Arrays.asList(input1);

        //System.out.println("the height is :"+equalStacks(input1,input2,input3));

        String[] names = {"Atta", "John", "Emma", "Tom"};
        List<String> list = Arrays.asList(names);

// print list elements
        System.out.println(list);
    }
}

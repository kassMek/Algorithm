package findingPairsOfNumbers;

public class twoSumSolutionReturningIndices {
    /*
    Given an array of integers numbers that is already sorted in ascending order,
    find two numbers such that they add up to a specific target number.
    Return the indices of the two numbers (1-indexed) as an integer array answer of size 2,
    where 1 <= answer[0] < answer[1] <= numbers.length.
  You may assume that each input would have exactly one solution and you may not use the same element twice
     */
    public static int[] twoSum(int[] numbers, int target) {
        int firstPointer=0;
        int lastPointer=numbers.length-1;
        int sum=0;
        while(firstPointer<=lastPointer && lastPointer>=0){
            sum=numbers[firstPointer]+numbers[lastPointer];
            if(sum<target){
                firstPointer++;
            }
            else if(sum>target){
                lastPointer--;
            }
            else if(sum==target){
               return new int[]{ firstPointer+1,lastPointer+1};
            }
        }
       return new int[]{};
    }
    public static void main (String[] args) {
   int [] input={2,7,11,15};
   int [] sec={2,3,4};
   int [] ans=twoSum(sec,6);
   for( int ss:ans){
       System.out.print(ss+"\t");
   }
    }
}

package hackerRankQuestions.diagonalDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9
The left-to-right diagonal = 1+5+9=15.
The right to left diagonal =3+5+9=17 . Their absolute difference is:|15-17|=2
Function description

Complete the diagonalDifference  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return
int: the absolute diagonal difference
 */
public class Solution {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int left_digonalSum=0;
        int right_diagonalSum=0;

        Integer[][] myArr= new Integer[arr.size()][arr.size()];

        for(int i=0;i<arr.size();i++){
            arr.get(i).toArray(myArr[i]);
        }
        int n=myArr.length;
        for( int i=0;i<n;i++){
            left_digonalSum+=myArr[i][i];
            right_diagonalSum+=myArr[i][n-1-i];
        }

        return Math.abs(left_digonalSum-right_diagonalSum);
    }

    public static void main (String[] args) {
        List<List<Integer>> arr= new ArrayList<>();
        List<Integer>list1= Arrays.asList(new Integer[]{1,2,3});
        List<Integer>list2= Arrays.asList(new Integer[]{4,5,6});
        List<Integer>list3= Arrays.asList(new Integer[]{7,8,9});
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        System.out.println("Difference is :"+diagonalDifference(arr));

    }
}

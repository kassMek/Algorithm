package hackerRankQuestions.palindromeIndex;


/*
Given a string of lowercase letters in the range ascii[a-z],
determine the index of a character that can be removed to make the string a palindrome.
There may be more than one solution, but any will do. If the word is already a palindrome or there is no solution, return -1. Otherwise,
return the index of a character to remove.
Example:
s="bcbc"
Either remove 'b' at index 0 or 'c' at index 3.
Function Description:
Complete the palindromeIndex function in the editor below.

palindromeIndex has the following parameter(s):

string s: a string to analyze
Returns
int: the index of the character to remove or -1
 */
public class Solution {


    public static int palindromeIndex(String s) {
        // Write your code here
        int left=0;
        int right=s.length()-1;
        int indexToBeRemoved=-1;

        if(isPalindrome(s,left,right))
            return -1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                if(isPalindrome(s,left+1,right)){
                    indexToBeRemoved=left;
                }
                else if(isPalindrome(s,left,right-1)){
                    indexToBeRemoved=right;
                }
                break;
            }
            else{
                left++;
                right--;
            }

        }

        return indexToBeRemoved;
    }

    //helper function
    public static boolean isPalindrome( String s, int left, int right){

        while(left<right){

            if(s.charAt(left)!=s.charAt(right))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        String input="bcbc";
        System.out.println("index is :"+palindromeIndex(input));
    }
}

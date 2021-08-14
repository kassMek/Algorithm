package reverseSubStringInParenthesisLeetcode1190;


import java.util.Stack;

/*
You are given a string s that consists of lower case English letters and brackets.
Reverse the strings in each pair of matching parentheses, starting from the innermost one.
Your result should not contain any brackets.
Example 1:
Input: s = "(abcd)"
Output: "dcba"
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

For inputString = "(bar)", the output should be
  reverseInParentheses(inputString) = "rab";

  For inputString = "foo(bar)baz", the output should be
  reverseInParentheses(inputString) = "foorabbaz";

  For inputString = "foo(bar)baz(blim)", the output should be
  reverseInParentheses(inputString) = "foorabbazmilb";

  For inputString = "foo(bar(baz))blim", the output should be
  reverseInParentheses(inputString) = "foobazrabblim".

 */
public class ReverseInParenthesis {

    public static String reverseInParentheses(String str){

           if(str==null){
               return null;
           }
        Stack<String> stringCount= new Stack<>();
        String res="";
        int index=0;
        while(index<str.length()){

            if(str.charAt(index)=='('){
                stringCount.push(res);
                res="";
                index++;
            }

            else if(str.charAt(index)==')'){
                StringBuilder builder = new StringBuilder(stringCount.pop());
                builder.append(reverseString(res));
                res=builder.toString();
                index++;
            }

            else{
                res+=str.charAt(index);
                index++;
            }
        }
        return res;
    }

    public static String reverseString(String ss){
        char[] charArray=ss.toCharArray();
        int start=0;
        int end=ss.length()-1;
        while(start<end){
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }

        return String.valueOf(charArray);
    }
    public static void main (String[] args) {

        String input = "foo(bar)baz";
        String input2="foo(bar)baz(blim)";

        String input3="foo(bar(baz))blim";
        System.out.println(reverseInParentheses(input3));
    }
}

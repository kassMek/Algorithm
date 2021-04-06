package parenthesisMatching;

import java.util.Stack;

public class Parenthesis {

     public static boolean isMatched( String str){

         Stack<Character> stk= new Stack<>();
         int len=str.length();
         if(str==null){
             return false;
         }
         for(int i=0;i<len;i++){

             char ch=str.charAt(i);
             if( ch=='[' || ch=='{' ||  ch=='('){
                 stk.push(ch);
             }
             if(ch==']' || ch=='}' ||  ch==')' ){
                 if(stk.isEmpty()){
                     return false;
                 }
                 else{
                     char top=stk.peek();
                     if( top=='[' && ch==']' || top=='{' && ch=='}' || top=='(' && ch==')'){
                         stk.pop();
                     }
                     else{
                         return false;
                     }


                 }


             }

         }


           return stk.isEmpty();
     }
    public static void main(String[] args) {

        char exp[] = {'{','(',')','}','[',']',')'};
        String fufu =new String(exp);
        System.out.println(fufu);
        System.out.println(isMatched(fufu));

    }
}

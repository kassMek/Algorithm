package palendromSubstring;

public class CountingPalindromeSubString {
    public  static int countSubstrings(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int count = 0;
        for (int i=0; i < s.length()-1; i++) {
            count += countSubString(s,i,i+1); //evens
            count += countSubString(s, i, i); //odds

           }
        return count+1;// for last letter
    }


    private static  int countSubString( String s,int left, int right) {
        int res = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            res++;
            left--;
            right++;
        }
        return res;
    }
    public static void main (String[] args) {

        String input="aaa";
        String str="12321";
        System.out.println(countSubstrings(str));

    }
}

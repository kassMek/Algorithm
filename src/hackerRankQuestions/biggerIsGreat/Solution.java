package hackerRankQuestions.biggerIsGreat;

import java.util.Arrays;

public class Solution {
    static String biggerIsGreater (String w) {
        char charArray[] = w.toCharArray();
        int n = charArray.length;
        int endIndex = 0;
        for (endIndex = w.length() - 1; endIndex >0; endIndex--) {
            if (charArray[endIndex] > charArray[endIndex - 1]) {
                break;
            }
        }
        if (endIndex == 0) {
            return "no answer";
        } else {
            int first_smallest = endIndex - 1;
            int next_smallest = endIndex;


            for (int i = endIndex + 1; i < w.length(); i++) {
                if (charArray[i] > charArray[first_smallest] && charArray[i] < charArray[next_smallest]) {
                    next_smallest = i;
                }
            }
            // step-3) Swap the above found next smallest character with charArray[endIndex - 1]
            swap(charArray, endIndex - 1, next_smallest);

            // step-4) Sort the charArray after (endIndex - 1)in ascending order
            Arrays.sort(charArray, endIndex, n);
        }

        return new String (charArray);
    }

    static void swap (char charArray[], int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    public static void main (String[] args) {

        String input="bb";
        System.out.println("next new String is :"+biggerIsGreater("dkhc"));
    }
}
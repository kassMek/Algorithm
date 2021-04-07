package coinChangeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DP_CoinChange {

    /*You are given coins of different denominations and a total amount of money amount.
    Write a function to compute the fewest number of coins that you need to make up that amount.
    If that amount of money cannot be made up by any combination of the coins, return -1.
    You may assume that you have an infinite number of each kind of coin.
     */

    //approach 1
  public  static int countWays(int[] coins, int targetCoinChange) {
        int[] wayOfCoinChanges = new int[targetCoinChange+1];

        wayOfCoinChanges[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= targetCoinChange; j++) {
                wayOfCoinChanges[j] += wayOfCoinChanges[j - coins[i]];
            }
            System.out.println(Arrays.toString(wayOfCoinChanges));
        }

        return wayOfCoinChanges[targetCoinChange];
    }



    //approach 2
    public static int OptimumCoinChange(int[] coins, int amount) {

        int dp[]= new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for( int i=1;i<=amount;i++){
            for( int coin:coins){
                if(i>=coin){
                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }

        return (dp[amount]==Integer.MAX_VALUE?-1:dp[amount]);
    }

    //approach 3
//
//    public static int coinChange(int[] coins, int amount) {
//        int[][]arr= new int [coins.length][amount+1];
//         for( int i=0;i<coins.length;i++){
//             arr[i][0]=0;
//         }
//
//         for( int i=1;i<coins.length;i++){
//             for(int j=0;j<=amount;j++){
//                 if(coins[i] <= j){
//                     // Choosing the better of the two options:
//                     arr[i][j] = Math.min(1 + arr[i][j - coins[i]], arr[i - 1][j]);
//                 }
//                 else{
//                     // Ignore the highest possible coin:
//                     arr[i][j] = arr[i - 1][j];
//                 }
//             }
//         }
//
//          return arr[coins.length-1][amount];
//    }

    public static void main(String[] args) {

        int [] input={1,2,5};
        //System.out.println(coinChange(new int[]{1,3,4,5}, 7));

        System.out.println("The minimum amount of coin is :"+OptimumCoinChange(input,11));
        //System.out.println("possible combination using approach :"+coinChange(input,11));
    }
}

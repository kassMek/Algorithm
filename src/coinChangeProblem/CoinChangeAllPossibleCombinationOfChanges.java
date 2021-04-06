package coinChangeProblem;

public class CoinChangeAllPossibleCombinationOfChanges {

 // method 1
    static int findAllWaysOfCombination(int[] coins, int sum) {

     int size=coins.length;

     int[][]arr= new int[size+1][sum+1];

      for(int i=0;i<=size;i++){
          arr[i][0]=1;
      }

        for( int i=1;i<=size;i++){
            for(int j=1;j<=sum;j++){
                if(j>=coins[i-1]){
                    arr[i][j]=arr[i-1][j]+arr[i][j-coins[i-1]];
                }
                else {
                    arr[i][j]=arr[i-1][j];
                }
            }
        }
        return arr[size][sum];
    }

    //method 2 ..finding all the possible combinations.

    public static int totalWaysOfCoinChange(int[] coins, int sum) {
        if(coins.length == 0 || sum <= 0) {
            return 0;
        }
        int numberOfCoins = coins.length;
        int[][] arr = new int[numberOfCoins][sum + 1];

        for(int i = 0; i < numberOfCoins; i++) {
            arr[i][0] = 1;
        }
        for(int i = 0; i < numberOfCoins; i++) {
            for(int j = 1; j <= sum; j++) {
                int includingCurrentCoin = 0;
                int excludingCurrentCoin = 0;

                if(coins[i] <= j) {
                    includingCurrentCoin = arr[i][j - coins[i]];
                }

                if(i > 0) {
                    excludingCurrentCoin = arr[i - 1][j];
                }

                arr[i][j] = includingCurrentCoin + excludingCurrentCoin;
            }
        }

        return arr[numberOfCoins - 1][sum];
    }
    public static void main(String[] args) {

  int [] input={2,3,5,10};
        System.out.println("the possible ways of combination are:" +totalWaysOfCoinChange(input,15));

    }
}

package twoDimensionalArray;

public class Main {

    public static void main(String[] args) {

        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {

                int temp = twoDArray[row][col];

                twoDArray[row][col] = twoDArray[col][row];
                twoDArray[col][row] = temp;
                //System.out.print("\t"+twoDArray[row][col]+"\t|");
            }
            // System.out.println();
        }
        //transposing 2D matrix
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print("\t" + twoDArray[i][j] + "\t|");
                            }
                   System.out.println();
        }

     }

}

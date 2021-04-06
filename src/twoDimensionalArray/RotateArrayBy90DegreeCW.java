package twoDimensionalArray;

public class RotateArrayBy90DegreeCW {

     public static int [][] rotateArray( int [][] matrix){
          int N=matrix.length;
         int [][]ans=matrix;
         //first step..transposing the matrix
         for( int i=0;i<N;i++){
             for( int j=i+1;j<N;j++){
                 int temp=ans[i][j];
                 ans[i][j]=ans[j][i];
                 ans[j][i]=temp;
             }
         }
  //second step swapping the first ans last column elements and move inward direction
         for( int m=0;m<N;m++){
             for( int k=0;k<(N/2);k++){
                 int temp=matrix[m][k];
                 matrix[m][k]=matrix[m][N-1-k];
                 matrix[m][N-1-k]=temp;
             }
         }

         return ans;
     }
    public static void main(String[] args) {
        int[][] twoDArray = {{1, 2, 3},
                              {4, 5, 6},
                              {7, 8, 9}};

        int[][] result=rotateArray(twoDArray);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print("\t" + result[i][j] + "\t|");
            }
            System.out.println();
        }

    }
}

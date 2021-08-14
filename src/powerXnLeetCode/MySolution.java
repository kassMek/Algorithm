package powerXnLeetCode;

public class MySolution {


    public double myPow(double x, int n) {
        long lg=Math.abs(n);
        double ans=helper(x,lg);
        if(n>0){
            return ans;
        }
        return 1/ans;

    }

    public double helper( double x, long n){
        if(n==0){
            return 1;
        }
        if(x==1){
            return x;
        }
        else if(n%2==0){
            double temp=helper(x,n/2);
            return temp*temp;
        }
        else{
            double temp2=helper(x,n/2);
            return x*temp2*temp2;
        }
    }
    public static void main (String[] args) {

    }
}

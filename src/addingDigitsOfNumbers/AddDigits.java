package addingDigitsOfNumbers;

public class AddDigits {

    static int addAllDigits( int num){

        int sum=0;
        int remainder=0;
        while( num>0){
            remainder=num%10;
            sum+=remainder;
            num=num/10;

        }
        return sum;
    }

    static int reverseDigits( int given){
        int remainder=0;

        while(given>0){
            remainder=remainder*10 +given%10;
            given=given/10;
        }
        return remainder;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigits(1694));
    }
}

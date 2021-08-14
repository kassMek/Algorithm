package summingDigitsInString;

public class GetSumOfDigits {

    public static int digitSum( String str){

        int sum=0;
        int intermediate=0;
        String initialValue="";

        for( int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            if(Character.isDigit(ch) || (ch=='-' && (i+1)<str.length() && Character.isDigit(str.charAt(i+1)))){

                initialValue+=ch;
            }
            else if(initialValue.length()>0){
                intermediate=Integer.parseInt(initialValue);
                sum+=intermediate;
               initialValue="";
            }
        }

        //return sum+Integer.parseInt(initialValue);
       return  initialValue.length()>=1?sum+Integer.parseInt(initialValue):sum;
    }

    public static void main(String[] args) {

        String input ="123hey";
        String myString="-12hello54man292";
        String kkt="123ab!-45c";

        System.out.println("The sum of integers in string is:"+digitSum(kkt));
        //System.out.println("after conversion :"+Integer.parseInt("-1234"));


    }
}

package summingDigitsInString;

public class ExtractingDigitsFromRnadomStringAndSum {

	/**
	 * Return the sum of all integers from a random string. Continuous Integers must be considered as one number. 
	 * Given the following inputs, we expect the corresponding output:
	 * 
	 * "1a2b3c"  ==>6 (1+2+3)
	 * "123ab!45c" ==> 168 (123+45)
	 * "abcdef" ==> 0 (no integers in String)
	 * "0123.4" ==> 127 (0123+4)
	 * "dFD$#23++++12@#T1234;/..10" => 1279 (23+12+1234+10)
	 * "12a-10b" => 2 (12-10)
	 */
	private static int SumOfNumbers (String str){

		  int sum=0;

		  String extracted="";

		  for( int i=0;i<str.length();i++) {
			  if( Character.isDigit(str.charAt(i)) || (str.charAt(i)=='-' && (i+1)<str.length() && Character.isDigit(str.charAt(i+1)))){
				  extracted+=str.charAt(i);
			  }
			  else {
				  if (extracted.length() > 0) {

					  sum += Integer.parseInt(extracted);
					  extracted = "";
				  }
			  }
		  }
		return extracted.length()>0? sum+Integer.parseInt(extracted):sum;
		  
	}
	
	public static void main(String[] args) {

  String test="1a2b3c";
  String kkt="-123ab!-45c7";
  System.out.println(SumOfNumbers(kkt));
  
        
	}

}

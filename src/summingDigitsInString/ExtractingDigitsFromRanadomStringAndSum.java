package summingDigitsInString;

public class ExtractingDigitsFromRanadomStringAndSum {

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
	private static int SumOfNumbers (String str) {
		if (str == null) {
			return 0;
		}
		String extracted = "";
		int sum = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) || (ch == '-' && (i + 1) < len && Character.isDigit(str.charAt(i + 1)))) {
				extracted += ch;
			} else if (extracted.length() > 0) {
				int intermediate = Integer.parseInt(extracted);
				sum += intermediate;
				extracted = "";
			}
		}
		return extracted.length() > 0 ? sum + Integer.parseInt(extracted) : sum;

	}
	
	public static void main(String[] args) {

		String test = "1a2b3c";
		String kkt = "123ab!-45c7";
		System.out.println("sum of digits is :" + SumOfNumbers(kkt));
  
        
	}

}

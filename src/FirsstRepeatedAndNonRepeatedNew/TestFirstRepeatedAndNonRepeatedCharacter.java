package FirsstRepeatedAndNonRepeatedNew;

import java.util.HashMap;

public class TestFirstRepeatedAndNonRepeatedCharacter {
	
	 static void firstRepeatedNonRepeatedChar(String inputString) {
		 
		 HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		 char[] strArray = inputString.toCharArray();
		   for( char cc:strArray) {
			      
			   if(!charCountMap.containsKey(cc)) {
				   charCountMap.put(cc,1);
			   }
			   else {
			   charCountMap.put(cc,charCountMap.get(cc)+1);
			   }
			   
		   }
		 
		   for( char ch1:strArray) {
			     if( charCountMap.get(ch1)==1) {
			    	   System.out.println("the first non repeated element is :"+ ch1);
			    	   break;
			     } 
		   }
		   
		   for( char ch2:strArray) {
			     if( charCountMap.get(ch2)>1) {
			    	  System.out.println(" the first repeated element  is :"+ ch2);
			    	  break;
			     }
		   }
		 
		 
	 }
	    
	
	
	public static void main(String[] args) {
		 String strrr="JavaConceptOfTheDay";
		 firstRepeatedNonRepeatedChar(strrr);
		 String lineOfCurrencies = "USD JPY AUD SGD HKD CAD CHF GBP EURO INR";
		 String[] currencies = lineOfCurrencies.split(" ");
		 //System.out.println(currencies[3]);

		 
	}

}

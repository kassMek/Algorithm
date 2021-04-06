package FibonacciUsingDynamicProgram;

import java.util.HashMap;

public class FiboUsingMemoization {
	
	
	
	public static int getFibonacciNumber(int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		 hm.put(0, 0);
		 hm.put(1,1);
		   for(int i=2;i<=n;i++) {
			   hm.put(i, hm.get(i - 1) + hm.get(i - 2));
		   }
		    return  hm.get(n);
		    
//		      if( n==0)
//		      	return 0;
//		      if(n<=2)
//		      	return 1;
//		      return getFibonacciNumber(n-1)+ getFibonacciNumber(n-2);
		      
	}

	public static void main(String[] args) {

		 for( int i=0;i<=10;i++)
		System.out.print(getFibonacciNumber(i)+" ");
	}

}

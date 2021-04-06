
package iteratorList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MySynch {

	public static void main(String[] args) {
		
		//creating synchronized collection
		//List<String> list=Collections.synchronizedList(new ArrayList<String>());
		List<String> list=new ArrayList<String>();
		list.add("Kassahun");
		list.add("Birhanu");
		list.add("Sefineh");
		list.add("Getaneh");
		list.add("Girma");
		  for( String kk:list) {
			  //System.out.println(kk);
			  //list.remove(2);
		  }
		 
		 // list.remove(2);
		
     //creating unmodifiable collections
		  
		  List<String>fruitList = new ArrayList<String>();  
		  
	        fruitList.add("Mango");  
	        fruitList.add("Banana");  
	        fruitList.add("Apple");  
	        fruitList.add("Strawberry");  
	        fruitList.add("Pineapple");  
	          
	      List<String> unmod= Collections.unmodifiableList(fruitList);
	        //unmod.add("Kassahun");
	      Iterator<String> iterator = unmod.iterator(); 
	      while(iterator.hasNext()) {
	    	   //System.out.println(iterator.next());
	      }
	      
	      
	      System.out.println("***********"); 
	      
	      //list iterator 
	      ListIterator lIterator = fruitList.listIterator(); 
	      
	      while (lIterator.hasNext()) {
	            //System.out.println(lIterator.next() + " "); 
	      }
	      
	      
	      
	      //concurrent map modification
	      Map<String, Integer> map = new HashMap<String, Integer>();
	      
          // Insert some sample key-value pairs.
          map.put("Key1", 1);
          map.put("Key2", 2);
          map.put("Key3", 3);
 
          /* Remove a value of the map, while iterating over it.
           * The following code throws a java.util.ConcurrentModificationException. */
          for(String key: map.keySet()) {
               if(map.get(key) == 1)
                    map.remove(key);
          }
          System.out.println("Successfully removed a pair!");

	}

}

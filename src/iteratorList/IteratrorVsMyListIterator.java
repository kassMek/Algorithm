package iteratorList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratrorVsMyListIterator {

	public static void main(String[] args) {
		
		 ArrayList<Integer> myList = new ArrayList<Integer>(); 

         myList.add(1); 
         myList.add(2); 
         myList.add(3); 
         myList.add(4); 
         myList.add(5); 
         
         
      // Iterator 
         Iterator i = myList.iterator(); 

         System.out.println(" Iterator Forward traversal: ");
   
         while (i.hasNext()) {
             System.out.print(i.next() + " "); 
         }
         System.out.println("\n*****");
         
       //iterator vs list iterator
         ListIterator<Integer> itr= myList.listIterator();

         System.out.println(" ListIterator forward Traversal : "); 
   
         //System.out.println("hello");
         while(itr.hasNext()) {
        	 //System.out.println("hello");
             Integer myInt=itr.next();
               if( myInt==4){
                   itr.remove();
               }
        	// System.out.print(itr.next() +" ");
        	 
         }
         
         System.out.println(); 
         
         System.out.println(" ListIterator back Traversal : "); 
         
         //System.out.println("hello");
         while(itr.hasPrevious()) {
        	 //System.out.println("hello");
        	 System.out.print(itr.previous()+" ");
        	 
         }
         
	}

}

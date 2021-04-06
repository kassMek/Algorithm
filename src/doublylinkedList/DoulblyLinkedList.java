package doublylinkedList;

public class DoulblyLinkedList{
	private Node head;
	private int size;
	
	public DoulblyLinkedList() {
		  head=null;
		  size=0; 
	}
  public boolean isEmpty() {
	   return head==null;
  }
  
  
  //add first
    public void addFirst( int data) {
    	//System.out.println("First hello");
    	  if( head==null) {
    		    head=new Node(null, data, null);
    	  }
    	  
    	  else {
    		    Node newNode=new Node( null, data,head);
    		      head.previous=newNode;
    		      head=newNode;
    	  }
    	   size++;
    }
    
    //add last
      public void addLast(int data ) {
    	  
    	   //System.out.println("hello add last");
    	  if( head==null) {
    		    Node newNode=new Node(null, data, null);
    		     head=newNode;
    	  }
    	  else {
    		   Node current= head;
    		   while( current.next!=null) {
    			     current=current.next;
    		          }
    		    Node newNode= new Node(current, data,null);
    		        current.next=newNode;
    	  }
    	   //size++;
      }
      
      //remove first
      
      public void removeFirst() {
    	    if( head==null) {
    	    	 return;
    	    }
    	    
    	    else {
    	    	  head=head.next;
    	    	  head.next.previous=null;
    	    }
    	    size--;
      }
      
      //remove last
        public void removeLast() {
        	   if(head==null) {
        		    return;
        	       }
        	   
        	     if(head.next==null) {
        	    	 head=null;
        	    	 size--;
        	    	 return;
        	     }
        	   else {
        		     Node current=head;
        		     while(current.next!=null) {
        		    	   current=current.next;
        		         }
        		       current.previous.next=null;
        		       current.previous=null;
        	   }
        	   size --;
        }
        
        //insert at specified index
          public void addSpecifiedIndex(int data, int index){
        	  
        	       if(head==null) {
        	    	     return;
        	       }
        	         if(index<1 ||index>size) {
        	        	 //System.out.println("please enter valid index number");
        	        	 return;
        	         }
        	         Node current=head;
        	         int i=1;
        	         while(i<index) {
        	        	 current=current.next;
        	        	 i++;
        	         }
        	         if(current.previous==null) {
        	        	 //add first
        	        	  Node newNode= new Node( null,data, current);
        	        	  current.previous= newNode;
        	        	  head=newNode;
        	        	
        	         }
        	         else {
        	        	 
        	        	 Node newNode= new Node( current.previous,data,current);
        	        	  current.previous.next=newNode;
        	        	  current.previous=newNode;
        	        	  
        	         }
        	         size++;
        	  
          }
          
           //delete node at specified location
            public void deleteNode( int index) {
            	  if(head==null) {
            		  return;
            	  }
            	if(index<1 ||index>size) {
            		 return;
            	}
		/*
		 * if(index==size) { removeLast(); }
		 */
            	Node current=head;
            	int i=1;
            	while(i<index) {
            		current=current.next;
            		i++;
            	}
            	 if(current.next==null) {
            		  current.previous.next=null;
            		  current.previous=null;
            	 }
            	 if(current.previous==null) {
            		  current=current.next;
            		  current.next.previous=null;
            		  head=current;
            	 }
            	 else {
            		 current.previous.next=current.next;
            		 current.next.previous=current.previous;
            	 }
            		 size--;
            	 
            }
          
     //printing elements of doubly linked list
       public void printElement() {
    	      Node current= head;
    	       while(current!=null) {
    	    	     System.out.println(current.getData());
    	    	     current=current.next;
    	       }
       }
       
       //Calculating size
         public int size() {
        	 int count = 1;
     		Node current = head;
     		while( current.next != null){
     			++count;
     			current = current.next;
     		}
     		return count;
         }
         
     	
         public int minimumNode() {  
             Node current = head;  
             int min;
             if(head == null) {  
                 System.out.println("List is empty");  
                 return 0;  
             }  
               
                 min = head.data;  
                 while(current.next!= null) {  
                	 current = current.next;  
                     if(min > current.data)  
                         min = current.data;  
                     
                 }  
               
             return min;  
         }  
  
  public static void main (String args[]) {
	  
	  DoulblyLinkedList ddl= new DoulblyLinkedList();
	    
	           ddl.addFirst(5);
		       ddl.addFirst(15);
		       ddl.addFirst(22); 
		       ddl.addFirst(66);
		    //ddl.addFirst(88);
	          //ddl.addLast(77);
	 
	         //ddl.removeFirst();
	   //ddl.removeFirst();
	    //ddl.removeLast();
	   ddl.addSpecifiedIndex(36,3);
	   //ddl.deleteNode(3);
	   ddl.printElement();
	  System.out.println("minumum value is:"+ddl.minimumNode());
	  
  }
}


public class DLinkedList {

	   Node head; 
	   
	    public void push(String new_data)
	    {

	        Node new_Node = new Node(new_data);
	 
	        new_Node.next = head;
	        new_Node.prev = null;
	 
	        if (head != null)
	            head.prev = new_Node;
	 
	       
	        head = new_Node;
	    }
	    static boolean search(Node head, String x)
	    {
	      
	      Node temp = head;
	       

	      //int pos = 0;
	       
		  System.out.println(temp.data + "  "  + x);
	      while (temp.data != x && temp.next != null)
	      {
	        //pos++;
	         
	        temp = temp.next;
	      }
		  
	      if (temp.data.toLowerCase() != x.toLowerCase()) {
	    	  return false;
	      }

	      
	      return true;
	      
	    }
	     
	 
	   
	   
	 
	    
	    void append(String new_data)
	    {
	        
	        Node new_node = new Node(new_data);
	 
	        Node last = head; 
	 
	        new_node.next = null;
	 
	        if (head == null) {
	            new_node.prev = null;
	            head = new_node;
	            return;
	        }
	 
	        while (last.next != null)
	            last = last.next;
	 
	        last.next = new_node;
	 
	        new_node.prev = last;
	    }
	 

	    public  void printlist(Node node)
	    {
			int properPrint = 1;
	       // System.out.println("\nTraversal in forward Direction \n");
      	        while (node != null) {	  
					if(properPrint%6 != 0 && node.next != null ){
						System.out.print(node.data + " - ");
					}
					else if(properPrint%6 == 0 || node.next ==null ){
						System.out.print(node.data);
						System.out.println("");
					}
					Node last = node;
					node = node.next;
	            	properPrint+=1;
	        }
	        System.out.println(" ");
	        /*
	        System.out.println();
	        System.out.println("\nTraversal in reverse direction \n");
	        while (last != null) {
	            System.out.print(last.data);
	            last = last.prev;
	            
	        }
	        */
}
}
